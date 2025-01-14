package LinkFilesInterfacesExos.BibliothequeManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BiblioReader {
    public static void main(String[] args) {

        try {

            FileReader fR = new FileReader("/Users/ngandos/GitHub/FormProjectOne/src/LinkFilesInterfacesExos/CreatedFiles/Bibliotheque.txt");

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
