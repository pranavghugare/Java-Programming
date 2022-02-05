import java.util.*;

class Summation{
	public int oddSum(int[] iElements){
		int iOSum=0;
		for(int i=0;i<iElements.length;i++)
		{
			if(iElements[i]%2!=0)
			{
				iOSum+=iElements[i];
			}
		}
		return iOSum;
	}
	
	public int evenSum(int[] iElements){
		int iESum=0;
		for(int i=0;i<iElements.length;i++)
		{
			if(iElements[i]%2==0){
				iESum+=iElements[i];
			}
		}
		return iESum;
	}
}
public class Assignment_321{
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
		Summation sum=new Summation();
		int iEvenResult=sum.oddSum(iArr);
		int iOddResult=sum.evenSum(iArr);
		
		System.out.println("Diffrence int oddSum and evenSum is:"+(iOddResult-iEvenResult));
	}
}
			