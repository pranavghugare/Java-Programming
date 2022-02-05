import java.util.*;

class Reverse{
	public String stirngReverse(String s){
		char temp;
		for(int i=0;i<s.length();i++){
			for(int j=s.length();j>i;j--)
			{
				temp=s.charAt(i);
				s.charAt(i)=s.charAt(j);
				s.charAt(j)=temp;
			}
		}
		return s;
	}
}
public class Assignment_315{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		
		Reverse obj=new Reverse();
		System.out.println("Reverse String is"+obj.stirngReverse(str));
	}
}