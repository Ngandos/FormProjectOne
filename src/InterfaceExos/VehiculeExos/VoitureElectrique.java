package InterfaceExos.VehiculeExos;

public class VoitureElectrique implements Vehicule, Electrique {

    @Override
    public boolean recharger() {
        return false;
    }

    @Override
    public boolean demarrer() {
        return false;
    }
}
