import java.util.*;

class Marvellous{
	public boolean CheckPrime(int iValue){
		boolean bflag=true;
		int iCnt=0;
		if(iValue==1 || iValue==2)
		{
			return bflag;
		}
		for(iCnt=2;iCnt<=iValue/2;iCnt++)
		{
			if(iValue==1 || iValue==2){
				break;
			}
			if(iValue%iCnt==0)
			{
				bflag=false;
				break;
			}	
		}		
		return bflag;
	}
}
class Program89{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		boolean bRet=false;
		System.out.println("Enter Number");
		int iNo=sc.nextInt();
		
		Marvellous obj=new Marvellous();
		bRet=obj.CheckPrime(iNo);
		if(bRet==true)
		{
			System.out.println(iNo+" is a prime");
		}
		else{
			System.out.println(iNo+" is not a prime");
		}
	}
}
		