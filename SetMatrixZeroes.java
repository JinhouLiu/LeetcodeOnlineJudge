public class Solution {
//最优方案
public static  void setZeroes(int[][] matrix)
{
if(matrix==null)
{
return;	
}
int rownum=matrix.length;
if (rownum == 0) return;
int colnum=matrix[0].length;
if (colnum==0)  return;
boolean  firstRowHasZero=false,fistColumHasZero=false;
for(int j = 0; j<colnum;j++)
{
if(matrix[0][j]==0){
fistColumHasZero=true;	
break;	
}	
}
for(int i = 0;i<rownum;i++)
{
if(matrix[i][0]==0){
firstRowHasZero=true;	
break;	
}	
}
for(int i=1;i<rownum;i++)
{
   for(int j = 1;j<colnum;j++)
       {
	   if(matrix[i][j]==0)
	      {
	       matrix[i][0]=0;
	       matrix[0][j]=0;
	      }
      }   
}
for(int i=1;i<rownum;i++)
{
  for(int j = 1; j<colnum;j++)
    {	
      if(matrix[i][0]==0||matrix[0][j]==0)
	  
	   matrix[i][j]=0;
     }
 }
if(firstRowHasZero){
for(int i = 0;i<rownum;i++)
{
matrix[i][0]=0;
}	 	    

}
if(fistColumHasZero)
{
for(int j= 0; j <colnum;j++){    	
matrix[0][j]=0;
}
}
}
}
