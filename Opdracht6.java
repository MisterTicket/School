import java.util.Scanner;

public class Opdracht6 {


    public static void main(String[] args) {
        new Opdracht6().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer een nummer in.");

        //int leeftijd

        int nummer1 = scanner.nextInt();

        System.out.println("Voer een tweede nummer in");

        int nummer2 = scanner.nextInt();

        int outcome = nummer1 + nummer2;

        System.out.println(outcome);


    }
}