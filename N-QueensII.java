public class Solution
{
//最高效通过位运算来求解
private static int limit;
private static  int result; 
public static int totalNQueens(int n)
{
result=0;
limit=(1<<n)-1; 
dfs(0, 0, 0);
return result; 
}
public static void dfs(int  h,int  l,int   r)
{
if(h==limit)
{
result++;
return;
}
int pos=limit&(~(h|l|r));
while(pos!=0)
{
int  p=pos&(-pos);
pos-=p;
dfs(h+p,(l+p)<<1,(r+p)>>1);
}
}   
}
