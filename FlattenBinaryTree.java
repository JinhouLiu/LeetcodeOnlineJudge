//未能通过时间测试的代码，自己写的
import java.util.ArrayDeque;
public class Solution{
	
public static void flatten(TreeNode root)
{	
if(root==null||(root.left==null&&root.right==null)){
return;		
}
ArrayDeque<TreeNode> firstStack=new  ArrayDeque<>();
ArrayDeque<TreeNode> secondStack=new ArrayDeque<>();
inOrder(root, firstStack, secondStack);
System.out.println(secondStack.size());
TreeNode head=root=secondStack.pollLast();  
while(!secondStack.isEmpty()){	
head.right=secondStack.pollLast();
head=head.right;
}
while(root!=null){
System.out.println(root.val);
root=root.right;	
}
}
public static void inOrder(TreeNode cur,ArrayDeque<TreeNode> firstStack,ArrayDeque<TreeNode> secondStack)
{
if(cur==null){	
return;
}
firstStack.push(cur);
while(!firstStack.isEmpty()){	
TreeNode node=firstStack.pop();
secondStack.push(node);
if(node.right!=null){	
firstStack.push(node.right);
if(node.left!=null){	
firstStack.push(node.left);
}
}	
}
}   
public  static   void   main(String[]  args) 
{	
TreeNode  n1=new  TreeNode(1); 
TreeNode  n2=new  TreeNode(2); 
TreeNode  n3=new  TreeNode(3); 
TreeNode  n4=new  TreeNode(4); 
TreeNode  n5=new  TreeNode(5); 
TreeNode  n6=new  TreeNode(6);
n1.left=n2;
n2.left=n3;
n2.right=n4;
n1.right=n5;
n5.right=n6;
flatten(null);
}
}
class TreeNode
{
int  val; 	
TreeNode left,right;
public TreeNode(int  val){	
this.val=val;	
}
}
//一种未使用堆栈，广为推荐的答案
public class Solution{
public static void flatten(TreeNode root)
{	
if(root==null){	
return;
}
while(root!=null){
if(root.left!=null){
TreeNode cur=root.left;
while (cur.right!=null) cur=cur.right; 	  
cur.right=root.right;
root.right=root.left;
root.left=null;
}
root=root.right;
}
}
}
//使用堆栈的答案
