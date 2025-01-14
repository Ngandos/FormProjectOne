package ExercicesBouclesConditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String choix;

        do {

            System.out.println("Entrez le premier nombre : ");
            int nombre1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Entrez le deuxième nombre : ");
            int nombre2 = scanner.nextInt();
            scanner.nextLine();

            int resultat = nombre1 * nombre2;

            System.out.println("Le resultat de la multiplication est :" + resultat);
            scanner.nextLine();

            System.out.println("Voulez vous recommencer ? (oui/non) : ");
            scanner.nextLine();

            choix = scanner.nextLine();

        } while (choix.equalsIgnoreCase("oui"));

        System.out.println("Merci d'avoir utilisé le progrmame");

        scanner.close();

    }
}
