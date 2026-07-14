package Coding;
import java.util.Scanner;
public class factor_of_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of n ");
        int n = scanner.nextInt();
        int i = 1;
        System.out.println("factors are :");
            while(i<n){
            if (n%i == 0){
                System.err.println(i);
            }
            i++;
        }
    }
}
