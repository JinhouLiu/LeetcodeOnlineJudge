public class Solution
{

//动态规划问题，自底向上规划
public static int minDistance(String word1, String word2)
{
if(word1==null||word2==null)
{
return 0;	 
}
int rows=word1.length();
int columns=word2.length();
int[][]  matrix=new  int[rows+1][columns+1];
for(int i = 0; i <=rows; i++)
{
matrix[i][0]=i;		
}
for(int i=0;i<=columns;i++)
{
matrix[0][i]=i;	
}
for(int i = 1; i <=rows;i++){
	for(int j=1;j<=columns;j++){
		if(word1.charAt(i-1)==word2.charAt(j-1))
		{
		 matrix[i][j]=matrix[i-1][j-1]; 	
		}else{
		matrix[i][j]=Math.min(Math.min(matrix[i][j-1], matrix[i-1][j]),matrix[i-1][j-1])+1;	
		}
	}	
}
return matrix[rows][columns]; 
}	
public static void main(String[] args)
{
String  word1="";
String  word2="a";
System.out.print(minDistance(word1, word2));
}  	
}
