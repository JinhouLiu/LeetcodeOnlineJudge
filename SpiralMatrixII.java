public class Solution {
  public static int[][] generateMatrix(int n)
{
//不考虑n很大时造成n^2溢出int范围的情况	
int start=0;
if(n<0) //本来该抛出异常　在对异常进行处理
{	
return new int[][]{{}}; 	
}
int[][] matrix=new int[n][n];
int count=1; 
while(start*2<n)
{
count+=fillWithCircle(matrix,start,n,count);
start++;	
}
return matrix;
}
public static int  fillWithCircle(int[][] matrix,int start,int n,int count)
{
int  stepCount=0; 	
int endX=n-start-1;
int endy=n-start-1;
for(int i=start;i<=endX;i++)
{
matrix[start][i]=count++;
stepCount++;
}
if(start<endy)
{
for(int i=start+1;i<=endy;i++)
{
matrix[i][endX]=count++;
stepCount++;
}
}
if(start<endy&&start<endy)
{
for(int i=endX -1;i>=start;i--)
{
matrix[endy][i]=count++;
stepCount++;
}
}
if(start<endX&&start<endy-1)
{	
for(int i = endy-1; i >=start+1;i--)
{
matrix[i][start]=count++;
stepCount++;
}	
}
return stepCount; 
}
}
