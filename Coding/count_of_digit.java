package Coding;

import java.util.Scanner;

public class count_of_digit {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        int sum = 0;
        while(number>0){
            int digit = number%10;
            sum+=digit;
            number/=10;
        }
        System.out.println("Sum of digits: " + sum);

    }
    
}
