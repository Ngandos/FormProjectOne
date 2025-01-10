package InterfaceExos.AnimalExos;

public class Oiseau implements Animal, Volant {

    @Override
    public void faireDuBruit() {

        System.out.println("L'oiseau Chante Cui - Cui");
    }

    @Override
    public void voler() {

        System.out.println("L'oiseau vole.");;

    }

}
