package ExercicesFichiers.StreamCountExo3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilesStreamOctetsCount3 {

    public static void main(String[] args) {

        int numberOfWords = 0;

        try {

            Scanner sc = new Scanner(new FileReader("/Users/ngandos/GitHub/FormProjectOne/src/ExercicesFichiers/CreatedFiles/data.txt"));

            while(sc.hasNext()) {

                System.out.println(sc.next());

                numberOfWords += 1;
            }

            System.out.println("The total number of words is: " + numberOfWords);

        } catch (IOException e){

            System.out.println(e.getMessage());

        }

    }
}
