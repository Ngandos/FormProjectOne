package LinkFilesInterfacesExos.ScoreManager;

import LinkFilesInterfacesExos.NotesBookExos2.ContactSimple;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ScoreManagerMain {

    public static void main(String[] args) {


        ArrayList<ScoreManagerFile> sM = new ArrayList<>();
        sM.add(new ScoreManagerFile(1, "Ngando", 55));
        sM.add(new ScoreManagerFile(2, "Kimia", 75));
        sM.add(new ScoreManagerFile(3, "Nzola", 100));

        String filePath = "/Users/ngandos/GitHub/FormProjectOne/src/LinkFilesInterfacesExos/CreatedFiles/Scores.txt";

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(filePath))) {

            //.........................................Écrire les scores

            bf.write("Scores :\n");

            for (ScoreManagerFile sMs : sM) {

                bf.write(sM.toString() + "\n");

            }

            System.out.println();

            System.out.println("Fichier écrit avec succès." );

        } catch (IOException e) {

            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());

        }
    }
}
