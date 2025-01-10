package RectangleExo;

import java.util.Scanner;

public class RectangleMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Programme de calcul de la surface d'un rectangle ===");
        System.out.println();

        System.out.print("Entrez la hauteur du rectangle : ");
        int height = scanner.nextInt();
        System.out.println();

        System.out.print("Entrez la largeur du rectangle : ");
        int large = scanner.nextInt();
        System.out.println();

        Rectangle rectangle = new Rectangle(height, large);

        System.out.println("Les dimensions du rectangle sont : " + rectangle);
        System.out.println();
        System.out.println("La surface du rectangle est : " + rectangle.calculateSurface());
    }
}
