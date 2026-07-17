package While_loop_Question;
import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        int sum = 0;
        int i = 1;

        for (i = 1; i <= number; i++) {

            sum+=i;

        }
        
        System.out.println(sum);


    }
    
}
