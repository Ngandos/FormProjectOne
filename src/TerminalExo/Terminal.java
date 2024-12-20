package TerminalExo;

import java.util.Scanner;

public class Terminal {

    private static Object LocalDateTime;

    public static void main(String[] args) {

        System.out.println("Bienvenue dans le terminal simulé ! entrez Help pour voir les commandes disponibles");

        String commandes[];

        commandes = new String[5];

        commandes[0] = new String("help");
        commandes[1] = new String("time");
        commandes[2] = new String("math");
        commandes[3] = new String("clear");
        commandes[4] = new String("exit");

        String operation[];

        operation = new String[4];

        operation[0] = new String("+");
        operation[1] = new String("-");
        operation[2] = new String("*");
        operation[3] = new String("/");

        boolean continuer = true;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Saisir une commande : ");

            String saisi = scanner.next();

            if (saisi.equals("help")) {

                System.out.println("---------- Commandes List ----------");
                System.out.println();
                System.out.println("help");
                System.out.println();
                System.out.println("time");
                System.out.println();
                System.out.println("math");
                System.out.println();
                System.out.println("clear");
                System.out.println();
                System.out.println("exit");
                System.out.println();
                System.out.println("---------- Commandes List ----------");

            } else if (saisi.equals("math")) {

                System.out.println("Quelle opération voulez vous réaliser ? :");

                String saisie = scanner.next();

                if (saisie.equals("+")) {

                    System.out.println("Entrez le premier nombre1 : ");

                    int nombre1 = scanner.nextInt();

                    System.out.println("Entrez le segond nombre2 : ");

                    int nombre2 = scanner.nextInt();

                    int nbr3 = nombre1 + nombre2;

                    System.out.println("Le resultat de votre operation est : " + nbr3 );

                } else if (saisie.equals("-")){

                    System.out.println("entrez le premier nombre1 : ");

                    int nombre1 = scanner.nextInt();

                    System.out.println("Entrez le segond nombre2 : ");

                    int nombre2 = scanner.nextInt();

                    int nbr3 = nombre1 - nombre2;

                    System.out.println("Le resultat de votre operation est : " + nbr3 );

                } else if (saisie.equals("*")) {

                    System.out.println("entrez le premier nombre1 : ");

                    int nombre1 = scanner.nextInt();

                    System.out.println("Entrez le segond nombre2 : ");

                    int nombre2 = scanner.nextInt();

                    int nbr3 = nombre1 * nombre2;

                    System.out.println("Le resultat de votre operation est : " + nbr3 );

                } else if (saisie.equals("/")) {

                    System.out.println("entrez le premier nombre1 : ");

                    int nombre1 = scanner.nextInt();

                    System.out.println("Entrez le segond nombre2 : ");

                    int nombre2 = scanner.nextInt();

                    int nbr3 = nombre1 / nombre2;

                    System.out.println("Le resultat de votre operation est : " + nbr3 );

                }

            } else if (saisi.equals("time")) {

                System.out.println();

            } else if (saisi.equals("clear")) {

                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();

            } else if (saisi.equals("exit")) {

                System.out.println("Au revoir...");

                scanner.close();

                continuer = false;

            } else {

                System.out.println("Commande invalide, tappez help pour voir la liste des commandes : ");

            }

        } while (continuer) ;

    }

}
