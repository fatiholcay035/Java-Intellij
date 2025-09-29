public class L13_StringManipulation {
    public static void main(String[] args) {

        // -----------------------------
        // 1️ STRING BASICS
        // -----------------------------
        String text = "Java Programming";

        // String length (number of characters)
        System.out.println("Length: " + text.length());  // Output: 16

        // Access character by index (starts from 0)
        System.out.println("First character: " + text.charAt(0));  // Output: J

        // Convert to upper case
        System.out.println("Upper case: " + text.toUpperCase());  // Output: JAVA PROGRAMMING

        // Convert to lower case
        System.out.println("Lower case: " + text.toLowerCase());  // Output: java programming

        // -----------------------------
        // 2️ STRING COMPARISON
        // -----------------------------
        String a = "Hello";
        String b = "hello";

        // equals() checks exact match (case-sensitive)
        System.out.println("equals(): " + a.equals(b));  // false

        // equalsIgnoreCase() ignores letter case
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b));  // true

        // compareTo() compares lexicographically (alphabetical order)
        System.out.println("compareTo(): " + a.compareTo(b));  // non-zero value (H != h)

        // -----------------------------
        // 3️ CHECKING CONTENT
        // -----------------------------
        String sentence = "Java is fun and powerful";

        // contains() → checks if substring exists
        System.out.println("Contains 'fun': " + sentence.contains("fun"));  // true

        // startsWith() → checks beginning of string
        System.out.println("Starts with 'Java': " + sentence.startsWith("Java"));  // true

        // endsWith() → checks ending of string
        System.out.println("Ends with 'ful': " + sentence.endsWith("ful"));  // true

        // -----------------------------
        // 4️ STRING EXTRACTION
        // -----------------------------
        String word = "Programming";

        // substring(start) → from start index to end
        System.out.println("Substring from 3: " + word.substring(3));  // Output: gramming

        // substring(start, end) → from start to (end - 1)
        System.out.println("Substring(0,4): " + word.substring(0, 4));  // Output: Prog

        // -----------------------------
        // 5️ REPLACING & TRIMMING
        // -----------------------------
        String phrase = "   Java is cool!   ";

        // trim() → removes spaces at start and end
        System.out.println("Trimmed: '" + phrase.trim() + "'");  // Output: 'Java is cool!'

        // replace() → replaces old text with new
        System.out.println("Replace: " + phrase.replace("cool", "awesome"));  // Java is awesome!

        // -----------------------------
        // 6️ SPLIT & CONCATENATION
        // -----------------------------
        String names = "Ali, Veli, Ayşe";

        // split() → divides string into array
        String[] arr = names.split(", ");
        System.out.println("First name: " + arr[0]);  // Output: Ali

        // concat() → joins strings together
        String first = "Hello";
        String second = "World";
        String combined = first.concat(" ").concat(second);
        System.out.println("Concatenated: " + combined);  // Output: Hello World

        // Alternatively, use + operator
        System.out.println("With + : " + first + " " + second);  // Output: Hello World

        // -----------------------------
        // 7️ STRING IMMUTABILITY
        // -----------------------------
        String original = "Java";
        String modified = original.concat(" Rocks!");

        System.out.println("Original: " + original);  // Java
        System.out.println("Modified: " + modified);  // Java Rocks!
        // Strings are immutable → original doesn't change

        // -----------------------------
        // 8️ SUMMARY
        // -----------------------------
        // Common String Methods:
        // - length(), charAt(), toUpperCase(), toLowerCase()
        // - equals(), equalsIgnoreCase(), compareTo()
        // - contains(), startsWith(), endsWith()
        // - substring(), trim(), replace(), split(), concat()
        // Strings are IMMUTABLE (cannot be changed directly)

    }
}
