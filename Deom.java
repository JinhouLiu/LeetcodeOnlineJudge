import java.util.LinkedList;

public class Solution{	
static LinkedList<LinkedList<Integer>> result=new LinkedList<LinkedList<Integer>>();
public static LinkedList<LinkedList<Integer>>   pathSum(TreeNode root,int sum)
{
	
if(root==null){
	
return result;
}
LinkedList<Integer>  list=new  LinkedList<>();
bfs(root, sum, list, 0);
return  result;
}
public static void bfs(TreeNode  root,int  sum,LinkedList<Integer>  list, int  count)
{	
list.addLast(root.val);
if(root.left==null&&root.right==null&&(root.val+count)==sum){	
result.addLast(list);
}
if(root.left!=null){	
bfs(root.left,sum,list,count+root.val);
}
if(root.right!=null){			
bfs(root.right, sum, list, count+root.val);
}
list.pollLast();
}
  
}
class TreeNode
{	
int val;
TreeNode left,right;
public TreeNode(int  val)
{
this.val=val;	
}
}
