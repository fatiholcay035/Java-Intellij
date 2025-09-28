public class L07_Concatenation {
    public static void main(String[] args) {

        // ---------- 1. Concatenating Strings with + ----------
        String firstName = "John";
        String lastName = "Doe";

        // Combine two strings using +
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Concatenate string with numbers
        int age = 25;
        System.out.println("Name and Age: " + firstName + " is " + age + " years old.");

        System.out.println("----------------------------------");

        // ---------- 2. Concatenating multiple Strings ----------
        String greeting = "Hello";
        String place = "World";
        String message = greeting + ", " + place + "!";
        System.out.println("Message: " + message);

        System.out.println("----------------------------------");

        // ---------- 3. Concatenation with other data types ----------
        int a = 10;
        int b = 20;

        // + operator with strings converts numbers to strings
        System.out.println("Sum as String: " + a + b); // not arithmetic sum
        System.out.println("Arithmetic Sum: " + (a + b)); // correct sum using parentheses

        System.out.println("----------------------------------");

        // ---------- 4. Using concat() method ----------
        String str1 = "Java";
        String str2 = "Programming";
        String result = str1.concat(" ").concat(str2); // same as str1 + " " + str2
        System.out.println("Concatenated with concat(): " + result);

        System.out.println("----------------------------------");

        // ---------- 5. Common mistakes ----------
        System.out.println("Without parentheses: " + a + b); // 1020
        System.out.println("With parentheses: " + (a + b)); // 30

    }
}
