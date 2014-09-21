public class Solution {


public  static  void  main(String[] args)
{
//数组一声明，长度就不可改变，这是我不理解题意的地方

}  
public  static  int removeDuplicates(int[] A)
{
if(A==null)
{
return 0;	
}	
if(A.length==1)
{
return A[0];  	
}
int  count=0;
for(int i = 0; i < A.length;i++)
{
if(count==0||A[count-1]!=A[i])
{	
A[count++]=A[i];
}
}
return count; 
}	
}
