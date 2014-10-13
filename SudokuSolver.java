public class Solution
{	
public static void solveSudoku(char[][] board)
{
dfs(board,0);	
}
public static boolean dfs(char[][] board,int  pos)
{	
int n=board.length;
if(pos==n*n)
{	
return true;	
}
int x=pos/n;
int y=pos%n;
if(board[x][y]=='.')
{
    for(char c='1';c<='9';c++) 
   {	
    board[x][y]=c;	
     if(isValidate(board, x, y)&&dfs(board, pos+1)) 
       {
        return true;
       }  		
        board[x][y]='.';
   }
}
else
{//boord[c][y]!='.' 
if(dfs(board, pos+1)==true) return true; 
}
return false;
}      
private static boolean isValidate(char[][] board,int  x,int y)
{
char c=board[x][y];
for(int i=0;i<9;i++)
{
if(y!=i&&board[x][i]==c)
{
return false;	
}
if(x!=i&&board[i][y]==c)
{
return false;		
}
}
int xx=x/3*3;
int yy=y/3*3;
for(int i = xx; i <xx+3;i++){
	for(int j =yy;j<yy+3;j++){		
             if(x!=i&&j!=y&&board[i][j]==c)
             {
		     return   false;
	         }		
	}	
}
return true;
}      	
public static void  main(String[]   args)
{
char[][] board={
		        {'5','3','.','.','7','.','.','.','.'},
		        {'6','.','.','1','9','5','.','.','.'},
		        {'.','9','8','.','.','.','.','6','.'}, 
		        {'8','.','.','.','6','.','.','.','3'},
		        {'4','.','.','8','.','3','.','.','1'},
		        {'7','.','.','.','2','.','.','.','6'},
		        {'.','6','.','.','.','.','2','8','.'},
		        {'.','.','.','4','1','9','.','.','5'},
		        {'.','.','.','.','8','.','.','7','9'},		       
};
solveSudoku(board);
for(int i = 0; i < board.length; i++)
{
	   for(int j = 0; j < board.length; j++)
	   {
	   System.out.print(board[i][j]+"\t");
	    }
       System.out.println();  
}
}   	
}
