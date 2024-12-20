package ExercicesBouclesConditions;

import java.util.Scanner;

public class BissextileYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir une année : ");

        int annee = scanner.nextInt();

        if (annee %4 == 0 && annee %400 != 0 && annee %100 != 0) {

            System.out.println("l'année " + annee + " est une année bissextile");

        } else {

            System.out.println("l'année " + annee + " n'est pas une année bissextile");

        }

    }
}
