
 class Rectangle {
     double length;
     double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}


public class Main {
    public static void main(String[] args) {
        // Creating objects of Rectangle
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(7, 3);

        // Displaying area and perimeter of rect1
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());

        // Displaying area and perimeter of rect2
        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
    }
}
