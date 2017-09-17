import java.util.Scanner;

public class Opdracht4 {


    public static void main(String[] args) {
        new Opdracht4().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wat is je leeftijd?");

        //int leeftijd

        int leeftijd = scanner.nextInt();

        if( leeftijd < 18) {
            System.out.println("Sorry maar je mag geen alcohol kopen onder de 18!");
        }

        else{
            System.out.println("Wat wil je hebben?");
        }

    }
}