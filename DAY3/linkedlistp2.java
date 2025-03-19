package javalearn;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlistp2 {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position!");
            return;
        }

        temp.next = temp.next.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlistp2 list = new linkedlistp2();

        System.out.print("Enter number of elements to insert at beginning: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtBeginning(value);
        }

        list.display();

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();
        System.out.print("Enter position: ");
        int position = sc.nextInt();

        list.insertAtPosition(value, position);
        list.display();

        System.out.print("Enter position to delete: ");
        int delPos = sc.nextInt();

        list.deleteAtPosition(delPos);
        list.display();

        sc.close();
    }
}
