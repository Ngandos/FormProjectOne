package InterfaceExos.GestionDePaiementsExos;

import org.w3c.dom.ls.LSOutput;

public class PaiementMain {

    public static void main(String[] args) {

        Paiement cb = new CarteBleue();
        cb.effectuerPaiement(70.00);

        Paiement espece = new Especes();
        espece.effectuerPaiement(50.00);

    };
}
