import java.util.ArrayList;
import java.util.List;
//通不过在线测试，不知道原因是什么,对n=1,2,3,4，没有错误，没有做更好的测试
public class Solution
{
private  static  char[]  strs; 	
public  static  List<String> generateParenthesis(int n)
{	
strs=new char[2*n+1];	
List<String> result=new ArrayList<String>();
result.addAll(generateParenthesis(n, 0, 0));
return result;
}
public static List<String> generateParenthesis(int n,int left,int  right)
{
List<String> result=new  ArrayList<String>();  	
if(left==right&&left+right==2*n)
{
result.add(new String(strs));	
return  result ;	
}
if(left<right||left+right>=2*n)
{	
return new  ArrayList<>(); 
}
int index=left+right;
strs[index]='(';
result.addAll(generateParenthesis(n, left+1, right));
strs[index]=')';
result.addAll(generateParenthesis(n, left, right+1));
return  result;   
}             
}
