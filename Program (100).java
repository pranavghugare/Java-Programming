import java.util.*;
import MarvellousNumber.ArrayX;
class Marvellous extends ArrayX{
	
	public Marvellous(int iLength){
		super(iLength);
	}
	public float Average(){
		int iSum=0,iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++){
			iSum+=Arr[iCnt];
		}
		return (iSum/Arr.length);
	}
}

public class Program95{
		
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int iValue=0;
			float fRet=0.0f;
			System.out.println("Enter Number of Elements");
			iValue=sc.nextInt();
			
			Marvellous obj=new Marvellous(iValue);
			obj.Accept();
			obj.Display();
			fRet=obj.Average();
			System.out.println("Average is : "+fRet);
		}
}