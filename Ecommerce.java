import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    // Default Constructor
    Product() {
        id = 0;
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    // Parameterized Constructor
    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost
    double totalCost() {
        return price * quantity;
    }
}

public class Ecommerce {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== E-Commerce Order Processing =====");

        // Taking input from user
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        // Creating object
        Product p1 = new Product(id, name, price, qty);

        // Calculating total
        double total = p1.totalCost();
        double discount = 0;

        // Applying discount
        if (total > 5000) {
            discount = total * 0.20;
        } 
        else if (total > 2000) {
            discount = total * 0.10;
        }

        // Final amount
        double finalAmount = total - discount;

        // Display invoice
        System.out.println("\n===== INVOICE =====");
        System.out.println("Product ID   : " + p1.id);
        System.out.println("Product Name : " + p1.name);
        System.out.println("Price        : " + p1.price);
        System.out.println("Quantity     : " + p1.quantity);
        System.out.println("Total Cost   : " + total);
        System.out.println("Discount     : " + discount);
        System.out.println("Final Amount : " + finalAmount);

        sc.close();
    }
}