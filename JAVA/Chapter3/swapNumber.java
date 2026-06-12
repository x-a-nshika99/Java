package Chapter3;

public class swapNumber {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        System.out.println("Before swapping: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        // Swapping logic
        int temp = firstNumber; // Store the value of firstNumber in a temporary variable
        firstNumber = secondNumber; // Assign the value of secondNumber to firstNumber
        secondNumber = temp; // Assign the value stored in temp (original firstNumber) to secondNumber
        System.out.println("After swapping: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
    
}
