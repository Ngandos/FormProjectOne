package ExercicesBouclesConditions;

import java.util.Scanner;

public class MysteryNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mistnumb = 50;

        boolean continueToLoop = true;

        while (continueToLoop) {

            System.out.println("Saisissez le nombre mystère qui se trouve entre 0 et 100 ! : ");

            int numb = scanner.nextInt();

            if(numb < mistnumb) {

                System.out.println("Trop petit réessayez");

            } else if (numb > mistnumb) {

                System.out.println("Trop Grand réessyez ! ");

            } else {

                System.out.println("Vous avez saisi le nombre mystere qui est : " + mistnumb);

                continueToLoop = false;

            }
        }

    }

}
