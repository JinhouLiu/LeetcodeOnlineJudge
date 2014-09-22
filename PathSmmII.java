import java.util.LinkedList;
public class Solution
{	
public static void main(String[]  args)
{	
TreeNode  n1=new TreeNode(5);
TreeNode  n2=new TreeNode(4);
TreeNode  n3=new TreeNode(8);
TreeNode  n4=new TreeNode(11);
TreeNode  n5=new TreeNode(13);
TreeNode  n6=new TreeNode(4);
TreeNode  n7=new TreeNode(7);
TreeNode  n8=new TreeNode(2);
TreeNode  n9=new TreeNode(5);
TreeNode  n10=new TreeNode(1);
n1.left=n2;
n1.right=n3;
n2.left=n4;
n3.left=n5;
n3.right=n6;
n4.left=n7;
n4.right=n8;
n6.left=n9;
n6.right=n10;
LinkedList<LinkedList<Integer>>  lists=pathSum(n1, 22);
for(int i = 0; i < lists.size();i++)
{	
System.out.println(lists.get(i));
}
}
public static LinkedList<LinkedList<Integer>>  pathSum(TreeNode root,int sum)
{	
LinkedList<LinkedList<Integer>> result=new  LinkedList<>();
LinkedList<Integer>  temp=new  LinkedList<>(); 
if(root==null)
{	
return result;
}
 return bfs(root,sum,result,temp,0);
}
public  static  LinkedList<LinkedList<Integer>>  bfs(TreeNode root,int sum,  LinkedList<LinkedList<Integer>> lists,LinkedList<Integer>list,int count)
{
if(root==null)
{
return lists;		
}
list.addLast(root.val);
if(root.left==null&&root.right==null&&(root.val+count)==sum)
{
lists.add(list);	
}
if(root.left!=null)
{
bfs(root.left, sum, lists, list, count+root.val);	
}
if(root.right!=null)
{
bfs(root.right, sum, lists, list, count+root.val);		
}
list.pollLast();
return  lists;
}   
}
class  TreeNode
{
int val;
TreeNode  left,right;
public TreeNode(int  val)
{
this.val=val; 	
}
}
//本地通过测试代码,但给出编译错误
public static LinkedList<LinkedList<Integer>>  pathSum(TreeNode root,int sum)
{	
LinkedList<LinkedList<Integer>> result=new  LinkedList<>();
if(root==null)
{	
return result;
}
result.addAll(bfs(root,sum,new  LinkedList<>(),0));
return  result; 
}
private  static LinkedList<LinkedList<Integer>>  bfs(TreeNode root,int sum,LinkedList<Integer>list,int count)
{
LinkedList<LinkedList<Integer>> result=new LinkedList<>(); 
if(root.left==null&&root.right==null)
{
if((root.val+count)==sum)	
{
list.addLast(root.val);	
result.add(list);
}
return result;  
}
list.add(root.val);
if(root.left!=null)
{
result.addAll(bfs(root.left, sum,new LinkedList<Integer>(list),count+root.val));	
}
if(root.right!=null)
{
 result.addAll( bfs(root.right,sum,new LinkedList<>(list), count+root.val));		
}
return result;
} 
