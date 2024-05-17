import java.util.Scanner;

public class PrintNumbersWithoutLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        scanner.close();

        printNumbers(N);
    }

    public static void printNumbers(int N) {
        if (N < 1) {
            return;
        }
        System.out.print(N + " ");
        printNumbers(N - 1);
    }
}
