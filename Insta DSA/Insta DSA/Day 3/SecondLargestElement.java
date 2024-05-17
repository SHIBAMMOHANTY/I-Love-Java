import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int result = findSecondLargest(arr, n);
        System.out.println("The second largest distinct element is: " + result);
    }

    public static int findSecondLargest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }

        Set<Integer> distinctElements = new HashSet<>();
        for (int num : arr) {
            distinctElements.add(num);
        }

        if (distinctElements.size() < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : distinctElements) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
