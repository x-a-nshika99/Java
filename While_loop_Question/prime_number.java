package While_loop_Question;

import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
       
        
        int i=0;
        int sum = 0;
        while (i < num) {
            if (num % i == 0) {   // check if i is a divisor
                sum+=1;
            }
            i++;
        }
        if (sum>2){
            System.err.println("this is not prime");

        }
        else{
            System.out.println("this is prime");
        }

    }
}