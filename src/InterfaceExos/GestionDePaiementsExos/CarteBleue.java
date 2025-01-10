package InterfaceExos.GestionDePaiementsExos;

public class CarteBleue implements Paiement {

    @Override
    public void effectuerPaiement(double montant) {

        System.out.println("Effectuer un paiement Carte bleue : " + montant);

    }
}
