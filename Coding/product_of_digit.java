package Coding;
import java.util.Scanner;
public class product_of_digit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        int product = 1;
        while(number>0){
            int digit = number%10;
            product*=digit;
            number/=10;
        }
        System.out.println("Product of digits: " + product);

    }
}
