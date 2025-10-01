import java.util.Arrays;

public class L21_ArrayMethods {
    public static void main(String[] args) {

        // 1️ Create and initialize an integer array
        int[] numbers = {5, 2, 9, 1, 7};

        // 2 Print the array as a string
        System.out.println("Original array: " + Arrays.toString(numbers));
        // Arrays.toString() converts array into a readable string format

        // 3️ Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        // Arrays.sort() arranges elements from smallest to largest

        // 4️ Binary search (works only on sorted arrays)
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Index of 7: " + index);
        // Arrays.binarySearch() finds the position of a specific value

        // 5️ Copy the array into a new one
        int[] copyArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copyArray));
        // Arrays.copyOf() creates a new array with copied elements

        // 6️ Compare two arrays
        boolean isEqual = Arrays.equals(numbers, copyArray);
        System.out.println("Are both arrays equal? " + isEqual);
        // Arrays.equals() checks if both arrays have the same elements

        // 7️ Fill an array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 100);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
        // Arrays.fill() assigns the same value to all elements

        // 8️ Sorting and reversing a String array
        String[] fruits = {"Orange", "Apple", "Banana", "Kiwi"};
        Arrays.sort(fruits); // Sort alphabetically
        System.out.println("Sorted fruits: " + Arrays.toString(fruits));

        // 9️ Convert an array to a stream (advanced use)
        long count = Arrays.stream(numbers).count();
        System.out.println("Number of elements in numbers array: " + count);
        // Arrays.stream() lets you use Stream API for advanced operations

    }
}
