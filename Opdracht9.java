import java.util.Scanner;


public class Opdracht9 {


    public static void main(String[] args) {
        new Opdracht9().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();


        System.out.println(input1 * 1000000);
    }
}



// a: Nummer 2000000000
// b: -1294967296
//      -Geen idee waarom
// c. Error zoals verwacht.