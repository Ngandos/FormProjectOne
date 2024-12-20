package Exercices;

import java.util.Scanner;

public class AgeConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votrez année de naissance : ");

        int UserBirthDate = scanner.nextInt();

        int currentDate = 2024;

        int userAge =  currentDate - UserBirthDate;

        System.out.println("Vous êtes agé(e) de : " + userAge + " ans");
    }
}
