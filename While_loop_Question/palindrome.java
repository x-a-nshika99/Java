package While_loop_Question;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        int original_number = number;
        int reserve = 0;
        while(number>0){
            int digit = number%10;
            reserve = reserve*10 + digit;
            number/=10;
        }
        if (reserve == original_number){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }

    

    }
}
