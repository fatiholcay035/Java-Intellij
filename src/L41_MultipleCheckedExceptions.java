import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class L41_MultipleCheckedExceptions {
    public static void main(String[] args) {

        System.out.println("Program started...");

        try {
            // Checked exceptions must be handled at compile time.

            // 1️⃣ FileNotFoundException (a subclass of IOException)
            File file = new File("example.txt");
            FileReader reader = new FileReader(file);

            // 2️⃣ IOException
            int data = reader.read(); // may throw IOException
            System.out.println("Data: " + data);

            reader.close();

            // 3️⃣ InterruptedException
            Thread.sleep(1000);
            System.out.println("Thread woke up!");

        } catch (IOException e) {
            // Handles both FileNotFoundException and other IO errors
            System.out.println("I/O Error occurred: " + e.getMessage());

        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted!");

        } catch (Exception e) {
            // General exception for any other checked/unchecked issue
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Program finished safely!");

        /*

         Checked Exceptions:

        These are exceptions that the compiler checks during compilation.
        You must handle them using try-catch or declare them using throws.
        Examples include:


        IOException

        FileNotFoundException

        InterruptedException

        SQLException

        Multiple Checked Exceptions:
        A single block of code may throw more than one checked exception.
        You can handle them:

        With multiple catch blocks, or

        With a single multi-catch block if they require the same handling.

        Order matters:
        More specific exceptions (like FileNotFoundException) must come before more general ones (IOException or Exception).

                */
    }
}
