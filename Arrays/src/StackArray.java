import java.util.Scanner;

public class StackArray {
	int top;
	int arr[];
	int size=5;
StackArray()
{
	 arr=new int[size];
	top=-1;
}
void push(int x)
{
	if(top>size)
	{
		System.out.println("Stack overflow");
	}
	else
	{
			arr[++top]=x;
		
			System.out.println("Element  "    +x+  " is inserted");
		}
	}

int pop()
{
	int q=0;
	  if (top >= 0)
	  {  
		  q=arr[top--];
		   System.out.println("Element deleted");
		  
	 }
	  else 
	      {  
		  System.out.println("Stack Underflow");
		 
		  } 
	return q;
	
}
boolean isEmpty() 
{
	if(top<0) 
	{
		System.out.println("Stack is Empty");
	}
	else
	{
		System.out.println("Stack is not Empty");
	}
	return false;
	
}
	public static void main(String[] args)
	{
	  StackArray SA=new StackArray();
	  Scanner sc=new Scanner(System.in);
	  int m=0;
	do {
		  System.out.println("1.push 2.pop 3.display");
		  int s=sc.nextInt();
		 
	      switch(s)
	      {
	      case 1:System.out.println("push the element");
	             int x=sc.nextInt();
	             SA.push(x);
	             break;
	       
	      case 2:System.out.println("pop the element");
	            SA.pop();
	            break;
	            
	      case 3:System.out.println("Stack is Empty or Not");      
	            SA.isEmpty();
	            break;
	      }
	      System.out.println("1.continue\n2.Exit");
			 m=sc.nextInt();
			
		}
	while(m==1);
			
			{
				System.out.println("continue");

			}
		  
	  }
	  
	}

