public class L05_WrapperClasses {
    public static void main(String[] args) {

        // ---------- 1. Primitive types vs Wrapper classes ----------
        // Primitive types: int, double, boolean, etc.
        int primitiveInt = 100;      // primitive int
        double primitiveDouble = 12.34;

        /* Wrapper classes: Integer, Double, Boolean, etc. */
        Integer wrappedInt = 100;     // Integer object
        Double wrappedDouble = 12.34; // Double object

        System.out.println("Primitive vs Wrapper:");
        System.out.println("primitive int: " + primitiveInt);
        System.out.println("wrapped Integer: " + wrappedInt);
        System.out.println("----------------------------------");

        // ---------- 2. Autoboxing ----------
        // Automatic conversion from primitive to wrapper
        int num = 50;
        Integer autoBoxed = num;  // primitive int -> Integer automatically

        System.out.println("Autoboxing:");
        System.out.println("primitive int: " + num);
        System.out.println("autoboxed Integer: " + autoBoxed);
        System.out.println("----------------------------------");

        // ---------- 3. Unboxing ----------
        // Automatic conversion from wrapper to primitive
        Integer wrapperNum = 200;
        int unboxed = wrapperNum;  // Integer -> int automatically

        System.out.println("Unboxing:");
        System.out.println("wrapper Integer: " + wrapperNum);
        System.out.println("unboxed int: " + unboxed);
        System.out.println("----------------------------------");

        // ---------- 4. Useful methods ----------
        String strNumber = "123";
        int parsedInt = Integer.parseInt(strNumber);  // convert String to int
        double parsedDouble = Double.parseDouble("45.67"); // convert String to double
        String strFromInt = Integer.toString(456);    // convert int to String
        String strFromDouble = Double.toString(78.9);// convert double to String

        System.out.println("Useful Wrapper Methods:");
        System.out.println("String '123' to int: " + parsedInt);
        System.out.println("String '45.67' to double: " + parsedDouble);
        System.out.println("int 456 to String: " + strFromInt);
        System.out.println("double 78.9 to String: " + strFromDouble);
        System.out.println("----------------------------------");

        // ---------- 5. Wrapper class constants ----------
        System.out.println("Wrapper Class Constants:");
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Double MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);

        /*

        *It is possible to pass between primitive veriables and
        veriables in the wrapper class of the same data type.

        *Switching between different wrapper classes is not possible

        *We cannot assign a value of primitive data type with another
        name to a veritable created in the Wrapper class.


         */

    }
}
