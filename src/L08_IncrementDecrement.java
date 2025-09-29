public class L08_IncrementDecrement {
    public static void main(String[] args) {

        int number = 5;

        // Increment (++) increases the value by 1
        number++;  // same as: number = number + 1
        System.out.println("After number++ : " + number);  // Output: 6

        // Decrement (--) decreases the value by 1
        number--;  // same as: number = number - 1
        System.out.println("After number-- : " + number);  // Output: 5

        // Pre-increment: ++variable
        // The value is increased first, then used in the expression
        int preIncrement = ++number;  // number becomes 6, then assigned to preIncrement
        System.out.println("preIncrement: " + preIncrement);  // Output: 6
        System.out.println("number after preIncrement: " + number);  // Output: 6

        // Post-increment: variable++
        // The value is used first, then increased
        int postIncrement = number++;  // postIncrement = 6, then number becomes 7
        System.out.println("postIncrement: " + postIncrement);  // Output: 6
        System.out.println("number after postIncrement: " + number);  // Output: 7

        // Pre-decrement: --variable
        // The value is decreased first, then used
        int preDecrement = --number;  // number becomes 6, then assigned to preDecrement
        System.out.println("preDecrement: " + preDecrement);  // Output: 6
        System.out.println("number after preDecrement: " + number);  // Output: 6

        // Post-decrement: variable--
        // The value is used first, then decreased
        int postDecrement = number--;  // postDecrement = 6, then number becomes 5
        System.out.println("postDecrement: " + postDecrement);  // Output: 6
        System.out.println("number after postDecrement: " + number);  // Output: 5

    }
}
