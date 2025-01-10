package ExceptionsExos;

import java.util.Scanner;

public class ExceptionsExoFour {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un entier. ");
        String txtUser = sc.nextLine();

        int num = 0;

        while (!txtUser.equals("")) {

            try {

                num = Integer.parseInt(txtUser);

            } catch (NumberFormatException e) {

                System.out.println("Votre saisie n'est pas numériqiue " + e.getMessage());

            }

            txtUser = sc.nextLine();

        }

    }
}
