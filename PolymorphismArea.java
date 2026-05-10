import java.util.Scanner;

interface Shape {
    double calculateArea();
}

// Circle Class
class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Rectangle Class
class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

// Main Class
public class PolymorphismArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape s = null;

        int choice;

        do {
            System.out.println("\n===== AREA CALCULATOR =====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();

                    s = new Circle(radius);

                    System.out.println("Area of Circle = " + s.calculateArea());
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();

                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();

                    s = new Rectangle(length, width);

                    System.out.println("Area of Rectangle = " + s.calculateArea());
                    break;

                case 3:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}