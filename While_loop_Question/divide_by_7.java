package While_loop_Question;

//  Print all numbers between a and b that are divisible by 7.

import java.util.Scanner;
public class divide_by_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value a ");
        int a = scanner.nextInt();
        System.out.println("enter the value b (its should be greater than a) ");
        int b = scanner.nextInt();
        int i=1;
        while(i<b){
            if (( a < i && i < b )) {
                if ( i % 7 == 0){
                    System.out.println(i);
                }

            }
            i++;

        }
    }
}
