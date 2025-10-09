public class L42_Throw_Finally {

    public static void main(String[] args) {

        try {
            checkAge(15); // call method with invalid age
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Execution finished. (This is the finally block)");
        }

        System.out.println("Program continues...");
    }

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            // 'throw' creates an exception manually
            throw new Exception("Access denied - You must be at least 18 years old!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
