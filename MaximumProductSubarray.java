public class Solution {
publis  static  void  main(String[] args)
{
//没想测试用例
}
public static int maxProduct(int[] A)
{	
int result=0;  	
if(A.length==1)
{
return A[0];
}
int max=0;
int min=0; 
for(int i=0;i<A.length;i++)
{
if(A[i]>0)
{
max=Math.max(max*A[i], A[i]);
min*=A[i];
}
else if(A[i]==0)
{
min=0;
max=0;
}
else{
int  temp=max;
max=min*A[i];
min=Math.min(temp*A[i], A[i]);
}
result=Math.max(max, result);
}
return  result;
}
}
