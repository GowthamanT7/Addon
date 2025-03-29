package Sample;
		class Node {
		    int data;
		    Node next;

		    public Node(int data) {
		        this.data = data;
		        this.next = null;
		    }
		}

		class Stack {
		    private Node top;

		    public Stack() {
		        this.top = null;
		    }

		    public boolean isEmpty() {
		        return top == null;
		    }

		    public void push(int data) {
		        Node newNode = new Node(data);
		        newNode.next = top;
		        top = newNode;
		        System.out.println("Pushed " + data + " onto the stack.");
		    }

		    public int pop() {
		        if (isEmpty()) {
		            System.out.println("Stack Underflow! Unable to pop.");
		            return -1;
		        }
		        int poppedData = top.data;
		        top = top.next;
		        return poppedData;
		    }

		    public int peek() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty.");
		            return -1;
		        }
		        return top.data;
		    }
		}
		public class Stack2 {
		    public static void main(String[] args) {
		        Stack stack = new Stack();

		        stack.push(10);
		        stack.push(20);
		        stack.push(30);

		        System.out.println("Top element: " + stack.peek());
		        System.out.println("Popped element: " + stack.pop());
		        System.out.println("Is stack empty? " + stack.isEmpty());
		    }
		}