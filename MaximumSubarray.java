public class Solution{
public static  int maxSubArray(int[] A)
{
if(A==null||A.length==0)
{
return 0;	
}	
int sum=0; 	
int maximumSubArray=Integer.MIN_VALUE;
for(int i=0;i<A.length;i++)
{
if(sum<=0)	
sum=A[i];	
else
sum+=A[i];	
if(sum>maximumSubArray)
{
maximumSubArray=sum;	
}
}
return maximumSubArray; 
}
public static void main(String[] args)
{
//没有想测试用例
}  
}
