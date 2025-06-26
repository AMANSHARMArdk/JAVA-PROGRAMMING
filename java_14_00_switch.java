public class java_14_00_switch {

    public static void main(String[] args) {
        int day = 10;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Looking forward to the Weekend");

                // The break Keyword
                // When Java reaches a break keyword, it breaks out of the switch block.

                // This will stop the execution of more code and case testing inside the block.

                // When a match is found, and the job is done, it's time for a break. There is
                // no need for more testing.

                // A break can save a lot of execution time because it "ignores" the execution
                // of all the rest of the code in the switch block.

        }

    }
}
