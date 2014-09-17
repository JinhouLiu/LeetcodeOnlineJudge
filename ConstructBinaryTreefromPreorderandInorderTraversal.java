import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution{

//通过前序和中序构建二叉树,通过测试

public static TreeNode buildTree(int[] preorder, int[] inorder){

return buildTree(preorder, 0, inorder,0, preorder.length);

}

public static TreeNode  buildTree(int[] preorder,int  prestart, int[] inorder,int instart,int n)
{
if(n<=0){	
return null;		
}	
TreeNode p=new TreeNode(preorder[prestart]);
int i=0;
while(i<n&&p.val!=inorder[instart+i]){
i++;	
}
p.left=buildTree(preorder, prestart+1, inorder, instart, i);
p.right=buildTree(preorder, prestart+i+1, inorder, instart+i+1, n-i-1);
return  p;
}     	
public  static   void   main(String[] args)
{	
int[] preorder={1,2,4,5,3,6,7};
int[]  inorder={4,2,5,1,6,3,7}; 
TreeNode node=buildTree(preorder, inorder);
List<List<Integer>>   lists=levelOrder(node);
for (int i = 0; i <lists.size();i++){
System.out.println(lists.get(i));	
}
}
//层次遍历
public  static  List<List<Integer>>   levelOrder(TreeNode root){	
List<List<Integer>> result=new ArrayList<>();   
if(root==null){	
return  result;
}
Queue<TreeNode> queue=new LinkedList<>(); 
queue.offer(root);
int count=0; 
while(!queue.isEmpty()){
List<Integer> val=new ArrayList<>(); 	
count=queue.size();	
while (count>0){
TreeNode node=queue.poll();
val.add(node.val);
if(node.left!=null){
queue.offer(node.left);	
}
if(node.right!=null){	
queue.offer(node.right);	
}
count--;
}
result.add(val);
//val.clear();
}
return  result; 
}
}
class TreeNode
{
int val;
TreeNode left,right;
public TreeNode(int  val){
this.val=val;	
}
}
