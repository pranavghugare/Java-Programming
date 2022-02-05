///Singly LL in java
class Node
{
	public int data;
	public Node next;
}
class SinglyLL
{
	private Node first;
	private int size;
	
	public SinglyLL()
	{
		this.first=null;
		this.size=0;
	}
	
	public void InsertFirst(int no)
	{
		 Node newn=null;
		 newn=new Node();
		 
		 newn.data=no;
		 newn.next=null;
		 
		 if(first==null)
		 {
			 first=newn;
			 
		 }
		 else
		 {
			 newn.next=first;
			 first=newn;
		 }
		 this.size++;
	}
	public void InsertLast(int no)
	{
		Node temp=first;
		 Node newn=null;
		 newn=new Node();
		 
		 newn.data=no;
		 newn.next=null;
		 
		 if(first==null)
		 {
			 first=newn;
			 
		 }
		 else
		 {
			 while(temp.next!=null)
			 {
				temp=temp.next;
			 }
			 temp.next=newn;
		 }
		 this.size++;
	}
	public void DeleteFirst()
	{
		if(size==0)
		{
			return;
		}
		else if(size==1)
		{
			first=null;
		}
		else 
		{
			first=first.next;
		}
		this.size--;
	}	
	public void DeleteLast()
	{
		if(size==0)
		{
			return;
		}
		else if(size==1)
		{
			first=null;
		}
		else 
		{
			Node temp=first;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
		this.size--;
	}
	public void InserAtPos(int no,int pos)
	{
		if((pos<0)||(pos>size+1))
		{
			return ;
		}
		else if(pos==1)
		{
			InsertFirst(no);
		}
		else if(pos==size+1)
		{
			InsertLast(no);
		}
		else
		{
			Node newn=new Node();
			newn.data=no;
			newn.next=null;
			
			Node temp=first;
			for(int i=0;i<pos-1;i++)
			{
				temp=temp.next;
			}
			newn.next=temp.next;
			temp.next=newn;
			this.size++;
		}	
	}
	public void DeleteAtPos(int pos)
	{
		
		if((pos<0)||(pos>size+1))
		{
			return ;
		}
		else if(pos==1)
		{
			DeleteFirst();
		}
		else if(pos==size+1)
		{
			DeleteLast();
		}
		else
		{
			Node temp=first;
			for(int i=0;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			this.size--;
		}
	}
	public void Display()
	{
		Node temp=first;
		while(temp!=null)
		{
			System.out.print("|"+temp.data+"|->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public int Count()
	{
		return this.size;
	}
}
class Program263
{
	public static void main(String[] args)
	{
		SinglyLL obj=new SinglyLL();
		obj.InsertFirst(10);
		obj.InsertFirst(20);
		obj.InsertFirst(30);
		obj.InsertFirst(40);
		obj.InsertLast(50);
		obj.InsertLast(60);
		obj.InserAtPos(45,5);
		obj.InserAtPos(55,6);
		obj.DeleteAtPos(5);
		obj.Display();
		int iRet=obj.Count();
		System.out.println("Count is "+iRet);
		obj.DeleteFirst();
		obj.Display();
		iRet=obj.Count();
		System.out.println("Count is "+iRet);
		obj.DeleteLast();
		obj.Display();
		iRet=obj.Count();
		System.out.println("Count is "+iRet);
		
	}
}