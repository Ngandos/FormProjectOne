package ExercicesBouclesConditions;

import java.util.Scanner;

public class CountNumbChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez un nombre : ");

        int nombre = scanner.nextInt();

        if (nombre >= 0 && nombre <= 9 ) {

            System.out.println("votre nombre comprend 1 chiffres ! ");

        } else if (nombre >= 10 && nombre <= 99) {

            System.out.println("votre nombre comprend 2 chiffres ! ");

        } else if (nombre >= 100 && nombre <= 199) {

            System.out.println("votre nombre comprend 3 chiffres ! ");

        }
    }

}
