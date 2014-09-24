public class Solution{
//没有想测试用例
public static void  main(String[]  args)
{



}
//通过在线测试
public static String simplifyPath(String path)
{	
if(path==null||path.length()==0){
return path;	
}
String[] strings=path.split("/+");
ArrayDeque<String>  stack=new  ArrayDeque<>();
for(String  s:strings)
{
if(s.length()>0){
  if(s.equals("..")){
       if(stack.isEmpty())
       {
	   continue;
       }
       stack.pop();  
}else if(s.equals(".")){
   	continue;	
}else{
stack.push(s);	
}	
}
}
String result="";
while(!stack.isEmpty())
{	
result="/"+stack.pop()+result;
}
if(result.length()==0)
result+="/";	
return  result;
}
}
