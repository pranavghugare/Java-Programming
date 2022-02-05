import java.util.*;

class Marvellous{
	public boolean CheckPrime(int iValue){
		int iTemp=0;iDigCnt=0,iDigit=0,iPower=1;
		if(iNo<0)
		{
			iNo=-iNo;
		}
		iTemp=iNo;
		while(iTemp!=0)
		{
			iDigCnt++;
			iTemp=iTemp/10;
		}
		iTemp=iNo;
		
		while(iTemp!=0)
		{
			iDigit=iTemp%10;
			for(iCnt=2;iCnt<=iDigit;iCnt++)
			{
				iPower=iPower*iDigit;
			}
			iSum=iSum+iPower;
			iPower=1;
			iTemp=iTemp/10;
		}
		if(iSum==iNo){
			return true;
		}
		else{
			return false;
		}
	}
}
class Program89{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		boolean bRet=false;
		System.out.println("Enter Number");
		int iNo=sc.nextInt();
		
		Marvellous obj=new Marvellous();
		bRet=obj.CheckArmstring(iNo);
		if(bRet==true)
		{
			System.out.println(iNo+" is a prime");
		}
		else{
			System.out.println(iNo+" is not a prime");
		}
	}
}
		