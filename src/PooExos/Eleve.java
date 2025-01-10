package PooExos;

public class Eleve {

    private String nom;
    private String prenom;
    private String genre;
    private int note;

    public Eleve() {
    }

    public Eleve(String nom, String prenom, String genre, int note) {
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.note = note;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Eleve { " + "nom = '" + nom + '\'' + ", prenom = '" + prenom + '\'' + ", genre = '" + genre + '\'' + ", note = " + note + '}';
    }
}
