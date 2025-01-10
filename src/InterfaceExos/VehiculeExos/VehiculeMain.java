package InterfaceExos.VehiculeExos;

import java.util.function.DoubleToIntFunction;

public class VehiculeMain {

    public static void main(String[] args) {

        VoitureElectrique vE1 = new VoitureElectrique();
        vE1.recharger();
        vE1.demarrer();
        System.out.println();
        System.out.println("La voiture Electrique est aretée : " + vE1.demarrer());
        System.out.println("La voiture Electrique est en charge : " + vE1.recharger());
        System.out.println();

        VoitureThermique vT1 = new VoitureThermique();
        vT1.faireLePlein();
        vT1.demarrer();
        System.out.println("La voiture thermique est en reserve : " + vT1.faireLePlein());
        System.out.println("La voiture thermique roule : " + vT1.demarrer());
        System.out.println();


        VoitureHybride vH1 = new VoitureHybride();
        vH1.recharger();
        vH1.faireLePlein();
        vH1.demarrer();
        System.out.println("La voiture hybride roule : " + vH1.demarrer() );
        System.out.println("La voiture hybride a le reservoir plein : " + vH1.faireLePlein());
        System.out.println("La voiture hybride est chargée : " + vH1.recharger());
        System.out.println();

    }
}
