class Node
{
	public int data;
	public Node next;
	public Node prev;
}

class DoublyLL
{
	private Node first;
	private int size;
	
	public DoublyLL()
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
		newn.prev=null;
		
		if(first==null)
		{
			first=newn;
		}
		else
		{
			newn.next=first;
			newn.prev=null;
			first=newn;
		}
		size++;
	}
	public void InsertLast(int no)
	{
		Node newn=null;
		newn=new Node();
		newn.data=no;
		newn.next=null;
		newn.prev=null;
		
		if(first==null)
		{
			first=newn;
		}
		else
		{
			Node temp=first;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newn;
			newn.prev=temp;
			newn.next=null;
		}
		size++;
	}
	public void InserAtPositon(int no,int pos)
	{
		if((pos<0)&&(pos>size+1))
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
			Node temp=first;
			Node newn=null;
			newn =new Node();
			newn.data=no;
			newn.next=null;
			newn.prev=null;
			
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			newn.next=temp.next;
			temp.next.prev=newn;
			temp.next=newn;
			newn.prev=temp;
		}
		size++;
	}
	public void DeleteFirst()
	{
		if(first==null)
		{
			return;
		}
		else
		{
			first.next.prev=null;
			first=first.next;
		}
		size--;
	}
	public void DeleteLast()
	{
		if(first==null)
		{
			return;
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
		size--;
	}
	public void DeleteAtPosition(int pos)
	{
		if((pos<0)&&(pos>size+1))
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
			
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			temp.next.prev=temp;
		}
		size--;
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
	int Count()
	{
		return size;
	}
}

class Program264
{
		public static void main(String[] args)
		{
			DoublyLL obj=new DoublyLL();
			obj.InsertFirst(40);
			obj.InsertFirst(30);
			obj.InsertFirst(20);
			obj.InsertFirst(10);
			obj.InsertLast(50);
			obj.Display();
			int iRet=obj.Count();
			System.out.println(iRet);
			obj.InserAtPositon(25,3);
			obj.Display();
			iRet=obj.Count();
			System.out.println(iRet);
			obj.DeleteAtPosition(3);
			obj.Display();
			iRet=obj.Count();
			System.out.println(iRet);
		}
}