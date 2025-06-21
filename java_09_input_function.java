import java.util.Scanner;

public class java_09_input_function {
    public static void main(String[] args) {
        // Input Function in Java

         // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input as a string

        // Display the input
        System.out.println("Hello, " + name + "!");

        // Prompt user for an integer
        System.out.print("Enter your age: ");   
        int age = scanner.nextInt(); // Read user input as an integer
        // Display the input
        System.out.println("You are " + age + " years old!");

        // Close the scanner
        scanner.close();
    }
}
