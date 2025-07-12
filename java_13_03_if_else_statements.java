import java.util.Scanner;

public class java_13_03_if_else_statements {
    public static void main(String[] args) {
    // leap year 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year:");
        int year = input.nextInt();

        // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //     System.out.println(year + " is a leap year.");
        // } else {
        //     System.out.println(year + " is not a leap year.");
        
        String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "Leap year" : "Not a leap year";
        System.out.println("Using ternary operator: " + result);
        // close the scanner
        input.close();
    
    }
}
