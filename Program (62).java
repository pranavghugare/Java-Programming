import java.util.*;

class Search{
		public int keySearch(int[] Arr,int key){	//last occurence
			int index=0;
			for(int i=Arr.length-1;i>=0;i--){
				if(Arr[i]==key){
					index=i;
					break;
				}
			}
			return index;
		}
}

public class Assignment_343{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Element");
		int iValue=sc.nextInt();
		int[] Element=new int[iValue];
		System.out.println("Enter Element");
		for(int i=0;i<iValue;i++){
			Element[i]=sc.nextInt();
		}
		System.out.println("Enter Number for search");
		int iKey=sc.nextInt();
		
		Search obj=new Search();
		
		int iRet=obj.keySearch(Element,iKey);
		System.out.println("Number Present at index:"+iRet);
	}
}