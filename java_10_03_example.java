import java.util.Scanner;

public class java_10_03_example {
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter their name  
        System.out.println("enter the value of s1==>");
        float s1 = scanner.nextFloat();

        System.out.println("enter the value of s2==>");
        float s2 = scanner.nextFloat();

         System.out.println("enter the value of s3==>");

        float s3 = scanner.nextFloat();

         System.out.println("enter the value of s4==>");

        float s4 = scanner.nextFloat();



        float area=s1+s2+s3+s4;
        System.out.println("area of rectangle is==>"+ area);
        
        // simple intrest
        float si=(s1*s2*s3)/100;
        System.out.println("simple intrest is==>"+  si);

        // area of triangle
        float area_triangle = (s1*s2)/2;    
        System.out.println("area of triangle is==>"+    area_triangle);

        //  power

        float power = (float) Math.pow(s1, s2); 
        System.out.println("power is==>"+   power);

        scanner.close();

    }
}
