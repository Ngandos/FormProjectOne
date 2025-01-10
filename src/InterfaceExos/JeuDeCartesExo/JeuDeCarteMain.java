package InterfaceExos.JeuDeCartesExo;

import java.util.ArrayList;

public class JeuDeCarteMain {

    public static void main(String[] args) {

        ArrayList<CarteStandard> jeu = new ArrayList<>();

        jeu.add(new CarteStandard("coeur","As"));
        jeu.add(new CarteStandard("coeur","2"));
        jeu.add(new CarteStandard("coeur","3"));
        jeu.add(new CarteStandard("coeur","4"));
        jeu.add(new CarteStandard("coeur","5"));
        jeu.add(new CarteStandard("coeur","6"));
        jeu.add(new CarteStandard("coeur","7"));
        jeu.add(new CarteStandard("coeur","8"));
        jeu.add(new CarteStandard("coeur","9"));
        jeu.add(new CarteStandard("coeur","10"));
        jeu.add(new CarteStandard("coeur","Valet"));
        jeu.add(new CarteStandard("coeur","Dame"));
        jeu.add(new CarteStandard("coeur","Roi"));

        jeu.add(new CarteStandard("carreau","As"));
        jeu.add(new CarteStandard("carreau","2"));
        jeu.add(new CarteStandard("carreau","3"));
        jeu.add(new CarteStandard("carreau","4"));
        jeu.add(new CarteStandard("carreau","5"));
        jeu.add(new CarteStandard("carreau","6"));
        jeu.add(new CarteStandard("carreau","7"));
        jeu.add(new CarteStandard("carreau","8"));
        jeu.add(new CarteStandard("carreau","9"));
        jeu.add(new CarteStandard("carreau","10"));
        jeu.add(new CarteStandard("carreau","Valet"));
        jeu.add(new CarteStandard("carreau","Dame"));
        jeu.add(new CarteStandard("carreau","Roi"));

        JeuDeCartes jdc = new JeuDeCartes(jeu);

        System.out.println("JEU DE BASE");
        System.out.println(jdc.toString());
        jdc.shuffle();
        System.out.println("\nJEU DE MÉLANGÉ");
        System.out.println(jdc.toString());

    }
}
