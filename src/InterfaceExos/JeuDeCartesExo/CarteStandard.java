package InterfaceExos.JeuDeCartesExo;

public class CarteStandard implements Carte {

    private String valeur;
    private String couleur;

    public CarteStandard(String v, String c) {
        this.valeur = v;
        this.couleur = c;
    }

    @Override
    public String getValeur() {
        return valeur;
    }

    @Override
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return this.valeur + " de " + this.couleur;
    }
}
