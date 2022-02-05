import java.util.*;

class  Count{
	public int CountSmall(String s){
		int iCntSmall=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a') && (s.charAt(i)<='z')){
				iCntSmall++;
			}
		}
		return iCntSmall;
	}
	
	public int CountCapital(String s){
		int iCntCapital=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='A') && (s.charAt(i)<='Z')){
				iCntCapital++;
			}
		}
		return iCntCapital;
	}
}

public class Assignment_313{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		Count obj=new Count();
		
		int iCountSmall=obj.CountSmall(str);
		int iCountCapital=obj.CountCapital(str);
		
		System.out.println("Count Difference is:"+(iCountSmall-iCountCapital));
	}
}