import java.util.Scanner;

public class java_10_01_example_swap_num {
    public static void main(String[] args) {
        // Example: Swap two numbers using a temporary variable
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = input.nextInt(); // Read first number
        System.out.print("Enter the second number (b): ");  
        int b = input.nextInt(); // Read second number
        input.close();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping logic
        int temp = a; // Store the value of a in temp
        a = b;       // Assign the value of b to a
        b = temp;   // Assign the value of temp (original a) to b
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    
}
