// Polymorphism means "many forms".
// It allows one reference type to refer to different object types
// and call the correct method version at runtime.

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class L36_Polymorphism {
    public static void main(String[] args) {

        // Parent reference can point to different child objects
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        // Each object calls its own version of draw() method
        s1.draw(); // Drawing a circle
        s2.draw(); // Drawing a rectangle
        s3.draw(); // Drawing a triangle

        System.out.println();

        // Example with an array of Shape objects
        Shape[] shapes = { new Circle(), new Rectangle(), new Triangle() };

        for (Shape shape : shapes) {
            shape.draw(); // Calls the overridden method based on actual object
        }

        System.out.println();

        // Upcasting: Using parent type to refer to child object
        Shape shapeRef = new Rectangle();
        shapeRef.draw(); // Calls Rectangle's version

        // Downcasting: Converting back to child type
        Rectangle rectRef = (Rectangle) shapeRef;
        rectRef.draw(); // Still calls Rectangle's version
    }
}
