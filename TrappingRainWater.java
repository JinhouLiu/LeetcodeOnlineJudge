public class Solution{

//抄袭别人的
public static int trap(int[] A)
{
if(A==null||A.length==0)
{
return 0;	
}
int l=0,r=A.length-1;
int lv=A[l],rv=A[r];
int total=A[l]+A[r],rainTotal=total; 
while(l<r)
{
if(A[l]<A[r])
{	
l++;
total+=A[l];
lv=Math.max(lv, A[l]);
rainTotal+=lv;
}
else
{
r--;
total+=A[r];	
rv=Math.max(rv, A[r]);
rainTotal+=rv;
}
}
return  rainTotal-total;     
}
}
