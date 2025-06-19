public class java_05_00_data_type {
    public static void main(String[] args) {
        // Data types are divided into two groups:

        // Primitive data types - includes byte, short, int, long, float, double,
        // boolean and char

        // Non-primitive data types - such as String, Arrays and Classes

        // Primitive data types are further divided into two groups:

        // 1. Numeric data types - includes byte, short, int, long, float and double
        // 2. Non-numeric data types - includes boolean and char

        // byte Stores whole numbers from -128 to 127
        // short Stores whole numbers from -32,768 to 32,767
        // int Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long Stores whole numbers from -9,223,372,036,854,775,808 to
        // 9,223,372,036,854,775,807
        // float Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // double Stores fractional numbers. Sufficient for storing 15 to 16 decimal
        // digits
        // boolean Stores true or false values
        // char Stores a single character/letter or ASCII values

        // Numbers
        // Primitive number types are divided into two groups:

        // Integer types stores whole numbers, positive or negative (such as 123 or
        // -456), without decimals. Valid types are byte, short, int and long. Which
        // type you should use, depends on the numeric value.

        // Floating point types represents numbers with a fractional part, containing
        // one or more decimals. There are two types: float and double.

        byte myNum1 = 100;
        System.out.println(myNum1);

        short myNum2 = 5000;
        System.out.println(myNum2);

        int myNum3 = 100000;
        System.out.println(myNum3);

        long myNum4 = 15000000000L;
        System.out.println(myNum4);

        float myNum5 = 5.75f;
        System.out.println(myNum5);

        double myNum6 = 19.99d;
        System.out.println(myNum6);

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        // non-numaric data types
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); // Outputs true
        System.out.println(isFishTasty); // Outputs false

        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);

        // Non-Primitive Data Types
        // Non-primitive data types are called reference types because they refer to
        // objects.

        // The main differences between primitive and non-primitive data types are:

        // Primitive types in Java are predefined and built into the language, while
        // non-primitive types are created by the programmer (except for String).
        // Non-primitive types can be used to call methods to perform certain
        // operations, whereas primitive types cannot.
        // Primitive types start with a lowercase letter (like int), while non-primitive
        // types typically starts with an uppercase letter (like String).
        // Primitive types always hold a value, whereas non-primitive types can be null.
        // Examples of non-primitive types are Strings, Arrays, Classes etc. You will
        // learn more about these in a later chapter.

    }

}
