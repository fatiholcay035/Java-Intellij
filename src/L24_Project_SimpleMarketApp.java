import java.util.ArrayList;
import java.util.Scanner;

public class L24_Project_SimpleMarketApp {

    public static void main(String[] args) {

        // 1️ Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        // 2️ Create ArrayLists for products and prices
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        // 3️ Add some products to the list
        products.add("Apple");
        prices.add(10.0);

        products.add("Banana");
        prices.add(8.5);

        products.add("Orange");
        prices.add(12.0);

        products.add("Watermelon");
        prices.add(25.0);

        // 4️ Print product list
        System.out.println("=== Welcome to Fatih Market ===");
        System.out.println("Available products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i) + " - " + prices.get(i) + " TL");
        }

        // 5️ Create a cart (shopping list)
        ArrayList<String> cart = new ArrayList<>();
        double total = 0;

        // 6️ Ask user for product selection
        while (true) {
            System.out.print("Enter product number to add to cart (0 to finish): ");
            int choice = input.nextInt();

            if (choice == 0) {
                break; // exit the loop
            }

            if (choice > 0 && choice <= products.size()) {
                cart.add(products.get(choice - 1));
                total += prices.get(choice - 1);
                System.out.println(products.get(choice - 1) + " added to your cart!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // 7️ Print shopping summary
        System.out.println("\n=== Your Shopping Cart ===");
        for (String item : cart) {
            System.out.println("- " + item);
        }

        System.out.println("Total amount: " + total + " TL");
        System.out.println("Thank you for shopping with us!");

        input.close();
    }
}
