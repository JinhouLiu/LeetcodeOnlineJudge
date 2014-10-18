
	

//正确通过测试的代码，利用堆栈的思想
import java.util.ArrayList;
public class  Solution1
{
//简单测试样例 
public static void main(String[]  args)
{	
TreeNode  n1=new TreeNode(5);
TreeNode  n2=new TreeNode(4);
TreeNode  n3=new TreeNode(8);
TreeNode  n4=new TreeNode(11);
TreeNode  n5=new TreeNode(13);
TreeNode  n6=new TreeNode(4);
TreeNode  n7=new TreeNode(7);
TreeNode  n8=new TreeNode(2);
TreeNode  n9=new TreeNode(5);
TreeNode  n10=new TreeNode(1);
n1.left=n2;
n1.right=n3;
n2.left=n4;
n3.left=n5;
n3.right=n6;
n4.left=n7;
n4.right=n8;
n6.left=n9;
n6.right=n10;
LinkedList<LinkedList<Integer>>  lists=pathSum(n1, 22);
for(int i = 0; i < lists.size();i++)
{	
System.out.println(lists.get(i));
}
	
static ArrayList<ArrayList<Integer>>  result;
static ArrayList<Integer> stack;   
public  static  void  search(TreeNode  root,int sum)
{
if(root==null) return;
stack.add(root.val);
if(root.left==null&&root.right==null)
{
if(root.val==sum)
{
ArrayList<Integer>	ans=new  ArrayList<>();
for(Integer   item: stack) ans.add(item);	
result.add(ans);
}
}else
{
search(root.left,sum-root.val);
search(root.right,sum-root.val);		
}
stack.remove(stack.size()-1);
}  
public static  ArrayList<ArrayList<Integer>> pathSum(TreeNode  root,int sum)
{
result=new ArrayList<>();
stack=new ArrayList<>();
search(root, sum);
return  result;
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
