import java.util.Scanner;


public class java_13_01_if_else_statement {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("enter the number");
        int a=input.nextInt();

        if (a%2==0){

            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
            }

            // using if else statement to check whether the number is positive or negative
            if (a>0){
                System.out.println("The number is positive");
            }
            else if (a<0){

                System.out.println("The number is negative");
            }
            else{
                System.out.println("The number is zero");
                }
                input.close();


        // using  short hand if else statement
        String b=(a%2==0) ? "even" : "odd";
        System.out.println(b);

    }
        
        
}
