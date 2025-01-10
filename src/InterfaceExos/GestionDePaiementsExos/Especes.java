package InterfaceExos.GestionDePaiementsExos;

public class Especes implements Paiement {

    @Override
    public void effectuerPaiement(double montant){

        System.out.println("Effectuer un paimement : " + montant);

    }
}
