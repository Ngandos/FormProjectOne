package ArrayExo;

import java.util.ArrayList;
import java.util.Scanner;

public class ListArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez votre prenom : ");

        System.out.println();

        String prenom = scanner.next();

        System.out.println();

        System.out.println("Bonjour " + prenom + ", bienvenue dans le terminal simulé ! entrez Help pour voir les commandes disponibles");

        System.out.println();

        ArrayList<String> TodoList = new ArrayList<>();

        boolean continuer = true;

        do {

            System.out.println("Ajouter une tache");

            System.out.println();

            String tache = scanner.nextLine();

            TodoList.add(tache);

            System.out.println(TodoList);

            System.out.println();

        } while (continuer);

    }
}
