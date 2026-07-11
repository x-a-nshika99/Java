package Coding;


// what is perfect number that number whose divisor sum is equal to that number 


import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int originalNum = num;
        
        int i=0;
        int sum = 0;
        while (i < num) {
            if (num % i == 0) {   // check if i is a divisor
                sum += i;
            }
            i++;
        }

        // compare sum of divisors with the number
        if (sum == num) {
            System.out.println(num + " is a Perfect number");
        } else {
            System.out.println(num + " is not a Perfect number");
        }
    }
}
