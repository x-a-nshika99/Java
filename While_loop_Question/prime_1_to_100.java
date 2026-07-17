package While_loop_Question;

public class prime_1_to_100 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        int num = 100;
        while (i<num){
            if (num%i==0){
                sum+=1;
            }
            
        }
        if (sum<3){
            System.out.println("");
        }
    }
}
