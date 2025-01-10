package LinkFilesInterfacesExos.EmployersExo1;

import LinkFilesInterfacesExos.EmployersExo1.Employes;

public class EmployesTempPlein implements Employes {

    protected int id;
    protected String nom;
    protected String workerIdentifiant;
    protected Double salaireHr;
    protected Double nbrHeures;
    protected Double salaire;

    public EmployesTempPlein() {
    }

    public EmployesTempPlein(int id, String nom, String workerIdentifiant, Double salaireHr, Double nbrHeures, Double salaire) {
        this.id = id;
        this.nom = nom;
        this.workerIdentifiant = workerIdentifiant;
        this.salaireHr = salaireHr;
        this.nbrHeures = nbrHeures;
        this.salaire = salaire;
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

    public Double getSalaireHr() {
        return salaireHr;
    }

    public void setSalaireHr(Double salaireHr) {
        this.salaireHr = salaireHr;
    }

    public Double getNbrHeures() {
        return nbrHeures;
    }

    public void setNbrHeures(Double nbrHeures) {
        this.nbrHeures = nbrHeures;
    }

    public double getSalaire() {
        return salaire;
    }

    private Double calculerSalaireInterne() {

        if (salaireHr != null && nbrHeures != null) {

            return (salaireHr * nbrHeures) * 4;

        }

        return 0.0;
    }

    @Override
    public String getNom() {
        return null;
    }

    @Override
    public Double calculerSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "EmployesTempPlein {" +
                "id = " + id + ", nom = '" + nom + '\'' + ", workerIdentifiant = '" + workerIdentifiant + '\'' +
                ", salaireHr = " + salaireHr + ", nbrHeures = " + nbrHeures + ", salaire = " + salaire + '}';
    }
}
