package LinkFilesInterfacesExos.EmployersExo1;

import LinkFilesInterfacesExos.EmployersExo1.Employes;

public class EmployesTempPartiel implements Employes {

    public int id;
    protected String nom;
    protected String workerIdentifiant;
    protected Double salaireFixe;

    public EmployesTempPartiel(int id, String nom, String workerIdentifiant, Double salaireFixe) {
        this.id = id;
        this.nom = nom;
        this.workerIdentifiant = workerIdentifiant;
        this.salaireFixe = salaireFixe;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getWorkerIdentifiant() {
        return workerIdentifiant;
    }
    public void setWorkerIdentifiant(String workerIdentifiant) {
        this.workerIdentifiant = workerIdentifiant;
    }
    public Double getSalaireFixe() {
        return salaireFixe;
    }
    public void setSalaireFixe(Double salaireFixe) {
        this.salaireFixe = salaireFixe;
    }

    @Override
    public String getNom() {
        return null;
    }

    @Override
    public Double calculerSalaire() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "EmployesTempPartiel {" + "id = " + id + ", nom = '" + nom + '\'' + ", workerIdentifiant = '" + workerIdentifiant + '\'' +
                ", salaireFixe = " + salaireFixe + '}';
    }
}
