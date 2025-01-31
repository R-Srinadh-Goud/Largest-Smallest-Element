import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        int max = arr[0], min = arr[0];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (i == 0 || arr[i] > max) max = arr[i];
            if (i == 0 || arr[i] < min) min = arr[i];
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);

        scanner.close();
    }
}

