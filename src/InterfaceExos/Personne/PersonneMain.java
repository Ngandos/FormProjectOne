package InterfaceExos.Personne;

import java.util.ArrayList;
import java.util.List;

public class PersonneMain {

    public static void main(String[] args) {

        // Création d'une liste de personnes

        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Gaz Mawete", 30));
        personnes.add(new Personne("Innoss Balumé", 25));
        personnes.add(new Personne("Fally Ipupa", 35));

        //......................................Affichage de la liste avant le tri

        System.out.println("Avant le tri :");
        System.out.println();
        for (Personne personne : personnes) {
            System.out.println(personne);
        }
        System.out.println();

        //.......................................Tri de la liste en utilisant ComparateurPersonne

        personnes.sort(new ComparateurPersonne());

        //........................................Affichage de la liste après le tri

        System.out.println("Après le tri :");
        System.out.println();
        for (Personne personne : personnes) {
            System.out.println(personne);
        }

    }
}
