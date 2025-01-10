package ExercicesFichiers.CRUDExos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateExo1 {

    public static void main(String[] args) {

        try {

            FileWriter fW = new FileWriter("/Users/ngandos/GitHub/FormProjectOne/src/ExercicesFichiers/CreatedFiles/output.txt");

            BufferedWriter bf = new BufferedWriter(fW);

            bf.write("Bonjour Monde");

            bf.close();

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

}
