package Coding;

import java.util.Scanner;

public class total_digit_in_number {

        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        int total_digit = 0;
        while(number>0){
            int digit = number%10;
            total_digit++;
            number/=10;
        }
        System.out.println("Total number of digits: " + total_digit);

    }
    
}
