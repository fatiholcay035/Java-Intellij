// L34_Encapsulation.java
// Lesson 34: Encapsulation in Java
// Encapsulation means hiding the internal details of an object
// and controlling access through public methods.

public class L34_Encapsulation {

    // Private variables: cannot be accessed directly from outside the class
    private String username;
    private String password;

    // Setter method for username
    public void setUsername(String newUsername) {
        if (newUsername != null && !newUsername.isEmpty()) {
            username = newUsername;
        } else {
            System.out.println("Invalid username!");
        }
    }

    // Getter method for username
    public String getUsername() {
        return username;
    }

    // Setter method for password
    public void setPassword(String newPassword) {
        if (newPassword.length() >= 6) {
            password = newPassword;
        } else {
            System.out.println("Password must be at least 6 characters!");
        }
    }

    // Getter method for password (in real systems, we don’t show passwords)
    public String getPassword() {
        return "**** (hidden for security)";
    }

    // Method to display info
    public void showInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + getPassword());
    }

    public static void main(String[] args) {
        // Create an object of this class
        L34_Encapsulation account = new L34_Encapsulation();

        // Set values using setter methods
        account.setUsername("Fatih123");
        account.setPassword("123456");

        // Access data safely using getter methods
        System.out.println("User: " + account.getUsername());
        System.out.println("Password Info: " + account.getPassword());

        // Show user info
        account.showInfo();
    }
}

/*
 Notes (in English):

- Encapsulation = Protecting data by making fields private.
- Access is provided only through public methods (getters and setters).
- Benefits:
    Data security (cannot be changed directly)
    Validation can be added easily
    Code becomes modular and easy to maintain

Structure:
   private variables → accessed using → public getter/setter methods
*/
