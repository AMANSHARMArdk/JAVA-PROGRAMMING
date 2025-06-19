public class java_03_variable {
    public static void main(String[] args) {
        // Declare and initialize a variable Variables are containers for storing data
        // values.
        int myVariable = 10; // Declare and initialize a variable
        System.out.println("The value of myVariable is: " + myVariable); // Output:
        // The value of myVariable is: 10
        final String name = "aman";
        System.out.println(name);
        // If you don't want others (or yourself) to overwrite existing values, use the
        // final keyword (this will declare the variable as "final" or "constant", which
        // means unchangeable and read-only):

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        // You can also declare multiple variables in one line, separated by commas:
        int x = 5, y = 10, z = 15;
        System.out.println(x+z+y);

        x=y=z=10;
        System.out.println(x+z+y);

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myBool);
        System.out.println(myLetter);
        System.out.println(myText);

        
        
    }
}
