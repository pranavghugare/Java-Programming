import java.util.*;

class Searching
{
	public boolean BinarySearch(int Arr[],int no)
	{
		int start,end,mid;
		start=0;
		end=Arr.length-1;
		mid=(start+end)/2;
		while(start<=end)
		{
			if(Arr[mid]==no)
			{
				break;
			}
			else if(no>Arr[mid])
			{
				start=mid+1;
			}
			else if(no<Arr[mid])
			{
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		if(Arr[mid]==no)
		{
			return true;
		}
		else
			return false;
	}
}

class Program255
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