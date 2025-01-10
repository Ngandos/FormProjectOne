package InterfaceExos.JeuDeCartesExo;

import java.util.ArrayList;
import java.util.Collections;

public class JeuDeCartes {

    private ArrayList<CarteStandard> jeu;

    public JeuDeCartes(){
        this.jeu = new ArrayList<>();
    }

    public JeuDeCartes(ArrayList<CarteStandard> jeu){
        this.jeu = new ArrayList<>(jeu);
    }

    public void shuffle(){
        Collections.shuffle(this.jeu);
    }

    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder();
        for(CarteStandard card : jeu) tmp.append(card.toString());

        return tmp.toString();
    }
}
