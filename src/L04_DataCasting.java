public class L04_DataCasting {
    public static void main(String[] args) {

        // ---------- Implicit Casting (Widening Conversion) ----------
        // Automatically converting a smaller type to a larger type
        int intNumber = 10;             // integer value
        double doubleNumber = intNumber; // int is automatically converted to double

        System.out.println("Implicit Casting:");
        System.out.println("int value: " + intNumber);
        System.out.println("converted to double: " + doubleNumber);
        System.out.println("----------------------------------");

        // ---------- Explicit Casting (Narrowing Conversion) ----------
        // Manually converting a larger type to a smaller type
        double decimalValue = 9.78;      // double value
        int convertedInt = (int) decimalValue; // manually convert double to int

        System.out.println("Explicit Casting:");
        System.out.println("double value: " + decimalValue);
        System.out.println("converted to int: " + convertedInt);
        System.out.println("----------------------------------");

        // ---------- Example with Characters ----------
        char letter = 'A';               // character
        int asciiValue = letter;          // char to int (implicit)
        System.out.println("Character to ASCII:");
        System.out.println("char: " + letter + " --> ASCII: " + asciiValue);

        int newAscii = 66;
        char newChar = (char) newAscii;   // int to char (explicit)
        System.out.println("ASCII to Character:");
        System.out.println("ASCII: " + newAscii + " --> char: " + newChar);
        System.out.println("----------------------------------");

        // ---------- Example: double to int, then int to byte ----------
        double largeDecimal = 130.56;
        int fromDouble = (int) largeDecimal; // remove decimal part
        byte smallByte = (byte) fromDouble;  // overflow occurs because 130 > byte max (127)

        System.out.println("Double to Int to Byte:");
        System.out.println("Original double: " + largeDecimal);
        System.out.println("After (int): " + fromDouble);
        System.out.println("After (byte): " + smallByte + " (overflow happened)");

    }
}
