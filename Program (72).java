import java.util.*;

class PatternX{
	public void Display(int iRow,int iCol){
		int i=0,j=0;
		char ch='\0';
		for(i=1,ch='A';i<=iRow;i++){
			for(j=1;j<=iCol;j++){
				System.out.print(ch+"\t");
			}
			ch++;
			System.out.println();
		}	
		
	}
}
public class Assignment_363{
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int iR=0,iC=0;
		System.out.println("Enter Number of Rows");
		iR=sc.nextInt();
		System.out.println("Enter Number of Columns");
		iC=sc.nextInt();
		
		PatternX obj=new PatternX();
		obj.Display(iR,iC);
	}
}
		