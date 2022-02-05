import java.util.*;

class PatternX{
	
	public void Display(String str){
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++){
				if(i>=j){
					System.out.print(str.charAt(j)+"\t");
				}
				else
					System.out.print("#\t");
			}
			System.out.println();
		}
	}
}
			
public class Assignment_393{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.nextLine();
		
		PatternX obj=new PatternX();
		obj.Display(st);
	}
}