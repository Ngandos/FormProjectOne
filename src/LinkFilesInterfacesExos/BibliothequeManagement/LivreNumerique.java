package LinkFilesInterfacesExos.BibliothequeManagement;

public class LivreNumerique implements Livre {

    protected int id;
    protected String titre;
    protected String auteur;
    protected Boolean isNumerique;

    public LivreNumerique(int id, String titre, String auteur, Boolean isNumerique) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.isNumerique = isNumerique;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Boolean getNumerique() {
        return isNumerique;
    }

    public void setNumerique(Boolean numerique) {
        isNumerique = numerique;
    }

    @Override
    public String getTitre() {
        return null;
    }

    @Override
    public String getAuteur() {
        return null;
    }

    @Override
    public String toString() {
        return "LivreNumerique {" +
                "id = " + id +
                ", titre = '" + titre + '\'' +
                ", auteur = '" + auteur + '\'' +
                ", isNumerique = " + isNumerique +
                '}';
    }
}
