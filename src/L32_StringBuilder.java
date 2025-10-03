package lessons;

public class L32_StringBuilder {
    public static void main(String[] args) {

        // StringBuilder is used to create and manipulate mutable strings in Java.
        // Unlike String objects, StringBuilder can be changed without creating a new object.

        //  Example 1: Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original: " + sb); // Output: Hello

        //  Example 2: append() - adds text to the end
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        //  Example 3: insert() - adds text at a specific index
        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb); // Output: Hello, Java World

        //  Example 4: replace() - replaces a portion of text
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb); // Output: Hi, Java World

        //  Example 5: delete() - removes a portion of text
        sb.delete(3, 8);
        System.out.println("After delete: " + sb); // Output: Hi World

        //  Example 6: reverse() - reverses the characters
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW iH

        //  Example 7: length() and capacity()
        System.out.println("Length: " + sb.length());     // Number of characters
        System.out.println("Capacity: " + sb.capacity()); // Default is 16 + initial length

        //  Example 8: toString() - converts StringBuilder to String
        String text = sb.toString();
        System.out.println("Converted to String: " + text);

        //  Example 9: setCharAt() - changes a specific character
        sb.reverse(); // Let's reverse again to normal
        sb.setCharAt(0, 'H');
        System.out.println("After setCharAt: " + sb); // Output: Hello World

        //  Example 10: compare String vs StringBuilder
        // String creates a new object each time it changes
        String str = "Hello";
        str = str + " World"; // creates a new String object
        System.out.println("String: " + str);

        // StringBuilder changes the same object (more efficient)
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println("StringBuilder: " + sb2);
    }
}
