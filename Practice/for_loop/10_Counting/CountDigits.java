import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int count = 0;

        // Special case: if number is 0, it has 1 digit
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10; // Remove last digit
                count++;        // Increase digit count
            }
        }

        System.out.println("Count: " + count);
    }
}
