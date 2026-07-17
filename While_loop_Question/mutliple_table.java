package While_loop_Question;

import java.util.Scanner;

public class mutliple_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int table=0;
        int i = 1;
        while(i<=10){
            table = number*i;
            System.out.println(table);
            i++;
        }
        
    }
    
}
