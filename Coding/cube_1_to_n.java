package Coding;

import java.util.Scanner;

public class cube_1_to_n {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = scanner.nextInt();
        int i =1;
        int cube = 0;
        while(i<n){
            cube = i * i * i;
            System.out.println(cube);
        }
    }
}
