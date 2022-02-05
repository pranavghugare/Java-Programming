import java.util.*;

class Patternx{
	public void Display(String st){
		int i=0,j=0;
		int length=st.length();
		for(i=0;i<=length-1;i++){
			for(j=0;j<=i;j++){
				System.out.print(st.charAt(j)+"\t");
			}
			System.out.println();
		}
		for(i=length-2;i>=0;i--){
			for(j=0;j<=i;j++){
				System.out.print(st.charAt(j)+"\t");
			}
			System.out.println();
		}
	}
}				
		
public class Assignment_385{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter Stirng");
		str=sc.nextLine();
		
		Patternx obj=new Patternx();
		obj.Display(str);
	}
}