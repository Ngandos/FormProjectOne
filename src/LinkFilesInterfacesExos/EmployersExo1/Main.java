package LinkFilesInterfacesExos.EmployersExo1;

import LinkFilesInterfacesExos.EmployersExo1.EmployesTempPartiel;
import LinkFilesInterfacesExos.EmployersExo1.EmployesTempPlein;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<EmployesTempPlein> workers = new ArrayList<>();
        workers.add(new EmployesTempPlein(1,"Ngando", "NgDvFS-01", 25.0, 35.00, (25.00 * 35.00) * 4));
        workers.add(new EmployesTempPlein(2,"Kimia", "KiDtEng-02", 45.5, 35.00, (45.00 * 35.00) * 4));
        workers.add(new EmployesTempPlein(3,"Nzola", "NzSOC-01", 50.0, 35.00, (50.00 * 35.00) * 4));

        ArrayList<EmployesTempPartiel> tpWorkers = new ArrayList<>();
        tpWorkers.add(new EmployesTempPartiel(1, "Nguma", "tPNgDvFS-01", 2950.0));

        String filePath = "/Users/ngandos/GitHub/FormProjectOne/src/LinkFilesInterfacesExos/CreatedFiles/Employés.txt";

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(filePath))) {

            // Écrire les employés à temps plein

            bf.write("Employés à temps plein:\n");

            for (EmployesTempPlein worker : workers) {

                bf.write(worker.toString() + "\n");

            }

            // Écrire les employés à temps partiel

            bf.write("\nEmployés à temps partiel:\n");

            for (EmployesTempPartiel tpWorker : tpWorkers) {

                bf.write(tpWorker.toString() + "\n");
            }
            System.out.println();

            System.out.println("Fichier écrit avec succès." );

        } catch (IOException e) {

            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());

        }

    }
}
