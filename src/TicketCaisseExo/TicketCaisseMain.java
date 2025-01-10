package TicketCaisseExo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketCaisseMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Liste prédéfinie d'ordinateurs portables

        List<Articles> ordinateursDisponibles = new ArrayList<>();
        ordinateursDisponibles.add(new Articles("Ordinateur HP", "HP001", 10, 799.99, 0.2, "HP", "Pavilion 15", "Intel i5, 8GB RAM, 256GB SSD"));
        ordinateursDisponibles.add(new Articles("MacBook Air", "MAC001", 5, 999.99, 0.2, "Apple", "Air M1", "Apple M1, 8GB RAM, 256GB SSD"));
        ordinateursDisponibles.add(new Articles("Dell Inspiron", "DELL001", 8, 699.99, 0.2, "Dell", "Inspiron 14", "Intel i3, 8GB RAM, 512GB SSD"));
        ordinateursDisponibles.add(new Articles("Lenovo ThinkPad", "LEN001", 12, 899.99, 0.2, "Lenovo", "ThinkPad E14", "AMD Ryzen 5, 16GB RAM, 512GB SSD"));

        // Liste pour le ticket de caisse

        List<Articles> panier = new ArrayList<>();

        System.out.println("Bienvenue ! Voici les ordinateurs disponibles :");

        // Affichage des ordinateurs disponibles

        for (int i = 0; i < ordinateursDisponibles.size(); i++) {
            Articles ordi = ordinateursDisponibles.get(i);
            System.out.printf("%d. %s (Réf: %s, Prix HT: %.2f €)%n    Marque: %s, Modèle: %s, Specs: %s%n",
                    i + 1,
                    ordi.getDesignation(),
                    ordi.getRef(),
                    ordi.getPrixHT(),
                    ordi.getMarque(),
                    ordi.getModele(),
                    ordi.getSpecifications());
        }

        boolean continuer = true;

        while (continuer) {

            System.out.print("\nEntrez le numéro de l'ordinateur que vous souhaitez ajouter (ou 0 pour terminer) : ");

            int choix = Integer.parseInt(scanner.nextLine());

            if (choix == 0) {
                continuer = false;
                break;
            }

            if (choix < 1 || choix > ordinateursDisponibles.size()) {
                System.out.println("Choix invalide. Veuillez réessayer.");
                continue;
            }

            Articles ordinateurChoisi = ordinateursDisponibles.get(choix - 1);

            System.out.print("Entrez la quantité souhaitée : ");
            int quantite = Integer.parseInt(scanner.nextLine());

            if (quantite > ordinateurChoisi.getStock()) {

                System.out.println("Quantité demandée supérieure au stock disponible !");

            } else {
                // Déduire la quantité du stock disponible

                ordinateurChoisi.setStock(ordinateurChoisi.getStock() - quantite);

                // Ajouter au panier

                panier.add(new Articles(
                        ordinateurChoisi.getDesignation(),
                        ordinateurChoisi.getRef(),
                        quantite,
                        ordinateurChoisi.getPrixHT(),
                        ordinateurChoisi.getTva(),
                        ordinateurChoisi.getMarque(),
                        ordinateurChoisi.getModele(),
                        ordinateurChoisi.getSpecifications()
                ));
                System.out.println("Ordinateur ajouté au panier !");
            }
        }

        // Générer le ticket de caisse
        System.out.println("\n================== Ticket de Caisse ==================");
        double totalHT = 0;
        double totalTTC = 0;

        for (Articles ordinateur : panier) {
            System.out.printf("Ordinateur: %s, Réf: %s, Qté: %d, Prix HT: %.2f €, Prix TTC: %.2f €%n",
                    ordinateur.getDesignation(),
                    ordinateur.getRef(),
                    ordinateur.getStock(),
                    ordinateur.getPrixHT(),
                    ordinateur.getPrixHT() * (1 + ordinateur.getTva()));
            totalHT += ordinateur.getPrixHT() * ordinateur.getStock();
            totalTTC += ordinateur.getPrixHT() * (1 + ordinateur.getTva()) * ordinateur.getStock();
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Total HT : %.2f €%n", totalHT);
        System.out.printf("Total TTC : %.2f €%n", totalTTC);
        System.out.println("======================================================");

        scanner.close();
    }
}
