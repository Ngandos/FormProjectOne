package LinkFilesInterfacesExos.JournalisationErreurs;

import LinkFilesInterfacesExos.ScoreManager.ScoreManagerFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileLoggerMain {

    public static void main(String[] args) {

        ArrayList<FileLogger> fl = new ArrayList<>();
        fl.add(new FileLogger(1, "Une erreur est survenue"));
        fl.add(new FileLogger(2, "Ecriture impossible"));
        fl.add(new FileLogger(3, "Fichier inexistant"));

        String filePath = "/Users/ngandos/GitHub/FormProjectOne/src/LinkFilesInterfacesExos/CreatedFiles/Errors.log";

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(filePath))) {

            //.........................................Écrire les scores

            bf.write("Scores :\n");

            for (FileLogger logs : fl) {

                bf.write(fl.toString() + "\n");

            }

            System.out.println();

            System.out.println("Fichier écrit avec succès." );

        } catch (IOException e) {

            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());

        }

    }
}
