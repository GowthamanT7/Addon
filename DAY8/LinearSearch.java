package Sample;
import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
	public static void Linear(int[]temp,int f) {
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]==f) {
				System.out.println("Match found");
				return;
			}

			}
		System.out.println("Match not found");
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter a value:");
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	System.out.println("Enter the value you need:");
	int find=sc.nextInt();
	Linear(a,find);
	
	

}
}