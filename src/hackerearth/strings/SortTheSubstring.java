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
	            System.out.println("the first string is   "+str1);
	            String str2 = s.substring(ei+1,l);
	            System.out.println("the second string is   "+str2);
	            String str3 = s.substring(si,ei+1);
	            System.out.println("the third string is  "+str3);
	            //int l3=str3.length();
	            char  ch[]=new char[ei-si];
	            ch=str3.toCharArray();
	
	            Arrays.sort(ch);
	            
	            String sstr = String.valueOf(ch);
	            System.out.println("after sorting in ascending order "+sstr);
	            StringBuilder sb=new StringBuilder(sstr);
	            sb.reverse();
	            System.out.println("after sorting in *reversing order i.e in decending order* "+sb);
	            String finals = str1 + sb + str2;
	            System.out.println(finals);
	        }
	        
	        
	        
	        
	        

	}

}
