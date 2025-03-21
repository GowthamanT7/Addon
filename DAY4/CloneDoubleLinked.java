package javaproject;


public class CloneDoubleLinked {
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int val){
			data=val;
			next=null;
			prev=null;
		}
	}
	public CloneDoubleLinked(){
		head=null;
	}
	public void insertAtBegin(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			newNode.next=temp;
			head=newNode;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void cloneOfList() {
		Node temp=head;
		while(temp!=null) {
			Node dptemp=new Node(temp.data);
			dptemp.next=temp.next;
			temp.next=dptemp;
			dptemp.prev=temp;
			temp=dptemp.next;
		}
	}
	public static void main(String[] args) {
		CloneDoubleLinked cl=new CloneDoubleLinked();
		cl.insertAtBegin(11);
		cl.insertAtBegin(22);
		cl.insertAtBegin(33);
		cl.display();
		System.out.println();
		cl.cloneOfList();
		cl.display();
	}

}
