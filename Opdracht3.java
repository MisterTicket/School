import java.util.Scanner;

public class Opdracht3 {


    public static void main(String[] args) {
        new Opdracht3().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wat is je naam?");

        String voornaam = scanner.nextLine();

        System.out.println("Hoe oud ben je?");
        //int leeftijd

        int leeftijd = scanner.nextInt();

        System.out.println("Hoi " + voornaam + "!, van " + leeftijd + " jaar.");
    }
}