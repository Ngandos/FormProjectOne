package InterfaceExos.CalculExo;

public class CalculAvance implements Calculable {

    @Override
    public int addition(int a, int b) {

        return a + b;
    }

    @Override
    public int soustraction(int a, int b) {

        return a - b;
    }

    public int multiplication(int a, int b) {

        return a * b;

    }


    public double division(int a, int b) {

        return a / b;
    }

}
