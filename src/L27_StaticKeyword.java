public class L27_StaticKeyword {

    // Static variable (shared by all objects)
    static String schoolName = "Sunrise School";

    // Instance variable (unique for each object)
    String studentName;
    int grade;

    // Constructor
    public L27_StaticKeyword(String name, int gradeLevel) {
        studentName = name;
        grade = gradeLevel;
    }

    // Static method
    // It belongs to the class, not to an object
    static void showSchoolInfo() {
        System.out.println("School Name: " + schoolName);
        // Cannot access non-static variables directly here (e.g., studentName)
    }

    // Instance method
    void showStudentInfo() {
        System.out.println("Student: " + studentName + ", Grade: " + grade);
    }

    public static void main(String[] args) {

        // Accessing static variable without creating an object
        L27_StaticKeyword.showSchoolInfo();

        System.out.println("-------------------");

        // Creating objects
        L27_StaticKeyword student1 = new L27_StaticKeyword("Alice", 5);
        L27_StaticKeyword student2 = new L27_StaticKeyword("Bob", 6);

        // Accessing instance method
        student1.showStudentInfo();
        student2.showStudentInfo();

        System.out.println("-------------------");

        // Changing static variable affects all objects
        L27_StaticKeyword.schoolName = "Green Valley School";

        // Calling static method again to see the change
        L27_StaticKeyword.showSchoolInfo();

        // Both objects see the updated static value
        student1.showStudentInfo();
        student2.showStudentInfo();
    }
}
