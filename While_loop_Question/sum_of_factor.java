package While_loop_Question;

import java.util.Scanner;

public class sum_of_factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of n ");
        int n = scanner.nextInt();
 
        int i = 1;
        int sum = 0;

        while(i<n){
            if (n%i == 0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Factor sum :" + sum);
    }
 
}
