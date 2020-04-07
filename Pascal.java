import java.util.Scanner;
public class Pascal {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int row;
        int staticnum=1;
        System.out.println("How many row do you want?");
        row = scanner.nextInt();


        for(int i= 0; i<row; i++){

            for(int k=0; k<=i; k++){
                if(k==0 || i==0){
                    staticnum=1;
                }
                else {staticnum= staticnum*(i-k+1)/k;}

                System.out.print(staticnum);
            }
            System.out.print("\n");

        }


    }
}
