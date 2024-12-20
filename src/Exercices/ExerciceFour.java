package Exercices;

import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciceFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre nom : ");

        String nom = scanner.nextLine();

        System.out.println("Entrez votre prenom");

        String prenom = scanner.nextLine();

        System.out.println("Hi" +  " " + prenom  + " " +  nom  + "!");


    }
}
