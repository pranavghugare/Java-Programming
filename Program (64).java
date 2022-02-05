import java.util.*;

class Search{
		public int keySearch(int[] Arr){
			int iMul=1;
			for(int i=0;i<Arr.length;i++){
				if(Arr[i]%2!=0){
					iMul*=Arr[i];
				}
				else{
					iMul=0;
				}	
			}
			return iMul;
		}
}

public class Assignment_345{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Element");
		int iValue=sc.nextInt();
		int[] Element=new int[iValue];
		System.out.println("Enter Element");
		for(int i=0;i<iValue;i++){
			Element[i]=sc.nextInt();
		}
		
		Search obj=new Search();
		
		int iRet=obj.keySearch(Element);
		System.out.println(iRet);
	}
}