package Coding;
import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int result = 0;
        
        while (num > 0) {
            int digit = num % 10;              // extract last digit
            result += digit * digit * digit;   // cube and add to result
            num /= 10;                         // remove last digit
        }
        
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        
    }
    
}
 