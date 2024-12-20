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

        if (nbr1 > nbr2 && nbr1 > nbr3) {

            System.out.println("la plus grande valeur de votre saisie est : " + nbr1);

        } else if (nbr2 > nbr1 && nbr2 > nbr3) {

            System.out.println("La plus grande valur de vos saisies est : " + nbr2);

        } else {

            System.out.println("La plus grande valur de vos saisies est : " + nbr3);
        }
    }
}
