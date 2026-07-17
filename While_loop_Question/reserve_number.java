package While_loop_Question;

import java.util.Scanner;

public class reserve_number {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        int reserve = 0;
        while(number>0){
            int digit = number%10;
            reserve = reserve*10 + digit;
            number/=10;
        }
        System.out.println("Reversed number: " + reserve);

    }
}
