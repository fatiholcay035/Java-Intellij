import java.util.Arrays;

public class L22_MultidimensionalArray {
    public static void main(String[] args) {

        // 1️ Creating a 2D array (3 rows, 2 columns)
        int[][] numbers = new int[3][2];
        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[1][0] = 30;
        numbers[1][1] = 40;
        numbers[2][0] = 50;
        numbers[2][1] = 60;

        // 2️ Printing all elements using nested loops
        System.out.println("Printing 2D array:");
        for (int i = 0; i < numbers.length; i++) {           // rows
            for (int j = 0; j < numbers[i].length; j++) {    // columns
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // 3️ Creating and initializing directly
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Matrix elements:");
        for (int[] row : matrix) {        // Each row is an array
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // 4️ Using Arrays.deepToString() to print easily
        System.out.println("Matrix (deep print): " + Arrays.deepToString(matrix));

        // 5️ Example: Find sum of all elements
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println("Total sum: " + sum);

        // 6️ 3D array example (concept)
        int[][][] cube = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };
        System.out.println("Element [1][0][2]: " + cube[1][0][2]); // Output: 9

    }
}
