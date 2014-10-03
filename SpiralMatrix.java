public class Solution
{
//剑指offer原题　参照他的思路写的
／／有两点我是想不出来 start*2<rows&&start*2<columns
//最后三步可能也想不出来
public static  List<Integer>  spiralOrder(int[][] matrix)
{	
List<Integer> result=new ArrayList<Integer>();
if(matrix==null||matrix.length<=0||matrix[0].length<=0)
{
return result; 	
}
int start=0;
int rows=matrix.length;//行
int columns=matrix[0].length;//列
while(start*2<columns&&start*2<rows)
{
result.addAll(all(matrix, start,columns,rows));
start++;
}
return result; 
}
public static List<Integer>  all(int[][] matrix,int  start,int  columns,int rows)
{
List<Integer> list=new ArrayList<>(); 	  
int endx=columns-1-start;
int endy=rows-1-start;
for(int i=start;i<=endx;i++)
{
list.add(matrix[start][i]);		
}
if(start<endy)
{
for(int i = start+1;i<=endy;i++)
{
list.add(matrix[i][endx]);	
}
}
if(start<endx&&start<endy)
{
for(int i = endx-1;i >=start;i--)
{
list.add(matrix[endy][i]);	
}	
}
if(start<endx&&start<endy-1){
for(int i = endy-1;i>=start+1;i--)
{
list.add(matrix[i][start]);	
}		
}
return list;
}
}
