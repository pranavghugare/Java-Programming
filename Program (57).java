import java.util.*;

class Count{
	public int CountDigit(int iNo){
		int iCnt=0;
		while(iNo!=0)
		{
			int iDigit=iNo%10;
			if(iDigit>3 && iDigit<7){
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
}
public class Assignment_333{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int iValue=sc.nextInt();
		
		Count obj=new Count();
		int iRet=obj.CountDigit(iValue);
		
		System.out.println("Digits present between 3 and 7 are:"+iRet);
	}
}