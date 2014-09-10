public class Solution{

／／递归中序遍历
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

／／节点类构造
class TreeNode
{
int  val;
TreeNode left,right;
public TreeNode(int  val)
{
this.val=val;
}
}
