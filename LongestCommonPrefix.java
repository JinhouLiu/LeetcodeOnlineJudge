import java.util.ArrayList;
import java.util.List;

public class Solution
{
//看别人的思想

public static String longestCommonPrefix(String[] strs)
{
if(strs==null||strs.length==0) return "";
int right=strs[0].length()-1;
if(strs[0].length()==0) return "";
       for(int i = 1;i< strs.length;i++){
      	   
	          for(int j=0;j<=right;j++)
	          {
		    
	          if((j>strs[i].length()-1)||!(strs[i].charAt(j)==strs[0].charAt(j))){
			  right=j-1;
			  }  	  	    	 
       }   	
}
return right>=0?(strs[0].substring(0,right+1)):""; 
}
}
