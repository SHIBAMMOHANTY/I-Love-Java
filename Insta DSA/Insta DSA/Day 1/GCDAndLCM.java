import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (A): ");
        int A = scanner.nextInt();
        System.out.print("Enter the second number (B): ");
        int B = scanner.nextInt();
        scanner.close();

        int gcd = findGCD(A, B);
        int lcm = findLCM(A, B, gcd);

        System.out.println("GCD of " + A + " and " + B + " is: " + gcd);
        System.out.println("LCM of " + A + " and " + B + " is: " + lcm);
    }

    // Method to find the GCD using the Euclidean algorithm
    public static int findGCD(int A, int B) {
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

    // Method to find the LCM
    public static int findLCM(int A, int B, int gcd) {
        return Math.abs(A * B) / gcd;
    }
}
