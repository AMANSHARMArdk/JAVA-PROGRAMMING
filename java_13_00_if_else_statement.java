public class java_13_00_if_else_statement {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //  if condititon
        if (a > b) {
            System.out.println("a is greater than b");
        }

        else {
            System.out.println("a is less than b");
        }


        // else if condition
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }


        // short hand if else
        int x = 10;

        String result = (x >10) ? "x is greater than 10" : "x is less than 10"; // ternary operator
        System.out.println(result);
        




    }
}
