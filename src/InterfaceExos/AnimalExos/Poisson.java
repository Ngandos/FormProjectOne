package InterfaceExos.AnimalExos;

public class Poisson implements Animal, Nageur {

    @Override
    public void faireDuBruit() {

        System.out.println("Le poisson fait Bloup - Bloup");;
    }

    @Override
    public void nager() {

        System.out.println("Le poisson nage.");;

    }
}
