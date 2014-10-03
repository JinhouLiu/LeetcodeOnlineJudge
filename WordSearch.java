public class Solution
{
//深度优先算法，通过在线测试
public static boolean exist(char[][] board, String word)
{
int lenx=board.length;
int leny=board[0].length;
boolean result=false;  
int[][] location=new int[lenx][leny];
for(int i = 0;i<lenx; i++){
  for(int j = 0;j<leny;j++){
	location[i][j]=0;
}		
}
    for(int i = 0; i < lenx;i++){
	   for(int j = 0; j < leny;j++){
	     if (board[i][j]==word.charAt(0)){
		  location[i][j]=1;
		  result=searchNext(board, location, word, 1, i, j);
		  if (result==true){
			 return true;  			
		   }
       }	 
   }
}
return false;
}
public static boolean searchNext(char[][]  board,int[][] location, String word,int  chAt,int  x,int y)
{	
boolean isFind=false; 	
if(chAt==word.length())
{	
return true;	
}
int nextchAt=chAt+1;
if(y>0&&location[x][y-1]!=1&&board[x][y-1]==word.charAt(chAt))
{
location[x][y-1]=1;
isFind=searchNext(board, location, word, nextchAt, x, y-1);
if(isFind==true)
{
return  true;  	
}
}
if(y<board[0].length-1&&location[x][y+1]!=1&&board[x][y+1]==word.charAt(chAt))
{
location[x][y+1]=1;
isFind=searchNext(board, location, word, nextchAt, x, y+1);
if(isFind==true)
{
return true;	
}
}
if(x>0&&location[x-1][y]!=1&&board[x-1][y]==word.charAt(chAt))
{
location[x-1][y]=1;	
isFind=searchNext(board, location, word, nextchAt, x-1, y);
if(isFind==true)
{
return true;		
}
}
if(x<board.length-1&&location[x+1][y]!=1&&board[x+1][y]==word.charAt(chAt))
{
location[x+1][y]=1;
isFind=searchNext(board,location,word,nextchAt,x+1,y);
if(isFind==true)
{
return true;	
}
}

location[x][y]=0;
return false;
}
}
