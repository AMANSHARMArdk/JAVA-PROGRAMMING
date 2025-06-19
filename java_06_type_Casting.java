public class java_06_type_Casting {
    public static void main(String[] args) {

        // Type casting is when you assign a value of one primitive data type to another
        // type.

        // In Java, there are two types of casting:

        // Widening Casting (automatically) - converting a smaller type to a larger type
        // size
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) - converting a larger type to a smaller size
        // type
        // double -> float -> long -> int -> char -> short -> byte

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        char myChar = 'A';
        int mynum = myChar;
        char myChar2 = (char) mynum; // Manual casting: int to char

        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0
        System.out.println(mynum); // Outputs 10
        System.out.println(myChar2); // Outputs A

        // for example
        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /*
         * Calculate the percentage of the user's score in relation to the maximum
         * available score.
         * Convert userScore to float to make sure that the division is accurate
         */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);

    }

}
