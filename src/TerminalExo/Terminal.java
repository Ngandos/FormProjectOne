package TerminalExo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        command.add("history");
        command.add("HistoClear");
        command.add("exit");

        ArrayList<String> operation = new ArrayList<>();
        operation.add("+");
        operation.add("-");
        operation.add("*");
        operation.add("/");

        ArrayList<String> todolist = new ArrayList<>();

        ArrayList<String> todoMenu = new ArrayList<>();
        todoMenu.add("TodoHelp");
        todoMenu.add("add");
        todoMenu.add("remove");
        todoMenu.add("display");
        todoMenu.add("end");

        ArrayList<String> commandList = new ArrayList<>();

        boolean continuer = true;

        do {

            System.out.println();

            System.out.println("Saisir une commande : ");

            System.out.println();

            String saisi = scanner.next();

            commandList.add(saisi);

            if (saisi.equals("help")) {

                System.out.println("---------- Commandes List ----------");
                System.out.println();
                System.out.println("help");
                System.out.println();
                System.out.println("time");
                System.out.println();
                System.out.println("math");
                System.out.println();
                System.out.println("random");
                System.out.println();
                System.out.println("clear");
                System.out.println();
                System.out.println("history");
                System.out.println();
                System.out.println("clearHisto");
                System.out.println();
                System.out.println("exit");
                System.out.println();
                System.out.println("---------- Commandes List ----------");

            } else if (saisi.equals("math")) {

                System.out.println();

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

                    System.out.println();

                    System.out.println("entrez le premier nombre1 : ");

                    System.out.println();

                    int nombre1 = scanner.nextInt();

                    System.out.println();

                    System.out.println("Entrez le segond nombre2 : ");

                    System.out.println();

                    int nombre2 = scanner.nextInt();

                    int nbr3 = nombre1 * nombre2;

                    System.out.println();

                    System.out.println("Le resultat de votre operation est : " + nbr3 );

                } else if (saisie.equals("/")) {

                    System.out.println();

                    System.out.println("entrez le premier nombre1 : ");

                    System.out.println();

                    int nombre1 = scanner.nextInt();

                    System.out.println();

                    System.out.println("Entrez le segond nombre2 : ");

                    System.out.println();

                    int nombre2 = scanner.nextInt();

                    int nbr3 = nombre1 / nombre2;

                    System.out.println();

                    System.out.println("Le resultat de votre operation est : " + nbr3 );

                }

            } else if (saisi.equals("random")) {

                System.out.println();

            } else if (saisi.equals("todo")) {

                boolean continu = true;

                do {

                    System.out.println();

                    System.out.println("Que voulez vous faire ? : ");

                    System.out.println();

                    String todoCommand = scanner.next();

                    commandList.add("todo " + todoCommand);

                    if (todoCommand.equals("display")) {

                        System.out.println();

                        System.out.println("Tâches : " + todolist);

                    } else if (todoCommand.equals("todoHelp")) {

                        System.out.println();

                        System.out.println(todoMenu);

                    } else if (todoCommand.equals("add")) {

                        System.out.println();

                        System.out.println("Ajouter une tâche : ");

                        System.out.println();

                        String tache = scanner.next();

                        todolist.add(tache);

                        System.out.println();

                        System.out.println("Tâche ajoutée : " + tache);

                    } else if (todoCommand.equals("remove")) {

                        System.out.println();

                        System.out.println("Supprimer une tâche");

                        System.out.println();

                        System.out.println("Entrez le nom de la tâche à supprimer : ");

                        System.out.println();

                        String tacheASupprimer = scanner.next();

                        if (todolist.contains(tacheASupprimer)) {

                            todolist.remove(tacheASupprimer);

                            System.out.println();

                            System.out.println("Tâche supprimée avec succés ! : " + tacheASupprimer);

                            System.out.println();

                        } else {

                            System.out.println("Tâche introuvable.");
                            
                        }

                        System.out.println("Tâches restantes : " + todolist);

                    } else if (todoCommand.equals("end")) {

                        System.out.println();

                        System.out.println("Vous quittez le menu todo");

                        continu = false;

                    } else {

                        System.out.println("Commande invalide tappez todo pour voir la liste des commande ");

                    }

                } while (continu);

            } else if (saisi.equals("time")) {

                System.out.println();

                LocalDateTime now = LocalDateTime.now();

                // Définir un format pour la date et l'heure
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

                // Formater la date et l'heure
                String formattedDateTime = now.format(formatter);

                // Afficher la date et l'heure formatées
                System.out.println("Date et heure actuelles formatées : " + formattedDateTime);

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

            } else if (saisi.equals("history")) {

                System.out.println();

                System.out.println("historique des commandes : ");

                System.out.println();

                for (String cmd : commandList) {

                    System.out.println(cmd);

                }

            } else if (saisi.equals("clearHisto")) {

                System.out.println();

                commandList.clear();

                System.out.println("Historique des commandes supprimée !");

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
