public class java_04_00_identifiers {
    public static void main(String[] args) {
        // Legal identifiers
        String legalIdentifier = "LegalIdentifier";
        int legalInt = 10;
        double legalDouble = 10.5;
        boolean legalBoolean = true;
        char legalChar = 'A';
        // Illegal identifiers
        // int illegalInt = 10; // illegal because it's a keyword
         int illegalInt = 10; // illegal because it's a keyword
    

        /*The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter, and cannot contain whitespace
Names can also begin with $ and _
Names are case-sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names */
            System.out.println(legalBoolean);
            System.out.println(legalChar);
            System.out.println(legalDouble);
            System.out.println(legalIdentifier);
            System.out.println(legalInt);
            System.out.println(illegalInt);
     }
}
