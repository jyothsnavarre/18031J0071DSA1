package ADSFINAL;
import java.util.Scanner;
class Student
{
	String name;
	String rollno;
	double marks;
	public Student(String rollno, String name, double marks)
	{
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
}

class Hash
{	
	int myhash(String r,int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
		sum=sum+i*r.charAt(0);
		}
		sum=sum%n;
		return sum;
	}
	

void get(String rollno,int val,int n)
{
	Student[] s=new Student[n];
	int i=0;
	while(i<n)
	{
		if(val==1)
		{
			if(rollno.equals(s[i].rollno))
			{
				System.out.print(s[i].name);
			}
		}
		
		if(val==2)
		{
			if(rollno.equals(s[i].rollno))
			{
				System.out.print(s[i].marks);
			}
		}
		i++;
	}
}
}


public class Solution 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student[] s=new Student[n];
		Hash h=new Hash();
		int b=0;
	}
}
