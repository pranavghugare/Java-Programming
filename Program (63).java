import java.util.*;

class Search{
		public void keySearch(int[] Arr,int iLow,int iHigh){
			int index=0;
			for(int i=0;i<Arr.length;i++){
				if((Arr[i]>=iLow) && (Arr[i]<=iHigh)){
					System.out.println(Arr[i]);
				}
			}
		}
}

public class Assignment_344{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Element");
		int iValue=sc.nextInt();
		int[] Element=new int[iValue];
		System.out.println("Enter Element");
		for(int i=0;i<iValue;i++){
			Element[i]=sc.nextInt();
		}
		System.out.println("Enter Lower Range");
		int iLower=sc.nextInt();
		
		System.out.println("Enter Higher Range");
		int iHigher=sc.nextInt();
		
		Search obj=new Search();
		
		obj.keySearch(Element,iLower,iHigher);
	}
}