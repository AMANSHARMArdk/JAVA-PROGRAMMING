public class java_10_00_operators {
    public static void main(String[] args) {
        // Operators in Java

        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // Addition
        System.out.println("Subtraction: " + (a - b)); // Subtraction
        System.out.println("Multiplication: " + (a * b)); // Multiplication
        System.out.println("Division: " + (a / b)); // Division
        System.out.println("Modulus: " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("Equal to: " + (a == b)); // Equal to
        System.out.println("Not equal to: " + (a != b)); // Not equal to
        System.out.println("Greater than: " + (a > b)); // Greater than
        System.out.println("Less than: " + (a < b)); // Less than
        System.out.println("Greater than or equal to: " + (a >= b)); // Greater than or equal to
        System.out.println("Less than or equal to: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y)); // Logical AND
        System.out.println("Logical OR: " + (x || y)); // Logical OR
        System.out.println("Logical NOT: " + (!x)); // Logical NOT

        // Bitwise Operators
        int m = 5, n = 3; // m = 0101, n = 0011 in binary
        System.out.println("Bitwise AND: " + (m & n)); // Bitwise AND
        System.out.println("Bitwise OR: " + (m | n)); // Bitwise OR
        System.out.println("Bitwise XOR: " + (m ^ n)); // Bitwise XOR
        System.out.println("Bitwise Complement of m: " + (~m)); // Bitwise Complement

        // Assignment Operators or short hand Operators
        // Assignment Operators are used to assign values to variables.
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("After += : " + c);
        
        c -= 3; // c = c - 3
        System.out.println("After -= : " + c);
        c *= 2; // c = c * 2
        System.out.println("After *= : " + c);
        c /= 4; // c = c / 4
        System.out.println("After /= : " + c);
        c %= 3; // c = c % 3
        System.out.println("After %= : " + c);

        // Unary Operators
        int d = 5;
        System.out.println("subtraction increment: " + (-(-d)));
        System.out.println("Unary Plus: " + (++d)); // Unary Plus
        System.out.println("Unary Minus: " + (--d)); // Unary Minus
        System.out.println("Postfix Increment: " + (d++)); // Postfix Increment
        System.out.println("Postfix Increment: " + (d--)); // Postfix Increment


        }
         

    }
    

