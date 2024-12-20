package Exercices;

import java.util.Scanner;

public class AirCalcul {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer la longeur du rectangle :");

        int longueur = Integer.parseInt(scanner.nextLine());

        System.out.println("Entrez la largeur du rectangle :");

        int largeur  = Integer.parseInt(scanner.nextLine());

        int aire = (longueur * largeur);

        System.out.println("La valeur de l'aire de votre rectange ets égale a :" + aire );


    }

}
