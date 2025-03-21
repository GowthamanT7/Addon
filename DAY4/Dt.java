package javaproject;

public class Dt {
	public static void main(String[] args) {
	DoubleLinkedList l=new DoubleLinkedList();
	l.DoubleInsertBegin(22);
	l.DoubleInsertBegin(33);
	l.DoubleInsertBegin(44);
	l.display();
	l.DoubleinsertAtAnyPos(2, 777);
	System.out.println();
	l.display();
	}
}
