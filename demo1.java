public class Solution12
{	
int[] unionSet;//union to find 
boolean[] hasEdgeO;
public void solve(char[][] board)
{
if(board.length==0||board[0].length==0)
return;
int height=board.length,width=board[0].length;
unionSet=new int[height*width];
hasEdgeO=new boolean[unionSet.length];
for(int i = 0;i<unionSet.length;i++) unionSet[i]=i;
for(int i = 0;i<hasEdgeO.length; i++){
    int x = i / width, y = i % width;
    hasEdgeO[i] = (board[x][y] == 'O' && (x==0 || x==height-1 || y==0 || y==width-1));
}
/*
for(int i = 0;i<hasEdgeO.length;i++) 
{
int x=i/width,y=i%width; 
hasEdgeO[i]=(board[x][y]=='O'&&(x==0||x==height-1||y==0||y==width-1));
}
*/
for(int i = 0;i<unionSet.length; i++){
    int x = i / width, y = i % width, up = x - 1, right = y + 1;
    if(up >= 0 && board[x][y] == board[up][y]) union(i,i-width);
    if(right < width && board[x][y] == board[x][right]) union(i,i+1);
}
/*
for(int i=0;i<unionSet.length;i++)
{	
int x=i/width,y=i%width,up=x-1,right=y+1;
if(up>=0&&board[x][y]==board[up][y]) union(i,i-width);
if(right<width&&board[x][y]==board[x][right]) union(i,i+1); 
}
*/
for(int i=0;i<unionSet.length;i++)
{
int x=i/width,y=i%width;
if(board[x][y]=='O'&&!hasEdgeO[findSet(i)])
board[x][y]='X';	
}
}
private void union(int x,int y)
{
int rootX=findSet(x);  
int rootY=findSet(y);
boolean hasEdgeO=this.hasEdgeO[rootX]||this.hasEdgeO[rootY];
unionSet[rootX]=rootY;
this.hasEdgeO[rootY]=hasEdgeO;
}
private int findSet(int x)
{
if(unionSet[x]==x) return x;
unionSet[x]=findSet(unionSet[x]);
return unionSet[x];
}      
public static   void   main(String[]  args)
{
Solution12 solution12=new  Solution12(); 	
char[][] board={
		{'X','X','X','X'},
		{'X','O','O','X'},
		{'X','X','O','X'},
		{'X','O','X','X'},		
}; 
solution12.solve(board);
for (int i = 0; i < board.length; i++) {
	for (int j = 0; j < board[0].length; j++) {
		System.out.print(board[i][j]+"\t");		
	}
	System.out.println();
}
}   	
}
