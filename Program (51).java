import java.util.*;

class Division{
	public void Display(int[] iElements){
		System.out.println("Elements Divisible by 5 are:");
		for(int i=0;i<iElements.length;i++)
		{
			if(iElements[i]%5==0)
			{
				System.out.println(iElements[i]);
			}
		}
	}
}
public class Assignment_322{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Element");
		int iValue=sc.nextInt();
		int iArr[]=new int[iValue];
		System.out.println("Enter Element");
		for(int i=0;i<iValue;i++)
		{
			iArr[i]=sc.nextInt();
		}
		Division div=new Division();
		div.Display(iArr);		
	}
}
			