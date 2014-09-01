public class Solution{

public  static  void  main(String[]  args)
{		
String s = "   a   b   "; 		
System.out.println(reverseWords(s));

}  	
public static  String  reverseWords(String s)
{	
String reverse=s.trim();
StringBuffer  buffer=new  StringBuffer(""); 
String[] words=reverse.split("\\s+"); 
for(int i =words.length-1; i>=0;i--){	
buffer.append(words[i]+" ");	
}
return buffer.toString().trim(); 
}  	
}
