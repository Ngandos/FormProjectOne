package InterfaceExos.AnimalExos;

import java.util.ArrayList;

public class AnimalMain {

    public static void main(String[] args) {

        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Chien());
        list.add(new Oiseau());
        list.add(new Poisson());

        for (Animal animal : list) {
            animal.faireDuBruit();
            if (animal instanceof Volant) ((Volant)animal).voler();
            else if (animal instanceof  Nageur) ((Nageur)animal).nager();
        }
    }
}
