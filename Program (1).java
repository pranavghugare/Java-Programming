import java.util.*;

class Count{
	
	public int CountSmall(String s){
		int iCnt=0;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>='a') && (s.charAt(i)<='z')){
				iCnt++;
			}
		}
		return iCnt;
	}
}
public class Assignment_312{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		Count obj=new Count();
		
		int iReslut=obj.CountSmall(str);
		System.out.println("Small Letters are:"+iReslut);
	}
}
		