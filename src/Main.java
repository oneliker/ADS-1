import java.util.Scanner;

public class Main {
    // Problem 1
    public static int findMinimum(int[] arr, int n, int index) {
        if (index == n - 1)
            return arr[index];
        return Math.min(arr[index], findMinimum(arr, n, index + 1));
    }

    // Problem 2
    public static double calculateAverage(int[] arr, int n, int index) {
        if (index == n)
            return 0;
        return (arr[index] + calculateAverage(arr, n, index + 1) * index) / (index + 1);
    }

    // Problem 3
    public static boolean isPrime(int n, int divisor) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % divisor == 0)
            return false;
        if (divisor * divisor > n)
            return true;
        return isPrime(n, divisor + 1);
    }

    // Problem 4
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Problem 5
    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Problem 6
    public static double power(double a, int n) {
        if (n == 0)
            return 1;
        return a * power(a, n - 1);
    }

    // Problem 7
    public static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    // Problem 8
    public static boolean allDigits(String s, int index) {
        if (index == s.length())
            return true;
        return Character.isDigit(s.charAt(index)) && allDigits(s, index + 1);
    }

    // Problem 9
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    // Problem 10
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Problem 1
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++)
            arr1[i] = scanner.nextInt();
        System.out.println("Problem 1: " + findMinimum(arr1, n1, 0));

        // Problem 2
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = scanner.nextInt();
        System.out.println("Problem 2: " + calculateAverage(arr2, n2, 0));

        // Problem 3
        int n3 = scanner.nextInt();
        System.out.println("Problem 3: " + (isPrime(n3, 2) ? "Prime" : "Composite"));

        // Problem 4
        int n4 = scanner.nextInt();
        System.out.println("Problem 4: " + factorial(n4));

        // Problem 5
        int n5 = scanner.nextInt();
        System.out.println("Problem 5: " + fibonacci(n5));

        // Problem 6
        int a6 = scanner.nextInt();
        int n6 = scanner.nextInt();
        System.out.println("Problem 6: " + power(a6, n6));

        // Problem 7
        int n7 = scanner.nextInt();
        int[] arr7 = new int[n7];
        for (int i = 0; i < n7; i++)
            arr7[i] = scanner.nextInt();
        reverseArray(arr7, 0, n7 - 1);
        System.out.print("Problem 7: ");
        for (int i = 0; i < n7; i++)
            System.out.print(arr7[i] + " ");
        System.out.println();

        // Problem 8
        String s8 = scanner.next();
        System.out.println("Problem 8: " + (allDigits(s8, 0) ? "Yes" : "No"));

        // Problem 9
        int n9 = scanner.nextInt();
        int k9 = scanner.nextInt();
        System.out.println("Problem 9: " + binomialCoefficient(n9, k9));

        // Problem 10
        int a10 = scanner.nextInt();
        int b10 = scanner.nextInt();
        System.out.println("Problem 10: " + gcd(a10, b10));

        scanner.close();
    }
}
//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner  = new scanner (Sistem.in);
//        String word = scanner.nextLine();
//        int count = word.length();
//        System.out.printf((count));
//
//    }
//}