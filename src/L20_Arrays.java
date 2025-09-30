public class L20_Arrays {
    public static void main(String[] args) {

        /* Array:
        An array is a collection of elements of the same data type.
        It allows storing multiple values in a single variable.*/

        //  1. Declaring an array
        int[] numbers; // Declaration (no size or values yet)

        //  2. Creating an array with size
        numbers = new int[5]; // Creates an array with 5 elements (indexes: 0 to 4)

        //  3. Assigning values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        //  4. Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[4]);

        //  5. Declaring and initializing an array in one line
        String[] fruits = {"Apple", "Banana", "Cherry", "Orange"};

        //  6. Getting the length of an array
        System.out.println("Number of fruits: " + fruits.length);

        //  7. Looping through an array (using for loop)
        System.out.println("Fruits list:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("- " + fruits[i]);
        }

        //  8. Using enhanced for loop (for-each)
        System.out.println("Fruits list using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //  9. Example: Calculate sum of all numbers in array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of numbers: " + sum);

        //  10. Example: Find the largest number
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number: " + max);

    }
}
