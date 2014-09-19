public class Solution{


public static void sortColors(int[] A)
{
if(A==null)
{
return;  		
}
int i=-1,j=-1;
for(int p= 0; p <A.length; p++)
{
int k=A[p];
A[p]=2;
if(k==0){
//j一定要放在i的前面
A[++j]=1;
A[++i]=0;
}else if (k==1) 
{
A[++j]=1;	
}
}
}
}
