import java.util.*;

class ArrayX{
	
	public int Arr[];	//behaviour
	
	public ArrayX(int iSize){   //characterstic
		Arr=new int[iSize];
	}
	
	public void Accept(){		//characterstic
		Scanner sc=new Scanner(System.in);
		int iCnt=0;
		System.out.println("Enter Elemets");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sc.nextInt();
		}
	}
	public void Display(){		//characterstic
		int iCnt=0;
		System.out.println("Entered Elemets are: ");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}

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

public class Program93{
		
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