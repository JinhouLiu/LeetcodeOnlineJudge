public class Solution
{
//成功通过测试
public static String longestPalindrome(String s)
{
if(s==null||s.length()==0)
{
return "";	
}
if(s.length()==1||s.length()==2)
{
return s;  	
}
int maxLen=1;
int longestBegin=0;  
boolean[][] table=new boolean[1000][1000];
for(int i=0;i<s.length();i++)
{
table[i][i]=true; 		
}
for(int i = 0;i<s.length()-1;i++)
{
if(s.charAt(i)==s.charAt(i+1))
{
table[i][i+1]=true;
longestBegin=i;
maxLen=2;
}
}
for(int len=3; len<=s.length();len++){
	     for(int i = 0; i <s.length()-len+1;i++)
	     {
		  int  j=len+i-1;
		  if(s.charAt(i)==s.charAt(j)&&table[i+1][j-1]==true){
			table[i][j]=true;
			longestBegin=i;
			maxLen=len;
       	}
	   } 
}
return s.substring(longestBegin,longestBegin+maxLen);  
}
}
