import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Numbers: " + Arrays.toString(numbers));

        String[] names;
        names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        System.out.println("Names: " + Arrays.toString(names));

        int[] evenNumbers = new int[10];
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = i * 2;
        }
        System.out.println("Even Numbers: " + Arrays.toString(evenNumbers));
    }
}
