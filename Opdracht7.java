import java.util.Scanner;

public class Opdracht7 {


    public static void main(String[] args) {
        new Opdracht7().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer je hoogte in (in cm's)");

        int lengte = scanner.nextInt();

        System.out.println("Voer je gewicht in (in kg)");

        int gewicht = scanner.nextInt();

        int kwadraat = gewicht * gewicht;

        int outcome = lengte / gewicht;

        System.out.println("Je BMI is " + outcome + Math.sqrt(outcome));

        if (outcome < 18.5) {
            System.out.println("Je bent te licht!");
        }

        if (outcome > 18.5) {
            System.out.println("Je hebt een normaal gewicht");
        }

        if (outcome > 25) {
            System.out.println("Je hebt een overgewicht");
        }

        if (outcome >= 30) {
            System.out.println("Je bent obesitas");
        }


    }
}