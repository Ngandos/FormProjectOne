package ExceptionsExos;

import java.util.Scanner;

public class ExceptionsExoTwoo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int TabChiffre[];
        TabChiffre = new int[5];

        TabChiffre[0] = 10;
        TabChiffre[1] = 25;
        TabChiffre[2] = 60;
        TabChiffre[3] = 34;
        TabChiffre[4] = 98;

        try {

            System.out.println("Bienvenue dans l'utilitaire de mappage tableau ! ");
            System.out.println();
            System.out.println("Saisissez un indice du tableau : ");
            int nbr = sc.nextInt();
            System.out.println();
            System.out.println(TabChiffre[nbr]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("L'indice saisi n'existe pas ! ");

        } finally {

            sc.close();

        }

    }

}
