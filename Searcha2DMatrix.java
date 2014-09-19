public class Solution {

public  static  void  main(String[] args)
{
//没有写一些测试用例
}
public  static  boolean searchMatrix(int[][] matrix, int target)
{
if(matrix==null)
{	
return false;
}
int row=0,column=matrix[0].length-1;
while(row<matrix.length&&column>=0){	
if(matrix[row][column]==target){	
return  true;
}else if(matrix[row][column]<target)
{
row++;		
}else
{	
column--;	
} 
}
return false; 
}
}
