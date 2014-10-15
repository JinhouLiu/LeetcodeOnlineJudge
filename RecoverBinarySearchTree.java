//通过在线测试
public  class  Solution
{	
public static void recoverTree(TreeNode root)
{
TreeNode prev1=null,prev2=null,cur1=null,cur2=null;   	  	
    if(root==null)
    {
    return;		
	}
	TreeNode pre,current=root,pred=null;
	while(current!=null){
	if(current.left==null)
	{
	pred=current;	
	current=current.right;
	}
	else
	{
	pre=current.left;
	while(pre.right!=null&&pre.right!=current)pre=pre.right;		
	if(pre.right==null)
	{
	pre.right=current;
	current=current.left;
	}
	else
	{
	pre.right=null;
	pred=current;
	current=current.right;
	}
	}
	if(pred!=null&&current!=null&&pred.val>current.val){
	 if(prev1==null){prev1=pred;cur1=current;}
	 else{prev2=pred;cur2=current;}
	}
	}
int tmp;
if(prev1!=null&&cur2!=null){
tmp=prev1.val;
prev1.val=cur2.val;
cur2.val=tmp;
}else {
tmp=prev1.val;	
prev1.val=cur1.val;
cur1.val=tmp;
}
}	
}
class TreeNode
{
int val;
TreeNode left,right;
public TreeNode(int val)
{
this.val=val;	
} 
} 
