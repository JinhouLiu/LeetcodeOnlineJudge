public class Solution{
 public static int[] searchRange(int[] A, int target)
{	
int[] result={-1,-1};
int  index=searchBinary(A, 0, A.length-1, target);
if(index!=-1){
int left=index;
int right=index;
result[0]=left;
result[1]=right;
while ((left=searchBinary(A, 0,left-1,target))!=-1) {
result[0]=left;		
}
while((right=searchBinary(A,right+1,A.length-1,target))!=-1)
{
result[1]=right;	
}
}
return result; 
}
private static int searchBinary(int[] A,int low,int high,int target)
{
while(low<=high)
{
int mid=low+(high-low)/2;

if(A[mid]<target){
low=mid+1;	
} else if(A[mid]>target){
high=mid-1;	
}else
{
return mid;
}
}
return -1;
} 
public  static  void  main(String[]  args)
{
//没想测试用例思路跟大致代码相同，就是写不出正确的代码，功力不够　
}
}
