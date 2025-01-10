package InterfaceExos.ProduitsExo;

public class ProduitsMain {

    public static void main(String[] args) {

        ProduitPhysique pP = new ProduitPhysique();
        System.out.println("Produit : " + pP.getNom("MacBookAir 19"));
        System.out.println("Descritpion du produit : " + pP.afficherDetails("Ordinateur portable 19 pouces"));
        System.out.println("Prix : " + pP.getPrix(1979.00));
        System.out.println("Ce produit est telechargeable : " + pP.telechargeable());
        System.out.println();

        ProduitNumerique pN = new ProduitNumerique();
        System.out.println("Produit : " + pP.getNom("Le seigneur des anneaux"));
        System.out.println("Descritpion du produit : " + pN.afficherDetails("Film"));
        System.out.println("Prix : " + pN.getPrix(30.00));
        System.out.println("Ce produit est telechargeable : " + pN.telechargeable());

    }
}
