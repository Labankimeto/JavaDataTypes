import java.util.Scanner;

public class DataTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to see which data types can store it:");
        
        // Read user input as long (can handle big numbers)
        try {
            long number = scanner.nextLong();

            System.out.println("\n✅ The number " + number + " can be stored in:");

            if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                System.out.println("- byte");
            }
            if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                System.out.println("- short");
            }
            if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                System.out.println("- int");
            }
            if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                System.out.println("- long");
            }

        } catch (Exception e) {
            System.out.println("❌ Invalid input. Please enter a valid whole number (no decimals).");
        }

        scanner.close();
    }
}
