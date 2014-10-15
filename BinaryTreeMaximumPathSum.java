public  class  Solution
{
public static int max=0;  		
public static int maxPathSum(TreeNode root)
{
if(root==null)return 0; 		
max=root.val;
maxPathSumHelper(root);
return max; 
}
public static int maxPathSumHelper(TreeNode   root)
{
int left=0,right=0;
if(root.left!=null)  left=maxPathSumHelper(root.left);	
if(root.right!=null) right=maxPathSumHelper(root.right);	
left=left>0?left:0;
right=right>0?right:0;
if(root.val+left+right>max) max=root.val+left+right;
return root.val+Math.max(left, right); 
}   
}
class  TreeNode
{
int val;
TreeNode left,right;
public TreeNode(int  val)
{
this.val=val;
}
}
