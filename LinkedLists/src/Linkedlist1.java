
class Linkedlist1
{
	Node1 head;
	public void insertfirst(int x)
	{
		// TODO Auto-generated method stub
		Node1 n=new Node1(x);

		if(head==null)
		{
		head = n;
		}
		else
		{
		Node1 temp=head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next=n;
		}	
	}
	void insertafter(int data1,int data)
	{
		Node1 temp=head.next;
	    Node1 temp1 = head;
	    while(temp.data!=data)
       {
    	 temp=temp.next;
    	 temp1=temp1.next;
       }
		Node1 n=new Node1(data1);
        n.next=temp1.next;
        temp1.next=n;
	}
	void insertmiddle(int x)
	{
	 Node1 temp = head;
	 Node1 temp1 =head;
	 if(head!=null)
	 {
		 while(temp!=null&&temp1.next!=null)
		 {
			 temp=temp.next.next;
			 temp1=temp1.next; 
		 }
	 System.out.println( " print  in middle" + temp.data);
	}
	}
	void deletefirst()
	{
		if(head!=null)
		 head=head.next;
     }
	void deletelast()
	{
		Node1 temp = head;
		if(temp.next.next!=null)
		{
			temp=temp.next;	
		}
		temp.next=null;
	}	
	void deleteposition(int data)
	{
		Node1 temp=head.next;
        Node1 temp1 = head;
		while(temp.data!=data)
        {
        	temp=temp.next;
        	temp1=temp1.next;
        	
        }
       temp1.next=temp.next;
	}
	void display()
	{
		Node1 n=head;
		while(n!=null)
		{
			System.out.println(n.data+ " ");
			n=n.next;
		}
	}
	
}
