import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array of the specified size
        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display the entered elements
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        // You can now perform operations on the array
        // For example, find the sum of elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        System.out.println("\nSum of elements: " + sum);
    }
}
