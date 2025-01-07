import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        String res = happyNumber(n);

        System.out.println(res);
    }

    private static String happyNumber(int n) {

        while(n > 0){
            int temp = n%10;
            n = n/10;
            if(temp == 4 || temp == 7){
                continue;
            }else{
                return "Given number is not a happy number";
            }
        }

        return "Given number is a happy number";
    }
}
