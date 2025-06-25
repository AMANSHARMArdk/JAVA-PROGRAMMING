public class java_11_string {
    public static void main(String[] args) {

        String str = "Hello, World!";

        System.out.println(str);
        System.out.println("The length of the txt string is: " + str.length());
        System.out.println(str.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(str.toLowerCase()); // Outputs "hello world"
        System.out.println(str.indexOf("lo")); // Outputs 7

        // Concatenation
        String str1 = "Hello, ";
        String str2 = "World!";
        System.out.println(str1 + str2); // Outputs "Hello, World!"
        System.out.println(str1.concat(str2));

        String x = "10";
        int y = 20;
        String z = x + y; // z will be 1020 (a String)
        System.out.println(z);

    }
}
