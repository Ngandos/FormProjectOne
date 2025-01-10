package InterfaceExos.VehiculeExos;

public class VoitureThermique implements Vehicule, Thermique {
    @Override
    public boolean faireLePlein() {

        return false;

    }

    @Override
    public boolean demarrer() {

        return true;

    }
}
