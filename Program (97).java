import java.util.*;

class MyClass{
	
	public int Addition(int[] Brr){
		int iSum=0,iCnt=0;
		for(iCnt=0;iCnt<Brr.length;iCnt++){
			iSum+=Brr[iCnt];
		}
		return iSum;
	}
}
class Program92{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int iSize=0,iCnt=0;
		
		System.out.println("Enter Number of Element");
		iSize=sc.nextInt();
		int Arr[]=new int[iSize];
		System.out.println("Enter Numbers");
		for(iCnt=0;iCnt<Arr.length;iCnt++){
			Arr[iCnt]=sc.nextInt();
		}
		MyClass obj=new MyClass();
		System.out.println("Addition is:"+obj.Addition(Arr));
	}
}