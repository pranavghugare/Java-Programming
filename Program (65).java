import java.util.*;

class Concatination{
	public String concatString(String str1,String str2,int iNo){
		
		str1+=" ";
		for(int i=0;i<iNo;i++)
		{
			str1+=str2.charAt(i);
		}
		return str1;
	}
}
	
public class Assignment_351{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		String firstString=sc.nextLine();
		String secondString=sc.nextLine();
		int iValue=sc.nextInt();
		
		Concatination obj=new Concatination();
		
		System.out.println(obj.concatString(firstString,secondString,iValue));
	}
}