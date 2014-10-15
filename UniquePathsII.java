public class Solution
{
//没学会思维方式
public static int uniquePathsWithObstacles(int[][] obstacleGrid)
{
if(obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0)
{
return 0;		
}
int height=obstacleGrid.length,width=obstacleGrid[0].length;
int[][] answer=new int[height][width];
answer[0][0]=1;
for(int i = 0;i<height;i++)
{
if(obstacleGrid[i][0]==1)
{
if(width==1) return 0;	
break;
}	
else
answer[i][0]=1;	
}
for(int i = 0;i<width;i++)
{
if(obstacleGrid[0][i]==1)
{
if(height==1)return 0;	
break;
}else
answer[0][i]=1;	
}
for(int i = 1;i<height;i++)	
{ for(int j=1;j<width;j++)
      if(obstacleGrid[i][j]!=1)
	     answer[i][j]=answer[i-1][j]+answer[i][j-1]; 	 
}		
return  answer[height-1][width-1];
}
}
