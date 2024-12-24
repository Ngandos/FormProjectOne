package TerminalExo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez votre prenom : ");

        System.out.println();

        String prenom = scanner.next();

        System.out.println();

        System.out.println("Bonjour " + prenom + ", bienvenue dans le terminal simulé ! entrez Help pour voir les commandes disponibles");

        ArrayList<String> command = new ArrayList<>();
        command.add("help");
        command.add("time");
        command.add("math");
        command.add("todo");
        command.add("clear");
        command.add("exit");

        ArrayList<String> operation = new ArrayList<>();
        operation.add("+");
        operation.add("-");
        operation.add("*");
        operation.add("/");

        ArrayList<String> todolist = new ArrayList<>();

        ArrayList<String> todoMenu = new ArrayList<>();
        todoMenu.add("add");
        todoMenu.add("remove");
        todoMenu.add("display");
        todoMenu.add("end");

        ArrayList<String> commandList = new ArrayList<>();

        boolean continuer = true;

        boolean continu = true;

        do {

            System.out.println();

            System.out.println("Saisir une commande : ");

            System.out.println();

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

                System.out.println();

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

            } else if (saisi.equals("todo")) {

                do {

                    System.out.println();

                    System.out.println("Que voulez vous faire ? :");

                    System.out.println();

                    saisi = scanner.next();

                    if (saisi.equals("display")) {

                        System.out.println();

                        System.out.println(todolist);

                    } else if (saisi.equals("add")) {

                        System.out.println();

                        System.out.println("Ajouter une tache :");

                        System.out.println();

                        String tache = scanner.next();

                        todolist.add(tache);

                        System.out.println();

                        System.out.println(todolist);

                    } else if (saisi.equals("remove")) {

                        System.out.println();

                        System.out.println("Supprimer une tâche");

                        System.out.println();

                        System.out.println("Entrez le nom de la tâche à supprimer : ");

                        System.out.println();

                        String tacheASupprimer = scanner.next();

                        if (todolist.contains(tacheASupprimer)) {

                            todolist.remove(tacheASupprimer);

                            System.out.println();

                            System.out.println("Tâche supprimée avec succés !");

                            System.out.println();

                        } else {

                            System.out.println("Aucune tâche trouvé avec cette chaine de caractères");
                            
                        }

                        System.out.println("Tâches restantes : " + todolist);

                    } else if (saisi.equals("end")) {

                        System.out.println();

                        System.out.println("Vous quittez le menu todo");

                        continu = false;

                    } else {

                        System.out.println("Commande invalide tappez todo pour voir la liste des commande ");

                    }

                } while (continu);

            } else if (saisi.equals("time")) {

                System.out.println();

                System.out.println(LocalDateTime.now());

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

                System.out.println();

                System.out.println("Au revoir...");

                scanner.close();

                continuer = false;

            } else {

                System.out.println();

                System.out.println("Commande invalide, tappez help pour voir la liste des commandes : ");

            }

        } while (continuer) ;

    }

}
