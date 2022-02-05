import java.util.*;

class Patternx{
	public void Display(String str){
		int i=0,j=0;
		for(i=str.length();i>=0;i--){
			System.out.println();
			for(j=0;j<i;j++)
			{
				System.out.print(str.charAt(j)+"\t");
			}
			//System.out.println();
		}
		for(i=1;i<str.length();i++){
			for(j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j)+"\t");
			}
			System.out.println();
		}
	}
}

public class Assignment_384{
	public static void main(String[] main){
		Scanner sc=new Scanner(System.in);
		String st="";
		System.out.println("Enter String");
		st=sc.nextLine();
		
		Patternx obj=new Patternx();
		obj.Display(st);
	}
}		