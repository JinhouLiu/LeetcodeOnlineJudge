public class Solution{
 public static boolean search(int[] A, int target)
{
if(A==null||A.length==0)
{
return false;	
}	
int l=0,r=A.length-1;
while(l<=r)
{
int mid=l+(r-l)/2;
if(A[mid]==target) return true; 	
if(A[l]<A[mid])
{
if(A[l]<=target&&target<A[mid])
r=mid-1;
else
l=mid+1;	
}
else if(A[mid]<A[l])//这里不能少了else,我的失误之一
{	
if(A[mid]<target&&target<=A[r])
l=mid+1;     	
else
r=mid-1;	
}else l++;	
}
return false;
} 
}
