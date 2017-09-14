package hackerearth.strings;

import java.util.*;
public class SortTheSubstring {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner k=new Scanner(System.in);
	        int n=k.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            String s=k.next();
	            int si=k.nextInt();
	            int ei=k.nextInt();
	            int l=s.length();
	            String str1 = s.substring(0,si);
	            String str2 = s.substring(si+ei,l);
	            String str3 = s.substring(si,ei);
	            //int l3=str3.length();
	            char  ch[]=new char[ei-si];
	            ch=str3.toCharArray();
	            
	            Arrays.sort(ch);
	            String sstr = String.valueOf(ch);
	            String finals = str1 + sstr + str2;
	            System.out.println(finals);
	        }
	        
	        
	        
	        
	        

	}

}
