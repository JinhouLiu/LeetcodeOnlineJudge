public class Solution{

public static int lengthOfLastWord(String s)
{	
String word=s.trim();
if (word.length()==0){	
return  0;
} 
String[] words=word.split("\\s+");
return words[words.length-1].length();		
}	
public static void  main(String[] args)
{
   //省略了一些测试情况 		
} 	
}
