public class Solution {
public static int search(int[] A, int target)
{
if(A==null||A.length==0)
{	
return 0;	
}	
return searchBinary(A,target,0,A.length-1);
}
public static int searchBinary(int[] A,int target,int low,int high)
{		
int mid=low+(high-low)/2;
if(A[mid]==target)
{	
return mid;
}
if(low>=high)//不能忘记等号
{
return -1;	
}
if(A[low]<=A[mid])
{	
if(A[low]<=target&&target<A[mid])
return searchBinary(A,target,low,mid-1);	
else
return searchBinary(A,target,mid+1,high);		
}
if(A[mid]<=A[high])
{	
if(A[mid]<target&&target<=A[high])
return searchBinary(A, target,mid+1,high);		
else
return searchBinary(A, target,low,mid-1);	
}
return  -1;
}
}
