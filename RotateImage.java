public class Solution2
{
public static void rotate(int[][] matrix)
{
for(int i = 0; i < matrix.length/2;i++){
     for(int j=i;j<matrix.length-i-1;j++){
	    int temp=matrix[i][j];	 
	    temp=move(matrix,temp,matrix.length-1-i,j);
	    temp=move(matrix, temp, (matrix.length-1)-j,(matrix.length-1)-i);
	    temp=move(matrix, temp, i,matrix.length-1-j);
	    temp=move(matrix, temp, j, i);
 }	
}	
}
public  static   int    move(int[][] matrix,int  val,int  x,int y)
{	
int temp=matrix[y][x];
matrix[y][x]=val;
return temp;
}  
public static void main(String[]  args)
{	
int[][] A={
		  {1,2,3},
		  {4,5,6},
		  {7,8,9}
		  };
rotate(A);
for (int i = 0; i < A.length; i++) {
	for (int j = 0; j < A.length; j++) {
		System.out.print(A[i][j]+"\t");
		
	}
	System.out.println();
}
}
}  
