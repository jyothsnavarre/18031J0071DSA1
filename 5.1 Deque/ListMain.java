import java.util.Scanner;

class Node 
{
	int data;
	Node next;
	  public Node(int a)
	 {
		 data=a;
		 next=null;
	 }
	public  Node()
	  {
		  
	  }  
}
class ListProg
{
	Node head;
	public ListProg()
	{
		head=null;
	}
	public void pushEnd(int nu)
	{
		Node n = new Node(nu);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	public void pushFront(int nu)
	{
		Node n = new Node(nu);
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	public void PushMiddle(int nu)
	{
		int c=1;
		Node n = new Node(nu);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
			while(c!=size()/2)
			{
				temp=temp.next;
				c++;
			}
			n.next=temp.next;
			temp.next=n;
			}
			
		}
	public int size() {
		// TODO Auto-generated method stub
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			count=count+1;
			
		}
		return count;
	    }
	public void pushBefore(int nu,int num)
	{
		Node n=new Node(nu);
		if(head==null)
		{
			head=n;
		}
		else
		{
		Node temp=head;
		while(temp.next.data!=num && temp.next!=null)
		{
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
		}
	}
	public void pushAfter(int nu,int num)
	{
		Node n = new Node(nu);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp = head;
			while(temp.next.data!=num && temp.next!=null)
			{
				temp=temp.next;
			}
			temp=temp.next;
			n.next=temp.next;
			temp.next=n;
		}
	}
	public int popatfront()
	{
		Node temp=head;
		Node sec=null;
		if(head==null)
		{
			System.out.println("no node in list");
			
		}
		 if(head.next==null)
			{
				int ele=head.data;
				head=null;
				return ele;
			}
		else
		 {	
			 int ele=head.data;
			 head=head.next;
			return ele;
		 }
		
	}
	public int popatmiddle()
	{	
		int count=1;
		Node temp=head;
		Node sec=null;
		System.out.println("size is"+size()/2);
		
		while(count!=size()/2)
		{
			sec=temp;
			temp=temp.next;
			count++;
		}
		
		System.out.println("temp data"+temp.data);
		temp.next=temp.next.next;
	
		return temp.data;
		
		
	}
	
	public void disply()
	{	
		Node temp=head;
		while(temp!=null)
		{	System.out.print(temp.data+",");
		
			temp=temp.next;
		}
	}
	public int popEnd()
	{
			if(head==null)
				
			{
				System.out.println("Stack is empty");
				return -1;
			}
			else if(head.next==null)
			{Node temp1=head;
			head=null;
				return temp1.data;
			}
			else
			{
				Node temp1=head;
			
			while(temp1.next.next!=null)
			{
				temp1=temp1.next;
			}
			//temp1=temp1.next;
			temp1.next=null;
			return temp1 .data;
			}
		}
	}
public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListProg lp = new ListProg();
	/*	lp.disply();
		System.out.println("------------");
		lp.pushFront(1);
		lp.pushEnd(2);
		lp.disply();
		lp.pushFront(3);
		System.out.println("------------");
		lp.disply();
		System.out.println("------------");
		lp.popEnd();
		lp.disply();
		System.out.println("-------------///");
	//	System.out.println(+lp.popEnd());
		lp.popatfront();
		lp.disply();
		System.out.println("------------");*/
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s[] = new String[num];
		for(int i=0;i<num;i++)
		{
			s[i]=sc.nextLine();
		}
		String split[] = new String[1];
		for(int i=0;i<num;i++)
		{
			split=s[i].split(" ");
			switch(split[0])
			{
			case "pushLeft" :
			{
				lp.pushFront(Integer.parseInt(split[1]));
				System.out.print("[");
				lp.disply();
				System.out.print("]");
				System.out.println("");
				break;
			}
			case "pushRight" :
			{
				lp.pushEnd(Integer.parseInt(split[1]));
				System.out.print("[");
				lp.disply();
				System.out.print("]");
				System.out.println("");
				break;
			}
			case "size" :
			{
				System.out.println(lp.size());
				System.out.print("[");
				lp.disply();
				System.out.print("]");
				System.out.println("");
				break;
			}
			case "popRight" : 
			{
				 lp.popEnd();
				 System.out.print("[");
				lp.disply();
				System.out.print("]");
				System.out.println("");
				break;
			}
			case "popLeft":
			{
			lp.popatfront();
			System.out.print("[");
			  lp.disply();
			  System.out.print("]");
			  System.out.println("");
			  break;
			}
		}
	}
	}
}