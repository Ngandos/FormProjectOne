package ExceptionsExos;

import java.util.Scanner;

public class ExceptionsExoThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir une String ");
        String chaine = sc.nextLine();

        try {


            if(chaine.isEmpty()) {

                throw new IllegalArgumentException();

            }

        } catch (IllegalArgumentException e) {

            System.out.println("Erreur Argument, chaine vide :" + e.getMessage());

        }

    }



}
