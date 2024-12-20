package ExercicesBouclesConditions;

import java.util.Scanner;

public class NumbersSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisisez un nombre : ");

        int nombre = scanner.nextInt();

        if (nombre < 0) {

            System.out.println("Entrez un nombre positif");

        } else {

            int somme = 0;

            int i = 1;

            while (i <= nombre) {

                somme += i;

                i++;

            }

            System.out.println("La somme des entiers de 1 à " + nombre + " est : " + somme);

        }

        scanner.close();

    }
}
