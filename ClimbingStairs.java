public class Solution{
public  sttic void  main(String[]  args)
{
//省略了一些测试用例
}
public static int climbStairs(int n){
if(n<=0)
{
return  0;		
}	
int[] A=new int[n+1];
A[0]=1;
A[1]=1;
for (int i = 2; i < A.length;i++){
A[i]=A[i-1]+A[i-2];		
}
return A[A.length-1]; 
}
}
