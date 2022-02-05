import java.util.*;

class PatternX{
	public void Display(int iRow,int iCol){
		int iR=0,iC=0;
		char Ch='\0';
		for(iR=1;iR<=iRow;iR++)
		{
			for(iC=1,Ch='A';iC<=iCol;iC++)
			{
				if(iR%2!=0)
				{	
					System.out.printf(Ch+"\t");
					Ch++;
				}
				else
				{
					System.out.printf(Ch+32+"\t");
					Ch++;
				}
			}
			System.out.println();
		}
	}
}

public class Assignment_362{
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