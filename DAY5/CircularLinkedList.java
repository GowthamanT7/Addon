package javaproject;

public class CircularLinkedList {
	Node last;
	class Node {
		int data;
		Node next=null;
		Node(int val){
			data=val;
			next=null;
		}
	}
	CircularLinkedList() {
		last=null;
	}
	public void insertAtBegin(int val) {
		Node newNode = new Node(val);
        if (last == null) {
            last = newNode;
            newNode.next = last;
        } else {
            Node temp = last;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = last;
            last = newNode;
        }
	}
	public void display() {
		  if (last == null) {
	            System.out.println("List is empty.");
	            return;
		  }
	        Node temp = last;
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != last);
	        System.out.println();
	}
	public void deleteAtBegin() {
		 if (last.next == last) {
	            last = null;
	        } else {
	            Node temp = last;
	            while (temp.next != last) {
	                temp = temp.next;
	            }
	            last = last.next;
	            temp.next = last;
	        }
	}
	public static void main(String[] args) {
		CircularLinkedList c=new CircularLinkedList();
		c.insertAtBegin(1);
		c.insertAtBegin(2);
		c.insertAtBegin(3);
		c.insertAtBegin(4);
		c.insertAtBegin(5);
		c.display();
		c.deleteAtBegin();
		c.display();
	}
}
