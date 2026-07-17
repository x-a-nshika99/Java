package for_loop_question;
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int i = 0 ;
        for (i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
