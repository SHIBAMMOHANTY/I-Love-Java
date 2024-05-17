import java.util.Scanner;

public class FactorialNumbers {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        printFactorialNumbers(n);
    }

    public static void printFactorialNumbers(int n) {
        int i = 1;
        long factorial = 1;

        while (factorial <= n) {
            System.out.print(factorial + " ");
            i++;
            factorial *= i;  // Calculate next factorial
        }
    }
}
