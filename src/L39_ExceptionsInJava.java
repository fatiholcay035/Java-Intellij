public class L39_ExceptionsInJava {
    public static void main(String[] args) {

        // Exception = An unexpected event that disrupts the normal flow of a program.
        // There are two main types of exceptions in Java:
        // 1. Checked Exceptions (handled at compile time)
        // 2. Unchecked Exceptions (handled at runtime)

        System.out.println("Program started...");

        try {
            // TRY block = The code that may cause an exception
            int number = 10 / 0; // This line will cause ArithmeticException
            System.out.println("Result: " + number);

        } catch (ArithmeticException e) {
            // CATCH block = Used to handle the exception
            System.out.println("Error: Division by zero is not allowed!");

        } finally {
            // FINALLY block = Always executes (used for cleanup code)
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");

        // Example of Checked Exception
        try {
            Thread.sleep(1000); // may cause InterruptedException (checked)
        } catch (InterruptedException e) {
            System.out.println("The sleep process was interrupted!");
        }

        System.out.println("Program finished successfully!");
    }
}
