import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        int count=0;

        System.out.println("Enter the integer : ");
        temp = scanner.nextInt();

        while(temp != 0){
            temp/=10;
            count++;
        }
        System.out.println(count);




    }
}
