import java.util.*;

class Search{
		public boolean keySearch(int[] Arr,int key){
			boolean flag=false;
			for(int i=0;i<Arr.length;i++){
				if(Arr[i]==key)
					flag=true;
					break;
			}
			return flag;
		}
}

public class Assignment_341{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Element");
		int iValue=sc.nextInt();
		int[] Element=new int[iValue];
		for(int i=0;i<iValue;i++){
			Element[i]=sc.nextInt();
		}
		System.out.println("Enter Number for search");
		int iKey=sc.nextInt();
		
		Search obj=new Search();
		
		boolean iRet=obj.keySearch(Element,iKey);
		if(iRet=true){
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
}