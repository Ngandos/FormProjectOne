package Exercices;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class ExerciceFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une valeur");

        int v1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Entrez une seconde valeur");

        int v2 = Integer.parseInt(scanner.nextLine());

        int v3 = ( v1 + v2 );

        System.out.println("La somme de vos valeurs vaut : " + v3 );

    }
}
