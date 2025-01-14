package LinkFilesInterfacesExos.NotesBookExos2;

import LinkFilesInterfacesExos.EmployersExo1.EmployesTempPartiel;
import LinkFilesInterfacesExos.EmployersExo1.EmployesTempPlein;

import java.io.*;
import java.util.ArrayList;

public class NoteBookMain {

    public static void main(String[] args) {

        ArrayList<ContactSimple> contacts = new ArrayList<>();
        contacts.add(new ContactSimple(1, "Kimia", "07.94.32.45.55", "Rue de hrtemel 59000 Roubaix"));
        contacts.add(new ContactSimple(2, "Nzola", "07.89.46.34.21", "Rue de haven 59000 Roubaix"));
        contacts.add(new ContactSimple(3, "Ngando", "07.82.19.44.68", "Rue de haven 59000 Roubaix"));

        String filePath = "/Users/ngandos/GitHub/FormProjectOne/src/LinkFilesInterfacesExos/CreatedFiles/Contact.txt";

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(filePath))) {

            //.........................................Écrire les contacts

            bf.write("Contacts :\n");

            for (ContactSimple contact : contacts) {

                bf.write(contact.toString() + "\n");

            }

            System.out.println();

            System.out.println("Fichier écrit avec succès." );

        } catch (IOException e) {

            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());

        }

    }
}
