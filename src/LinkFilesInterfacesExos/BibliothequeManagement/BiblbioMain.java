package LinkFilesInterfacesExos.BibliothequeManagement;

import LinkFilesInterfacesExos.EmployersExo1.EmployesTempPartiel;
import LinkFilesInterfacesExos.JournalisationErreurs.FileLogger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BiblbioMain {

    public static void main(String[] args) {


        ArrayList<LivrePhysique> livres = new ArrayList<>();
        livres.add(new LivrePhysique(1, "Le tartuffe", "Jean Baptiste Poquelin (Molière)", false));
        livres.add(new LivrePhysique(2, "Les fourberies de scapin", "Jean Baptiste Poquelin (Molière)",false));
        livres.add(new LivrePhysique(3, "Bleach", "Tite Kubo)", false));
        livres.add(new LivrePhysique(4, "L'art de la guerre", "Sun-Tzu", false));

        ArrayList<LivreNumerique> Nlivres = new ArrayList<>();
        Nlivres.add(new LivreNumerique(1, "Tom Sawyer", "Mark Twain", true));
        Nlivres.add(new LivreNumerique(2, "Fleurs du mal", "Charles Beaudelaire", true));

        String filePath = "/Users/ngandos/GitHub/FormProjectOne/src/LinkFilesInterfacesExos/CreatedFiles/Bibliotheque.txt";

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(filePath))) {

            //.........................................Écrire les Livres

            bf.write("Livres Physiques :\n");

            for (LivrePhysique livre : livres) {

                bf.write(livre.toString() + "\n");

            }

            //.......................................Ecrire Livres numérique

            bf.write("\nLivres Numériques :\n");

            for (LivreNumerique Nlivre : Nlivres) {

                bf.write(Nlivre.toString() + "\n");
            }

            bf.close();

            System.out.println();

            System.out.println("Fichier écrit avec succès." );

        } catch (IOException e) {

            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());

        }

    }
}
