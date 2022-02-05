import java.util.*;

class Vowel{
	public boolean checkVowel(String s){
		boolean flag=false;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)=='a') || (s.charAt(i)=='A') || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I'  || s.charAt(i)=='o' || s.charAt(i)=='O' ||  s.charAt(i)=='u' || s.charAt(i)=='U'){
					flag=true;
					break;
			}
		}
		if(flag==true)
		{
			return true;
		}
		return flag;
	}
}
public class Assignment_314{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		Vowel obj=new Vowel();
		boolean iRet=obj.checkVowel(str);
		
		if(iRet==true)
		{
			System.out.println("TRUE");
		}
		else
			System.out.println("FALSE");
	}
}
