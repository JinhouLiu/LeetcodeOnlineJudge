public class Solution
{
public static int  numDecodings(String s)
{
if(s==null||s.length()==0){
return  0;	
}	
int[] memo=new int[s.length()+1];
memo[s.length()]=1;
memo[s.length()-1]=s.charAt(s.length()-1)=='0'?0:1;
for(int i = s.length()-2;i>=0;i--)
{
if(s.charAt(i)=='0')
{
continue;	
}
memo[i]=(Integer.parseInt(s.substring(i, i+2))<=26)?memo[i+1]+memo[i+2]:memo[i+1];
}
return memo[0];
}
public static void main(String[]  args)
{	
//没有想测试用例
//这题＂０１＂或者＂１２３０００００００４＂这类输入都被看做是不合格的输入　　　　
}
}
