package InterfaceExos.CalculExo;

public class CalculableMain {

    public static void main(String[] args) {

        Calculable simple = new CalculSimple();
        System.out.println("Simple calculable");
        System.out.println("Addition: " + simple.addition(4, 7));
        System.out.println("Substraction " + simple.soustraction(4, 7));


        CalculAvance avance = new CalculAvance();
        System.out.println("Avance calculable");
        System.out.println("Addition " + avance.addition(4, 7));
        System.out.println("Substraction " + avance.soustraction(4, 7));
        System.out.println("Multiplication " + avance.multiplication(4, 7));
        System.out.println("Division " + avance.division(4, 7));

    }
}
