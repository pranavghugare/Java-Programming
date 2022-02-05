import java.util.*;

class CompareN{
	public boolean strNComapre(String str1,String str2,int iNo){
		boolean flag=false;
		if(str2.length()<iNo){
			str1+=" ";
			str1+=str2;
			System.out.println(str1);
		}
		else{
			for(int i=0;i<iNo;i++){
				if(str1.charAt(i)==str2.charAt(i)){
					flag=true;
					break;
				}
			}
		}
		return flag;
	}
}
public class Assignment_353{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		String firstString=sc.nextLine();
		String secondString=sc.nextLine();
		int iValue=sc.nextInt();
		
		CompareN obj=new CompareN();
		boolean iRet=obj.strNComapre(firstString,secondString,iValue);
		if(iRet==true){
			System.out.println("TRUE");
		}
		else{
			System.out.println("FALSE");
		}
	}
}		