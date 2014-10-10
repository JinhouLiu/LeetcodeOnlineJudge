public class Solution{
//题目不难，但是leetcode给的题目信息不明确，不容易理解题目意思，google了一下，发现facebook Interview　　有一道一模一样的题目，并且题目信息明确
//本题的大致思路就是从前往后统计相同字符的长度将长度和这个字符作为下一个字符的元素
public static String countAndSay(int n)
{
if(n<=0)
{
return "";	
}
String now="1"; 
for (int i=1;i<n;i++)
{
now=Say(now);	
}
return now;
}
public static String Say(String pre)
{
int count=0;	
StringBuffer sb=new StringBuffer();
for(int i = 0;i<pre.length();i++)
{
count++;	
if(i+1!=pre.length()&&pre.charAt(i)!=pre.charAt(i+1))
{
sb.append(count).append(pre.charAt(i));
count=0;
}else if(i+1==pre.length())
{
sb.append(count).append(pre.charAt(i));	
}
}
return sb.toString(); 
}
}
