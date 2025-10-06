
// Access Modifiers in Java
// Access Modifiers define the visibility (scope) of classes, methods, and variables.

class DefaultExample {
    // No modifier means "default" access.
    // Accessible only within the same package.
    String message = "Default Access";

    void showMessage() {
        System.out.println(message);
    }
}

public class L33_AccessModifiers {

    // 1. public → Accessible from anywhere
    public String publicVar = "Public Variable";

    // 2. private → Accessible only within the same class
    private String privateVar = "Private Variable";

    // 3. protected → Accessible within the same package and subclasses
    protected String protectedVar = "Protected Variable";

    // 4. default (no modifier) → Accessible only within the same package
    String defaultVar = "Default Variable";

    // Method to demonstrate access to private variable
    private void showPrivate() {
        System.out.println("This is a private method");
    }

    public void showAll() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        showPrivate();
    }

    public static void main(String[] args) {
        L33_AccessModifiers obj = new L33_AccessModifiers();
        obj.showAll();

        DefaultExample def = new DefaultExample();
        def.showMessage();

        // Explanation Summary:
        // public: Accessible everywhere.
        // private: Accessible only within the same class.
        // protected: Accessible within the same package and by subclasses.
        // default: Accessible only within the same package.
    }
}
