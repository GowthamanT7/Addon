package Sample;
public class Recursion {
	public static int sample(int n)
	{
		if(n>0)
		{
			n=n+sample(n-1);
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(sample(5));
		

	}

}

