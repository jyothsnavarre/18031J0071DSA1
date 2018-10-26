import java.util.Scanner;

public class QueueArray
{
	int size=10;
	int front;
	int rear;
	int arr[];

	QueueArray()
	{
		arr=new int[size];
		front=0;
		rear=-1;
	}
	void enqueue(int x)
	{
		if(rear==size)
		{
			System.out.println("Queue is full");
		}
		else
		{
			arr[++rear]=x;
			System.out.println("Element "+x+ "is Enqueued");
		}
		
	}
	int dequeue()
	{
		int q=0;
	if(rear==-1)
		
	{
		System.out.println("Queue is empty");
	}
	else
	{
		 q=arr[front++];
	}
	return q;
		
		
	
	}
	void display()
	{
		int i;
		for(i=front;i<=rear;i++)
			
		{
			System.out.println(arr[i]);
		}
	}

boolean isEmpty() 
{
	if(front<0) 
	{
		System.out.println("Queue is Empty");
	}
	else
	{
		System.out.println("Queue is not Empty");
	}
	return false;
	
}
	
public static void main(String[] args)
	{
	 QueueArray QA=new QueueArray();
	  Scanner sc=new Scanner(System.in);
	  int m=0;
	do {
		  System.out.println("1.Enqueue 2.Dequeue 3.checkelements 4.display ");
		  int s=sc.nextInt();
		 
	      switch(s)
	      {
	      case 1:System.out.println("enqueue the element");
	             int x=sc.nextInt();
	             QA.enqueue(x);
	             break;
	       
	      case 2:System.out.println("dequeue the element");
	             QA.dequeue();
	            break;
	            
	         
	    
	      case 3:System.out.println(" Queue is empty or not");
	             QA.isEmpty();
	             break;
	             
	      case 4:System.out.println("display the elements");        
	               QA.display();
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
