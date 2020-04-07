import java.util.Scanner;

public class Friendly {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        int tot1=0,tot2=0;

        System.out.println("Please enter 2 different integer :");
        a = scanner.nextInt();
        b = scanner.nextInt();

        for(int i = 1; i< a-1; i++){
            if(a%i == 0){
                tot1 += i;
            }
        }

        for(int i = 1; i< b-1; i++){
            if(b%i == 0){
                tot2 += i;
            }
        }

        if(tot1 == a && tot2 == b){
            System.out.println(a+" and "+ b +" are Friendly Pair");
        }
        else  {System.out.println("They are not!");}

    }




}
