import java.util.*;

class CheckCapital{
	public int count(String s){
		int iCnt=0;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>='A') && (s.charAt(i)<='Z')){
				iCnt++;
			}
		}
		return iCnt;
	}
}
public class Assignment_311{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			String str=sc.nextLine();
			CheckCapital obj=new CheckCapital();
			int iAns=obj.count(str);
			System.out.println(iAns);		
		}
}