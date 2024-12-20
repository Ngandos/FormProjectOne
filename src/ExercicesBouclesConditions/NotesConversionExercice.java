package ExercicesBouclesConditions;

import java.util.Scanner;

public class NotesConversionExercice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir une note : ");

        int note = scanner.nextInt();

        if (note >= 16 && note <= 20 ) {

            System.out.println("Très bien");

        } else if (note >= 12 && note <= 15) {

            System.out.println("Bien");
            
        } else if (note >= 10 && note <= 11) {

            System.out.println("Passable");
            
        } else if (note <= 10) {

            System.out.println("insuffisant");

        }
    }
}
