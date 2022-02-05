import java.util.*;

class PatternX{
	public void Display(String st){
		int length=st.length();
		for(int i=0;i<length-1;i++)
		{
			for(int j=0;j<length;j++){
				if(i>=j){
					System.out.print(st.charAt(j)+"\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
	}
}

public class Assignment_391{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter String");
		str=sc.nextLine();

		PatternX obj=new PatternX();
		obj.Display(str);
	}
}