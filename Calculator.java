import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        char choice;

        do {
            System.out.println("===== JAVA CALCULATOR =====");

            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            System.out.println("Choose Operation:");
            System.out.println("1  Addition");
            System.out.println("2  Subtraction");
            System.out.println("3  Multiplication");
            System.out.println("4  Division");

            char operator = sc.next().charAt(0);

            try {
                switch (operator) {
                    case '1':
                        result = num1 + num2;
                        System.out.println("Result = " + result);
                        break;

                    case '2':
                        result = num1 - num2;
                        System.out.println("Result = " + result);
                        break;

                    case '3':
                        result = num1 * num2;
                        System.out.println("Result = " + result);
                        break;

                    case '4':
                        if (num2 == 0) {
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                        break;

                    default:
                        System.out.println("Invalid Operator");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator Closed");
        sc.close();
    }
}