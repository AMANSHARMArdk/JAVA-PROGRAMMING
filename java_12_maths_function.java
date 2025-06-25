public class java_12_maths_function {
    public static void main(String[] args) {
        int a = 10;

        int b = 20;

        // all maths function
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));

        System.out.println(Math.abs(-5)); // absolute value of -5
        System.out.println(Math.ceil(5.5)); // ceil of 5.5
        System.out.println(Math.floor(5.5)); // floor of 5.5
        System.out.println(Math.pow(5, 2)); // 5 power 2
        System.out.println(Math.sqrt(9)); // square root of 9
        System.out.println(Math.random()); // random number between 0 and 1
        int randomNum = (int) (Math.random() * 101); // 0 to 100
        System.out.println(randomNum);

    }
}
