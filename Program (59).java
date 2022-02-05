import java.util.*;

class Count{
	public int difference(int iNo){
		int eSum=0;
		int oSum=0;
		while(iNo!=0)
		{
			int iDigit=iNo%10;
			if(iDigit%2==0){
				eSum+=iDigit;
			}
			else{
				oSum+=iDigit;
			}
			iNo=iNo/10;
		}
		return eSum-oSum;
	}
}
public class Assignment_335{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int iValue=sc.nextInt();
		
		Count obj=new Count();
		int iRet=obj.difference(iValue);
		
		System.out.println("Multiplication of digits are:"+iRet);
	}
}