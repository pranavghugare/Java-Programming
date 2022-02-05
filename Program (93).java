import java.util.*;

class Marvellous{
	public int Additon(int iValue,int iValue1){
		int iResult=iValue+iValue1;
		return iResult;
	}
}

class Program88{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int iNo=0,iNo1=0,iAns=0;
		
		System.out.println("Enter First Number");
		iNo=sc.nextInt();
		
		System.out.println("Enter First Number");
		iNo1=sc.nextInt();
		
		Marvellous obj=new Marvellous();
		iAns=obj.Additon(iNo,iNo1);

		System.out.println("Addition is:"+iAns);
	}
}