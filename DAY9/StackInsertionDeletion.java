package Sample;
public class Stack1 {
	int num[]=new int[6];
	int top=-1;
	public void push(int n)
	{
		if(top<num.length)
		{
		++top; 
		num[top]=n; 
	}
		else {
			System.out.println("Stack overflow");
		}
	}
	public void peek() {
		System.out.println("Peek element"+" "+num[top]);
	}
	public void pop()
	{
		if(top!=-1)
		{
		System.out.println("Popped element is"+" "+num[top--]);
		
	}
		else {
			System.out.println("Stack overflow");
		}
	}
	public static void main(String[] args) {
		Stack1 s=new Stack1();
		s.push(45);
		s.push(30);
		s.push(10);
		s.push(17);
		s.push(21);
		s.peek();
		s.pop();
		s.pop();
		s.peek();
		}
}