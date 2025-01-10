package InterfaceExos.VehiculeExos;

public class VoitureHybride implements Vehicule, Electrique, Thermique {
    @Override
    public boolean recharger() {

        return true;

    }

    @Override
    public boolean faireLePlein() {

        return true;

    }

    @Override
    public boolean demarrer() {

        return true;

    }
}
