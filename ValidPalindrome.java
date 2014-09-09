import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Solution{


public  static void  main(String[] args)
{
//省略一些测试用例代码

}

public static  boolean isPalindrome(String s)
{
if(s==null||s.length()==0){	
return  true;	
}
Pattern pattern=Pattern.compile("\\w");
StringBuffer sb=new StringBuffer();
Matcher matcher=pattern.matcher(s);
while(matcher.find()){	
sb.append(matcher.group());		
}
String s2=sb.toString().toLowerCase();
for(int i = 0,j=s2.length()-1 ; i <s2.length()/2;i++,j--){
if((s2.charAt(i)==s2.charAt(j))){	
continue;	
}else
{
return false; 
}
}
return  true;
}

}
