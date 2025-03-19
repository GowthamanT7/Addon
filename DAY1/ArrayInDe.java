package javalearn;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInDe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(Arrays.copyOf(arr, size)));

        System.out.print("Enter element to insert: ");
        int newElement = sc.nextInt();
        System.out.print("Enter position: ");
        int position = sc.nextInt();

        if (position >= 0 && position <= size) {
            for (int i = size; i > position; i--) {
                arr[i] = arr[i - 1];
            }
            arr[position] = newElement;
            size++;
            System.out.println("After Insertion: " + Arrays.toString(Arrays.copyOf(arr, size)));
        } else {
            System.out.println("Invalid position!");
        }

        System.out.print("Enter position to delete: ");
        int delPosition = sc.nextInt();

        if (delPosition >= 0 && delPosition < size) {
            for (int i = delPosition; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("After Deletion: " + Arrays.toString(Arrays.copyOf(arr, size)));
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}