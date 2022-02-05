import java.util.*;

class Program87{
	
	public static int Addition(int iValue,int iValue1)
	{
		int iResult=iValue+iValue1;
		return iResult;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int iNo=0,iNo1=0,iAns=0;
		
		System.out.println("Enter First Number");
		iNo=sc.nextInt();
		
		System.out.println("Enter Second Number");
		iNo1=sc.nextInt();
		
		iAns=Addition(iNo,iNo1);
		
		System.out.println("Addition is:"+iAns);
	}
}