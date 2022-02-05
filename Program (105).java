import java.util.*;

class Searching
{
	public void Change(int Arr[])
	{
		for(i=0;i<Arr.length;i++)
		{
			Arr[i]++;
		}
	}
}

class Program256
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
		
		boolean bRet=obj.Change(Arr);
		
		boolean bRet=obj.BinarySearch(Arr,value);
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