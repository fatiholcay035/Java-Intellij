public class L40_MultipleUncheckedExceptions {
    public static void main(String[] args) {

        System.out.println("Program started...");

        try {
            // Multiple unchecked exceptions can happen in the same block of code.
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // ArrayIndexOutOfBoundsException

            String text = null;
            System.out.println(text.length()); // NullPointerException

            int result = 10 / 0;  // ArithmeticException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You tried to access an invalid array index!");

        } catch (NullPointerException e) {
            System.out.println("Error: You tried to access a null object!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");

        } catch (Exception e) {
            // This is a general catch block that handles any other exception
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Program continues safely...");

        /*

                Unchecked Exceptions:
        These occur during program execution and are not checked at compile time.
        Examples:

        ArithmeticException

        NullPointerException

        ArrayIndexOutOfBoundsException

        Multiple catch blocks:
        You can use multiple catch blocks to handle different exceptions separately.
        This makes the program more readable and provides specific error messages for each case.

        The order of catch blocks matters:

        Always place specific exceptions first,

        and the general Exception class at the end.
        Otherwise, you’ll get a compile-time error, because the general one will “catch” all before others.

        Why it’s important:

        Prevents program from crashing.

        Helps identify the exact problem that occurred.

        Makes debugging and maintenance easier.

        */

    }
}
