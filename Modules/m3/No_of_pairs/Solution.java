import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" element");
			a[i]=s.nextInt();
		}
	Arrays.sort(a);
	int count=0;
	for(int i=0;i<n-1;i++)
	{
		if(a[i]==a[i+1])
		{
			count++;
		}
	}
	System.out.println(" No of pairs: "+count);
	}
}
