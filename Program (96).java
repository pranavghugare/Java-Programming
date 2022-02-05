import java.util.*;

class Program91{
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
		
		System.out.println("Entered Numbers");
		for(iCnt=0;iCnt<Arr.length;iCnt++){
			System.out.println(Arr[iCnt]);
		}	
	}
}