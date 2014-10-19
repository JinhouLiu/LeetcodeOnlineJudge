public class Solution{
//递归使１－－n每个数都作为根节点，小于他的数作为左子树，大于他的数作为右子树

public static List<TreeNode> generateTrees(int  n)
{
return genTrees(1,n);
}
public  static  List<TreeNode>   genTrees(int   start ,int    end)
{
List<TreeNode> result=new ArrayList<>();
if(start>end){
result.add(null);
return result;
}
else if(start==end)
{
result.add(new TreeNode(start));
return result;     
}
List<TreeNode> left,right;
for(int i=start;i<=end;i++){
left=genTrees(start,i-1);
right=genTrees(i+1,end);
for(TreeNode   lnode:  left){
   for(TreeNode   rnode: right){
    TreeNode  root=new TreeNode(i);
        root.left=lnode;
        root.right=rnode; 
        result.add(root);   
       }
   }
}
return result;
}
}
