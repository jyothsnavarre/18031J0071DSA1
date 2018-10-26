import java.util.Scanner;

public class Test1
{
	public static void main(String[] args)
	{
		Linkedlist1 t=new Linkedlist1();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int m=0;
		do {
			
		
		System.out.println("1.insertfirst  2.insertafter 3.display 4.deletefirst  5.deletelast  6.insertmiddle  7.deleteposition");
		
		int s=sc.nextInt();
		switch(s)
		{
		case 1:System.out.println("Insert the data");
		int x = sc.nextInt();
		t.insertfirst(x);
        break;
        
		case 2:
		{
			   System.out.println("insert the data");
		       int x1=sc.nextInt();
		       System.out.println("Enter the position");
		       int a=sc.nextInt();
		       t.insertafter(x1,a);
		       break;
		}
			
		       
		case 3: System.out.println("Display the data");  
                t.display();
                 break;
       
		case 4:System.out.println("delete the first element");
		     
		       t.deletefirst();
		       break;
		      
		case 5:System.out.println("delete the last element");
		       t.deletelast();
		       break;
		       
		case 6:System.out.println("insert element in middle"); 
		       int x2=sc.nextInt();
		       t.insertmiddle(x2);
		       break;
		case 7:System.out.println("delete element at given position");
		       int x3=sc.nextInt();
		       t.deleteposition(x3);
		}
		System.out.println("1.continue\n2.Exit");
		 m=sc.nextInt();
		
	}while(m==1);
		
		{
			System.out.println("continue");

		}
}
		
	}

