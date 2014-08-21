
//以通过测试
public class Solution
{	
public  static int  reverse(int x)
{
int ABS=Math.abs(x);  	
String  sourceString=String.valueOf(ABS);
StringBuffer desitionString=new  StringBuffer("");
for(int i=sourceString.length()-1;i>=0;i--){	
if(desitionString.length()==0&&sourceString.charAt(i)==0)
{	
continue;
}else
{	
desitionString.append(sourceString.charAt(i));
}
}
long desition=Long.parseLong(desitionString.toString());
if (desition>Integer.MAX_VALUE){
return 0;   	
}
else
{	
if(x>0){	
return  (int ) desition ; 		
}
else
{	
return  -(int)desition;   	
}
}
}
}
