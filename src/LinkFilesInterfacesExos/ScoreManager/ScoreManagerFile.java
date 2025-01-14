package LinkFilesInterfacesExos.ScoreManager;

public class ScoreManagerFile implements ScoreManager {

    protected int id;
    protected String nom;
    protected int score;

    public ScoreManagerFile(int id, String nom, int score) {
        this.id = id;
        this.nom = nom;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void ajouterScore(String joueur, int score) {

    }

    @Override
    public void afficherScore() {

    }

    @Override
    public String toString() {
        return "ScoreManagerFile{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", score=" + score +
                '}';
    }
}
