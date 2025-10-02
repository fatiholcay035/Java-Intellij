public class L25_ForEachLoop {
    public static void main(String[] args) {

        // Example 1: For-each loop with an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Traditional for loop
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);  // Prints each element of the array
        }

        // For-each loop (enhanced for loop)
        System.out.println("\nUsing for-each loop:");
        for (int num : numbers) {
            // "num" takes each value from the "numbers" array one by one
            System.out.println(num);
        }

        // Example 2: For-each loop with a String array
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};

        System.out.println("\nFruits list:");
        for (String fruit : fruits) {
            System.out.println(fruit);  // Prints each fruit name
        }

        // Example 3: For-each loop with a 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\nMatrix elements:");
        for (int[] row : matrix) {
            // Each "row" is an inner array
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Example 4: For-each loop with a List (using ArrayList)
        java.util.List<String> cars = java.util.Arrays.asList("BMW", "Tesla", "Audi");

        System.out.println("\nCar brands:");
        for (String car : cars) {
            System.out.println(car);
        }

        // Example 5: Using for-each to calculate sum
        int sum = 0;
        for (int n : numbers) {
            sum += n;  // Adds each number to sum
        }
        System.out.println("\nSum of numbers: " + sum);


    }
}
