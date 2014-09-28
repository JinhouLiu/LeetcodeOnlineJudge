public class Solution{
  
public  static  void  main(String[] args)
{
//只想过最简单的测试用例
}   
//递归中序遍历
public static  List<Integer> inorderTraversal(TreeNode root)
{	
List<Integer> list=new ArrayList<>();
if (root==null){
return list;  			
}
if(root.left!=null){
list.addAll(inorderTraversal(root.left));	
}
list.add(root.val);
if(root.right!=null){
list.addAll(inorderTraversal(root.right));	
}
return list; 
}

//非递归形式
public static List<Integer>  inorderTraversal(TreeNode root)
{

List<Integer> list=new ArrayList<>();
ArrayDeque<TreeNode> stack=new ArrayDeque<>();
if(root==null){	
return list;
}
TreeNode  p=root;
while(!stack.isEmpty()||p!=null){
if (p!=null)
{
stack.push(p);	
p=p.left;	
}
else
{
p=stack.pop();
list.add(p.val);
p=p.right;
}
}
return  list;
} 
}
//一种不使用额外空间的方法
public static List<Integer>  inorderTraversal(TreeNode root)
{
if(root==null)
{
return;		
}
TreeNode pre,current=root;
while(current!=null){
if(current.left==null)
{
System.out.print(current.val+"\t");	
current=current.right;
}
else
{
pre=current.left;
while(pre.right!=null&&pre.right!=current)
{
pre=pre.right;		
}
if(pre.right==null)
{
pre.right=current;
current=current.left;
}
else
{
pre.right=null;
System.out.print(current.val+"\t");
current=current.right;
}
}
}
}
//节点类构造
class TreeNode
{
int  val;
TreeNode left,right;
public TreeNode(int  val)
{
this.val=val;
}
}
