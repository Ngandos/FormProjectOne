package ExercicesBouclesConditions;

import java.util.Scanner;

public class ThreeNumbersMaxExercice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une Valeur nbr1 : ");

        int nbr1 = scanner.nextInt();

        System.out.println("Entrez une valeur nbr2 : ");

        int nbr2 = scanner.nextInt();

        System.out.println("Entrez une valeur nbr3 : ");

        int nbr3 = scanner.nextInt();

        int maxValue = Math.max(nbr1, Math.max(nbr2, nbr3));

        System.out.println("La plus grande valeur saisie est : " + maxValue);

        scanner.close();
    }

}
