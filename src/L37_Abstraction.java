// Abstraction means hiding unnecessary details and showing only essential features.
// In Java, abstraction is achieved using abstract classes and interfaces.

// Abstract class example
abstract class Payment {

    // Abstract method (no body) - must be implemented by subclasses
    abstract void pay();

    // Non-abstract (concrete) method - can be used directly
    void printReceipt() {
        System.out.println("Printing payment receipt...");
    }
}

// Subclass 1
class CreditCardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

// Subclass 2
class CashPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using Cash");
    }
}

public class L37_Abstraction {
    public static void main(String[] args) {

        // We cannot create an object of an abstract class directly
        // Payment payment = new Payment(); //  Not allowed

        // But we can use a reference of the abstract class
        Payment p1 = new CreditCardPayment();
        Payment p2 = new CashPayment();

        p1.pay();           // Calls CreditCardPayment's implementation
        p1.printReceipt();  // Calls concrete method from abstract class

        System.out.println();

        p2.pay();           // Calls CashPayment's implementation
        p2.printReceipt();  // Calls concrete method from abstract class
    }
}
