import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user for the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user for the operation
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        // Perform the operation based on the user's input
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check if division by zero
                if (num2 == 0) {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        // Display the result
        System.out.println("Result: " + result);
    }
}
