package InterfaceExos.CalculExo;

public class CalculSimple implements Calculable {

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a - b;
    }

}
