import java.util.*;

class Program86
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int iNO=0,iNO1=0,iAns=0;
		System.out.println("Enter First Number");
		iNO=sc.nextInt();
		
		System.out.println("Enter Second Number");
		iNO1=sc.nextInt();
		
		iAns=iNO+iNO1;
		
		System.out.println("Addition is: "+iAns);
	}
}