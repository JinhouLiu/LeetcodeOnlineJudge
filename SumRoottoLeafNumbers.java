/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

 //非递归方法
   public static int sumNumbers(TreeNode root){
if(root==null){	
return 0;
} 
return sum(root, 0);
}
public static int sum(TreeNode node ,int  x)
{	
if(node.left==null&&node.right==null){
return  node.val+10*x;   
}
int val=0; 
if(node.left!=null){
val+=sum(node.left, node.val+10*x);		
}
if(node.right!=null){
val+=sum(node.right, node.val+x*10);		
}
return val; 
}     
}
／／想想递归方法
