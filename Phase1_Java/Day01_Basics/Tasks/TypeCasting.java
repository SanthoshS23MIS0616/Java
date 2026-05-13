/*
Question:
How can you create a Java program to show int to double implicit casting and double to int explicit casting with decimal truncation?
*/

class TypeCasting {

    public static void main(String[] args) {

        // Implicit Casting (int to double)
        int intValue = 25;

        double doubleValue = intValue;

        System.out.println("Implicit Casting:");
        System.out.println("int value = " + intValue);
        System.out.println("Converted double value = " + doubleValue);


        // Explicit Casting (double to int)
        double decimalNumber = 45.78;

        int convertedInt = (int) decimalNumber;

        System.out.println("\nExplicit Casting:");
        System.out.println("double value = " + decimalNumber);
        System.out.println("Converted int value = " + convertedInt);
    }
}