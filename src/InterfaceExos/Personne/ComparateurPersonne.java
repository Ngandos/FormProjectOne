package InterfaceExos.Personne;

import java.util.Comparator;

class ComparateurPersonne implements Comparator<Personne> {
    @Override
    public int compare(Personne p1, Personne p2) {

        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
