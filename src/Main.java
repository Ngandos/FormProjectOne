import PooExos.Eleve;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Eleve> eleves = new ArrayList<>();

        System.out.println("Combien d'élèves souhaitez-vous enregistrer ?");
        int nombreEleves = scanner.nextInt();

        scanner.nextLine(); // Consomme la ligne restante

        for (int i = 0; i < nombreEleves; i++) {
            System.out.println("Saisissez les informations de l'élève " + (i + 1) + ":");
            System.out.println();

            System.out.print("Nom : ");
            String nom = scanner.nextLine();

            System.out.print("Prénom : ");
            String prenom = scanner.nextLine();

            System.out.print("Genre (Masculin/Feminin) : ");
            String genre = scanner.nextLine();

            System.out.print("Note : ");
            int note = scanner.nextInt();

            scanner.nextLine(); // Consomme la ligne restante

            Eleve eleve = new Eleve(nom, prenom, genre, note);
            eleves.add(eleve);

            System.out.println("Élève enregistré : " + eleve);
            System.out.println();
        }

        // Affichage de tous les élèves
        System.out.println("\nListe de tous les élèves enregistrés :\n");
        for (Eleve eleve : eleves) {
            System.out.println(eleve);
        }

        // Calcul de la moyenne générale des élèves
        double moyenne = calculerMoyenne(eleves);
        System.out.println("\nMoyenne générale des élèves : " + moyenne);
        System.out.println();

        // Trouver l'élève ayant la meilleure note
        Optional<Eleve> meilleurEleve = trouverMeilleurEleve(eleves);
        System.out.println("Meilleur élève : " + (meilleurEleve.isPresent() ? meilleurEleve.get() : "Aucun élève"));
        System.out.println();

        // Trouver l'élève ayant la moins bonne note
        Optional<Eleve> pireEleve = trouverPireEleve(eleves);
        System.out.println("Pire élève : " + (pireEleve.isPresent() ? pireEleve.get() : "Aucun élève"));
        System.out.println();

        // Déterminer le genre ayant la meilleure moyenne
        String meilleurGenre = determinerGenreMeilleureMoyenne(eleves);
        System.out.println("Genre ayant la meilleure moyenne : " + meilleurGenre);
        System.out.println();
    }

    // Méthode pour calculer la moyenne générale
    public static double calculerMoyenne(ArrayList<Eleve> eleves) {
        if (eleves.isEmpty()) {
            return 0.0;
        }
        int somme = eleves.stream().mapToInt(Eleve::getNote).sum();
        return (double) somme / eleves.size();
    }

    // Méthode pour trouver l'élève ayant la meilleure note
    public static Optional<Eleve> trouverMeilleurEleve(ArrayList<Eleve> eleves) {
        return eleves.stream().max(Comparator.comparingInt(Eleve::getNote));
    }

    // Méthode pour trouver l'élève ayant la moins bonne note
    public static Optional<Eleve> trouverPireEleve(ArrayList<Eleve> eleves) {
        return eleves.stream().min(Comparator.comparingInt(Eleve::getNote));
    }

    // Méthode pour déterminer le genre ayant la meilleure moyenne
    public static String determinerGenreMeilleureMoyenne(ArrayList<Eleve> eleves) {
        double moyenneMasculin = eleves.stream()
                .filter(eleve -> eleve.getGenre().equalsIgnoreCase("Masculin"))
                .mapToInt(Eleve::getNote)
                .average()
                .orElse(0.0);

        double moyenneFeminin = eleves.stream()
                .filter(eleve -> eleve.getGenre().equalsIgnoreCase("Feminin"))
                .mapToInt(Eleve::getNote)
                .average()
                .orElse(0.0);

        if (moyenneMasculin > moyenneFeminin) {

            return "Masculin";

        } else if (moyenneFeminin > moyenneMasculin) {

            return "Feminin";

        } else {

            return "Égalité entre Masculin et Féminin";
        }
    }
}
