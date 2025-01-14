package LinkFilesInterfacesExos.ScoreManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ScoreManagerReader {

    public static void main(String[] args) {

        //.....................................Reader...................................................................

        try {

            FileReader fR = new FileReader("/Users/ngandos/GitHub/FormProjectOne/src/LinkFilesInterfacesExos/CreatedFiles/Scores.txt");

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
