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


        ////////CREATING AND USING ARRAYS////////

        // 1️ Creating an array of integers with a fixed size of 5
        int[] numbers1 = new int[5];

        // 2️ Assigning values to each element (index starts from 0)
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;
        numbers1[3] = 40;
        numbers1[4] = 50;

        // 3️ Accessing and printing individual elements
        System.out.println("First element: " + numbers1[0]); // Output: 10
        System.out.println("Last element: " + numbers1[4]);  // Output: 50

        // 4️ Getting the length (total number of elements)
        System.out.println("Array length: " + numbers1.length);

        // 5️ Using a for loop to print all elements
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers1[i]);
        }

        // 6️ Using an enhanced for loop (simpler way)
        System.out.println("Using enhanced for loop:");
        for (int num : numbers1) {
            System.out.println(num);
        }

        // 7️ Creating and initializing an array in one line
        String[] fruits1 = {"Apple", "Banana", "Cherry", "Orange"};

        // 8️ Accessing and printing string array elements
        System.out.println("Fruits list:");
        for (String fruit : fruits1) {
            System.out.println(fruit);
        }

        // 9️ Example: Sum of all numbers in the array
        int sum1 = 0;
        for (int num : numbers) {
            sum1 += num;
        }
        System.out.println("Sum of all numbers: " + sum1);

    }
}
