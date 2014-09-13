
//递归版本，代码太复杂，可能存在优化空间，但通过测试
public static boolean  isSymmetric(TreeNode root)
{	
if (root==null){

return true; 	
	
}
	
if(root.left==null&&root.right!=null||root.left!=null&&root.right==null){	
return false;
}
if(root!=null&&root.left==null&&root.right==null){	
return true;
}
return Symmetric(root.left,root.right); 
}
public static boolean Symmetric(TreeNode left,TreeNode right)
{
if(left==null&&right==null){	
return true;
}
if(left.val!=right.val||left.left==null&&right.right!=null||left.right==null&&right.left!=null||left.left!=null&&right.right==null||left.right!=null&&right.left==null){	
return false;
}
return Symmetric(left.right,right.left)&&Symmetric(left.left, right.right); 
}
