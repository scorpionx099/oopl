import java.util.Scanner;

class Book {
    int bookId;
    String title;
    boolean issued;

    static int totalBooks = 0;

    // Constructor
    Book(int id, String title) {
        this.bookId = id;
        this.title = title;
        this.issued = false;
        totalBooks++;
    }

    // Issue Book
    void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println(title + " issued successfully.");
        } else {
            System.out.println("Book already issued.");
        }
    }

    // Return Book
    void returnBook() {
        if (issued) {
            issued = false;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    // Display Book Details
    void displayBook() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Issued  : " + issued);
        System.out.println();
    }

    // Static Method
    static void showTotalBooks() {
        System.out.println("Total Books: " + totalBooks);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating Books
        Book b1 = new Book(101, "Java Programming");
        Book b2 = new Book(102, "Database Systems");

        int choice, bookChoice;

        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Total Books");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n----- Available Books -----");
                    b1.displayBook();
                    b2.displayBook();
                    break;

                case 2:
                    System.out.println("\nSelect Book to Issue:");
                    System.out.println("1. Java Programming");
                    System.out.println("2. Database Systems");

                    System.out.print("Enter book choice: ");
                    bookChoice = sc.nextInt();

                    switch (bookChoice) {
                        case 1:
                            b1.issueBook();
                            break;

                        case 2:
                            b2.issueBook();
                            break;

                        default:
                            System.out.println("Invalid Book Choice");
                    }
                    break;

                case 3:
                    System.out.println("\nSelect Book to Return:");
                    System.out.println("1. Java Programming");
                    System.out.println("2. Database Systems");

                    System.out.print("Enter book choice: ");
                    bookChoice = sc.nextInt();

                    switch (bookChoice) {
                        case 1:
                            b1.returnBook();
                            break;

                        case 2:
                            b2.returnBook();
                            break;

                        default:
                            System.out.println("Invalid Book Choice");
                    }
                    break;

                case 4:
                    Book.showTotalBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}