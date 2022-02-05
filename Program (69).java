import java.util.*;

class Pallindrom{
	
	public boolean checkPallindrom(String s){
		int i=0;
		boolean flag=false;
		for(i=0;i<s.length();i++){
			if((s.charAt(i)==s.charAt(s.length()-1-i))){
				flag=true;
			}
		}
		return flag;
	}
}

public class Assignment_355{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str="";
		boolean bRet=false;
		System.out.println("Eneter String");0.
		
		str=sc.nextLine();
		
		Pallindrom obj=new Pallindrom();
		bRet=obj.checkPallindrom(str);
		if(bRet==true){
			System.out.println("TRUE");
		}
		else
			System.out.println("FALSE");
	}
}
				
		
		