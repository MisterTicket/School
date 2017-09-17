import java.util.Scanner;

public class Opdracht5 {


    public static void main(String[] args) {
        new Opdracht5().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Noem een nummer tussen de 1 en 10");

        //int roman

        int roman = scanner.nextInt();

        if( roman == 1) {
            System.out.println("I");
        }

        if( roman == 2) {
            System.out.println("II");
        }

        if( roman == 3) {
            System.out.println("III");
        }

        if( roman == 4) {
            System.out.println("IV");
        }

        if( roman == 5) {
            System.out.println("V");
        }

        if( roman == 6) {
            System.out.println("VI");
        }

        if( roman == 7) {
            System.out.println("VII");
        }

        if( roman == 8) {
            System.out.println("VIII");
        }

        if( roman == 9) {
            System.out.println("IX");
        }

        if( roman == 10) {
            System.out.println("X");
        }

        else {
            System.out.println("Dat is niet binnen de 10 hè?");
        }

    }
}