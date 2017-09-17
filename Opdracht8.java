import java.util.Scanner;


public class Opdracht8 {


    public static void main(String[] args) {
        new Opdracht8().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Voer een getal in");

        // Eerste input.

        int input1 = scanner.nextInt();

        System.out.println("Voer een tweede getal in");

        // Tweede input.

        int input2 = scanner.nextInt();

        // Kan dit ook met 1 regel? <> tegelijk.
        if (input1 < input2) {
            System.out.println(input2);
        } else {
            System.out.println(input1);
        }

    }

}