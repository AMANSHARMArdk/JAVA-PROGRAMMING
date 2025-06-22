import  java.util.Scanner;

public class java_02_example_algerbric_operation_by_user {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        

        System.out.println("enter the number====>");
        float a=input.nextInt();


        System.out.println("enter the number====>");
        float b=input.nextInt();
        

        System.out.println("Addition: " + (a + b)); // Addition
        System.out.println("Subtraction: " + (a - b)); // Subtraction
        System.out.println("Multiplication: " + (a * b)); // Multiplication
        System.out.println("Division: " + (a / b)); // Division
        System.out.println("Modulus: " + (a % b)); // Modulus
        System.out.println("Equal to: " + (a == b)); // Equal to
        System.out.println("Not equal to: " + (a != b)); // Not equal to
        System.out.println("Greater than: " + (a > b)); // Greater than
        System.out.println("Less than: " + (a < b)); // Less than
        System.out.println("Greater than or equal to: " + (a >= b)); // Greater than or equal to
        System.out.println("Less than or equal to: " + (a <= b)); // Less than or equal to
        System.out.println("Logical AND: " + (a > 0 && b > 0)); // Logical AND
        System.out.println("Logical OR: " + (a > 0 || b > 0)); // Logical OR
        System.out.println("Logical NOT: " + (!(a > 0))); // Logical NOT
        System.out.println("Bitwise AND: " + ((int)a & (int)b)); // Bitwise AND
        System.out.println("Bitwise OR: " + ((int)a | (int)b)); // Bitwise OR
        System.out.println("Bitwise XOR: " + ((int)a ^ (int)b)); // Bitwise XOR
        System.out.println("Bitwise Complement of a: " + (~(int)a)); // Bitwise Complement
        System.out.println("Bitwise Complement of b: " + (~(int)b)); // Bitwise Complement
        // Assignment Operators or short hand Operators
        // Assignment Operators are used to assign values to variables.
        float c = a;
        c += b; // c = c + b
        System.out.println("After += : " + c);
        c -= b; // c = c - b
        System.out.println("After -= : " + c);      
        c *= b; // c = c * b
        System.out.println("After *= : " + c);
        c /= b; // c = c / b
        System.out.println("After /= : " + c);
        c %= b; // c = c % b
        System.out.println("After %= : " + c);
        // Unary Operators
        System.out.println("Unary Plus: " + (+a)); // Unary Plus
        System.out.println("Unary Minus: " + (-a)); // Unary Minus
        System.out.println("Postfix Increment: " + (a++)); // Postfix Increment
        System.out.println("Postfix Increment: " + (b++)); // Postfix Increment
        System.out.println("Postfix Decrement: " + (a--)); // Postfix Decrement
        System.out.println("Postfix Decrement: " + (b--)); // Postfix Decrement
        // Close the scanner
        input.close();
        // End of the program
        System.out.println("End of the program");

        

    }
    
}
