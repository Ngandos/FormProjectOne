package InterfaceExos.ProduitsExo;

public class ProduitNumerique implements Produits {
    @Override
    public String getNom(String nom) {
        return nom;
    }

    @Override
    public Double getPrix(double prix) {
        return prix;
    }

    @Override
    public String afficherDetails(String details) {
        return details;
    }

    public boolean telechargeable() {

        return true;

    }
}
