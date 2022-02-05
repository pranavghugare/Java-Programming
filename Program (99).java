import java.util.*;
import MarvellousNumber.ArrayX;
class Marvellous extends ArrayX{
	
	public Marvellous(int iLength){
		super(iLength);
	}
	public int Add(){
		int iSum=0,iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++){
			iSum+=Arr[iCnt];
		}
		return iSum;
	}
}

public class Program94{
		
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int iValue=0;
			System.out.println("Enter Number of Elements");
			iValue=sc.nextInt();
			
			Marvellous obj=new Marvellous(iValue);
			obj.Accept();
			obj.Display();
			int iRet=obj.Add();
			System.out.println("Addition : "+iRet);
		}
}