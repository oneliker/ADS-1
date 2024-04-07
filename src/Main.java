import java.util.Scanner;

public class Main {
    public static int findMinimum(int n, int[] arr) {
        int minimum = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Minimum element: " + findMinimum(n, arr));

        scanner.close();
    }
}
