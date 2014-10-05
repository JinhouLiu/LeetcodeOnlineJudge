public class Solution{
public  static void  main(String[]  args)
{
//没写测试用例,借鉴别人的代码，我是想从前往后，他后从后往前，本想用LinkedHashMap实现，但是自己不熟悉LinkedHashMap，思想也出错
}
public static int romanToInt(String s)
{
if(s==null||s.length()==0)
{
return 0;	
}
int  result=0; 
for(int i=s.length()-1; i>=0; i--)
{
char c=s.charAt(i);
switch(c){
case 'I':
	result+=(result>=5?-1:1);
	break;
case 'V':
	result+=5;
	break;
case 'X':
	result+=(result>=50?-10:10);
	break;
case 'L':
	result+=50;
	break;
case 'C':
	result+=(result>=500?-100:100);	
	break;
case 'D':
	result+=500;
	break;
case 'M':
	result+=1000;
	break;
default:
	break;
}
}
return result; 
}
}
