package While_loop_Question;
import java.util.Scanner;

public class square_1_to_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = scanner.nextInt();
        int i =1;
        int square = 0;
        while(i<n){
            square = i * i;
            System.out.println(square);
        }
    }
    
}
