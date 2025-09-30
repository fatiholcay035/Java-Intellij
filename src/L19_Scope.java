public class L19_Scope {


        // 1️ CLASS LEVEL (GLOBAL) VARIABLE

        // Declared inside the class, but outside any method.
        // Accessible by all methods within the class.
        static int globalCounter = 0; // class (global) variable

        public static void main(String[] args) {


            // 2️ LOCAL VARIABLE (METHOD SCOPE)

            // Declared inside a method, only accessible within that method.

            int localNumber = 10; // local variable
            System.out.println("Local variable: " + localNumber);

            // You can access global variable here too
            globalCounter++;
            System.out.println("Global counter inside main: " + globalCounter);

            // Call another method
            printMessage();

            // Uncommenting below line would cause an ERROR because 'message' is not visible here:
            // System.out.println(message);
        }

        public static void printMessage() {

            // 3️ LOCAL VARIABLE IN ANOTHER METHOD

            String message = "Hello from another method!";
            System.out.println(message);

            // Accessing the global variable is allowed
            globalCounter++;
            System.out.println("Global counter inside printMessage: " + globalCounter);
        }

        public static void showBlockScope() {

            // 4️ BLOCK SCOPE (INSIDE IF / LOOP)

            int x = 5;

            if (x > 0) {
                int y = 10; // y exists only inside this 'if' block
                System.out.println("Inside if block: y = " + y);
            }

            // Uncommenting below line will cause ERROR because y is out of scope
            // System.out.println(y);
        }
    }



