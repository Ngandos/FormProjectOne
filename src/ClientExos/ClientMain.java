package ClientExos;

import ClientExos.Client;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Liste des clients avec des codes clients initiaux

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("REF_100", "Jean Dupont", "jd@gmail.com", "0626154875"));
        clients.add(new Client("REF_101", "Thomas Lefèvre", "tl@gmail.com", "0642758696"));
        clients.add(new Client("REF_102", "Alexandra Dubois", "ad@gmail.com", "0612302458"));
        clients.add(new Client("REF_103", "École Pignon", "ep@gmail.com", "069547810"));

        int codeClientCourant = 104;

        boolean quitter = false;
        while (!quitter) {
            System.out.println("\n****************************");
            System.out.println("*            Menu          *");
            System.out.println("****************************");
            System.out.println("*   1 - Afficher Clients   *");
            System.out.println("*   2 - Ajouter Client     *");
            System.out.println("*   3 - Supprimer Client   *");
            System.out.println("*   4 - Quitter            *");
            System.out.println("****************************");

            System.out.print("\nChoisissez une option : ");
            System.out.println();

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante

            switch (choix) {
                case 1:
                    // Afficher tous les clients
                    System.out.println("\nListe des Clients enregistrés :");
                    System.out.println();
                    for (Client client : clients) {
                        System.out.println(client);
                    }
                    break;

                case 2:
                    // Ajouter un client
                    System.out.print("Nom du client : ");
                    System.out.println();
                    String nom = scanner.nextLine();

                    System.out.print("Email du client : ");
                    String email = scanner.nextLine();

                    System.out.print("Téléphone du client : ");
                    String telephone = scanner.nextLine();

                    String nouveauCodeClient = "REF_" + codeClientCourant++;
                    clients.add(new Client(nouveauCodeClient, nom, email, telephone));
                    System.out.println("Client ajouté avec succès avec le code client : " + nouveauCodeClient);
                    break;

                case 3:
                    // Supprimer un client par code client

                    System.out.print("Entrez le code client à supprimer : ");
                    System.out.println();
                    String codeASupprimer = scanner.nextLine();

                    boolean supprime = clients.removeIf(client -> client.getCodeClient().equals(codeASupprimer));

                    if (supprime) {

                        System.out.println("Client supprimé avec succès.");

                    } else {

                        System.out.println("Client introuvable.");
                    }
                    break;

                case 4:
                    // Quitter le programme

                    System.out.println("Au revoir !");

                    quitter = true;

                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
        scanner.close();
    }
}