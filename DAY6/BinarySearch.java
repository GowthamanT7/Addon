package javaproject;

public class BinarySearch {
	public static int Binary_Search(int arr[],int tar) {
		int l=0;
		int h=arr.length-1;
		int m=0;
		
		while (l<=h) {
			m=(l+h)/2;
		if (arr[m]==tar) {
			return m;
		}
		if (tar<arr[m]) {
			h=m-1;
		}
		else {
			l=m+1;
		}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,10};
		int tar=5;
		int r=Binary_Search(arr, tar);
		if (r==-1) {
			System.out.println("Invalid");
		}
		else {
			System.out.println(r+1);
		}
	}

}
