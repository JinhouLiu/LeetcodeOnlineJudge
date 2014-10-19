public class Solution{


//不是很懂
public static int jump(int[] A)
{
int ret=0;
int curr=0;
int last=0;
for(int i=0;i<A.length;i++)
{
if(i>last)
{
last=curr;
ret++;
}
curr=Math.max(curr,i+A[i]);   
}
return ret;
}
}
