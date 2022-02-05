import java.util.*;

class Count{
	public int digitMultiple(int iNo){
		int iMul=1;
		while(iNo!=0)
		{
			int iDigit=iNo%10;
			iMul=iMul*iDigit;
			iNo=iNo/10;
		}
		return iMul;
	}
}
public class Assignment_334{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int iValue=sc.nextInt();
		
		Count obj=new Count();
		int iRet=obj.digitMultiple(iValue);
		
		System.out.println("Multiplication of digits are:"+iRet);
	}
}