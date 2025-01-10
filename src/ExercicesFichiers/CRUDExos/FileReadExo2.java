package ExercicesFichiers.CRUDExos;

import java.io.*;

public class FileReadExo2 {

    public static void main(String[] args) {

        //.........................................Writer...............................................................

        try {

            FileWriter fW = new FileWriter("/Users/ngandos/GitHub/FormProjectOne/src/ExercicesFichiers/CreatedFiles/data.txt");

            BufferedWriter bf = new BufferedWriter(fW);

            bf.write("Ngando");
            bf.newLine();
            bf.write("Nguma");
            bf.newLine();
            bf.write("Ngumos");

            bf.close();

        } catch (
                IOException e) {

            System.out.println(e.getMessage());

        }

        //.....................................Reader...................................................................

        try {

            FileReader fR = new FileReader("/Users/ngandos/GitHub/FormProjectOne/src/ExercicesFichiers/CreatedFiles/data.txt");

            BufferedReader bR = new BufferedReader(fR);

            while (bR.ready()){

                System.out.println(bR.readLine());

            }

            bR.close();

        } catch (
                IOException e) {

            System.out.println(e.getMessage());

        }

    }
}
