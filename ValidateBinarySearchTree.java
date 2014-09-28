public class Solution{


//前序遍历，方法一
public static boolean isValidBST(TreeNode root)
{
if(root==null)
{
return true;		
}
TreeNode prev=null,post=null;
if(root.left!=null)
{
prev=root.left;
while(prev.right!=null)//这里不能是prev！=null　　不然prev一定为null　　　　
prev=prev.right;	
if(prev.val>=root.val)
return false; 		
}
if(root.right!=null)
{
post=root.right;	
while (post.left!=null)
post=post.left;		
if(post.val<=root.val)
return false;	
}
return  isValidBST(root.left)&&isValidBST(root.right);
}		
}
