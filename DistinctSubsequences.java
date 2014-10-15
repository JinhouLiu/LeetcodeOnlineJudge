//最优方案
public class Solution
{
public static int numDistinct(String S, String T)
{
int m=T.length();   
int n=S.length();
if(m>n)return 0;  	
int[] path=new  int[m+1];
path[0]=1;
for (int i=1;i<=n; i++)
    for(int j=m;j>=1;j--)
	    path[j]= path[j]+(S.charAt(i-1)==T.charAt(j-1)?path[j-1]:0); 	 	
return path[m]; 
}
}
