import java.util.*;

class Compare{
	public boolean strCompare(String str1,String str2){
		boolean flag=true;
		if(str1.length()!=str2.length()){
			return false;
		}
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				flag=false;
				break;
			}
		}
		return flag;
	}
}
	
public class Assignment_352{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		String firstString=sc.nextLine();
		String secondString=sc.nextLine();
		
		Compare obj=new Compare();
		
		boolean iRet=obj.strCompare(firstString,secondString);
		if(iRet==true){
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
}