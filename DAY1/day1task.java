package javalearn;

import java.util.Arrays;
import java.util.Scanner;

public class day1task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0, j = size - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));

        int first = arr[0];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = first;
        System.out.println("Rotated Left by Step: " + Arrays.toString(arr));

        int max = arr[0], min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);

        sc.close();
    }
}
