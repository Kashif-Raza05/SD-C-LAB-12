import java.util.Scanner;

public class DivisionGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for two integers
            System.out.print("Enter the first integer: ");
            int num1 = getValidatedInteger(scanner);
            
            System.out.print("Enter the second integer: ");
            int num2 = getValidatedInteger(scanner);

            // Perform division
            int result = num1 / num2;
            System.out.println("The result of " + num1 + " / " + num2 + " is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to validate and retrieve an integer from the user
    private static int getValidatedInteger(Scanner scanner) throws InvalidInputException {
        if (!scanner.hasNextInt()) {
            scanner.next(); // Clear invalid input
            throw new InvalidInputException("Invalid input. Please enter an integer.");
        }
        return scanner.nextInt();
    }
}

// Custom exception for invalid input
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
