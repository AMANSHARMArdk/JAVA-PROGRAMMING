import java.util.Scanner;

public class java_13_02_if_else_statement {
    
    public static void main(String[] args) {

        System.out.println("Welcome to the Java If-Else Statement Example");
        // grate then three numbers
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Enter three numbers to find the greatest:");

        System.out.println("enter the num1===>");
        num1 = input.nextInt();
          System.out.println("enter the num2===>");
        num2 = input.nextInt();
          System.out.println("enter the num3===>");
        num3 = input.nextInt();


        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1 is the greatest: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is the greatest: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Number 3 is the greatest: " + num3);
        } else {
            System.out.println("All numbers are equal or there is no single greatest number.");
        }

        input.close();
           
    }
}
