package ExercicesBouclesConditions;

import java.util.Scanner;

public class IfElseExercice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre : ");

        int givenValue = scanner.nextInt();

        if (givenValue % 2 == 0) {

            System.out.println("Le nombre : " + givenValue + " est Pair");

        } else {

            System.out.println("Le nombre : " + givenValue + " est impair");
        }
    }
}
