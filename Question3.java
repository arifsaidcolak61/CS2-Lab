public class Question3 {
    public static void main(String[] args) {
        int a = 76;
        int b = 12;
        int c = 7;


        if(b > a && b > c){
            System.out.println(b + " is the greatest of given numbers which is b.");
        }
        else if(c > a && c > b){
            System.out.println(c + " is the greatest of given numbers which is c.");
        }
        else{
            System.out.println(a + " is the greatest of given numbers which is a.");
        }

    }
}
