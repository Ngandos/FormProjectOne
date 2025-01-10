package ExceptionsExos;

import java.util.Scanner;

public class ExceptionsExoOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nbr3 = 0;

        try {

            System.out.println("Binevenue dans l'utilitaire de Division !");
            System.out.println();
            System.out.println("Saisissez le premier nombre : ");
            int nbr1 = sc.nextInt();
            System.out.println();
            System.out.println("Saisissez le segond nombre : ");
            int nbr2 = sc.nextInt();

            nbr3 = nbr1 / nbr2;

        } catch (ArithmeticException e) {

            System.out.println("Division par zéro impossible !!");

        } finally {

            System.out.println("Le resultat de votre division est : " + nbr3);

        }
    }
}
