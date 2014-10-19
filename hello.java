通过键盘输入一串小写字母(a~z)组成的字符串。请编写一个字符串压缩程序，将字符串中连续出席的重复字母进行压缩，并输出压缩后的字符串
public class Solution
{	
public static void  main(String[]  args)
{	
System.out.println(StringZip(""));
}  
//当输入全为空格时没有做处理
public static String StringZip(String inputString)
{
if(inputString==null||inputString.length()==0||inputString.matches("\\s"))
{
return null;		
}
int count=1;
char c=inputString.charAt(0);
StringBuffer sb=new  StringBuffer(); 
for(int i=1;i<inputString.length();i++){
	
	if(inputString.charAt(i)==c){//当与前一个字符相等时
	count++;
	continue;
	}else{		
    if(count==1){
    sb.append(c);	
    c=inputString.charAt(i); 	
	}else
	{
    sb.append(count);
    sb.append(c);
    c=inputString.charAt(i);
    count=1; 
	}    	  		
	}	
}
if(count==1){
sb.append(c);		
}else {
sb.append(count).append(c);	
}

return  sb.toString(); 
}    	
}

