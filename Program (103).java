import java.util.*;

class Searching
{
	public boolean LinearSearch(int Arr[],int no)
	{
		int i=0;
		for( i=0;i<Arr.length;i++)
		{
			if(Arr[i]==no)
			{
				break;
			}
		}
		if(i==Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

class Program254
{
	public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int value =sc.nextInt();
		
		Searching obj=new Searching();
		
		boolean bRet=obj.LinearSearch(Arr,value);
		if(bRet==true)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
}