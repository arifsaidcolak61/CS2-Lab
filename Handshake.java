import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;

        System.out.println("Enter the number of people: ");
        temp = scanner.nextInt();

        System.out.println("Max handshakes is "+ (temp * ( temp-1) ) / 2);
    }
}
