import java.util.*;

class Reversex{
	public String strReverse(String s){
		char temp=' ';
		for(int i=0;i<s.length();i++){
			temp=s.charAt(i);
			s.charAt(i)=s.charAt(s.length()-1);
	}
}
public class Assignment_354{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
		String str=sc.nextLine();
		
		Reversex r=new Reversex();
		System.out.println(r.strReverse(str));
	}	
}