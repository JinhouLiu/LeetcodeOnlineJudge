public class　Solution{
//使用堆栈的方法
public static List<List<Integer>> levelOrderBottom(TreeNode root)
{
LinkedList<List<Integer>> lists=new LinkedList();
if(root==null)
{	
return  lists; 	
}		
ArrayDeque<TreeNode>  stack=new ArrayDeque<>();  
int count=0;
stack.offer(root);
   
while(!stack.isEmpty()){
  List<Integer>  list=new ArrayList<>();
  count=stack.size();
  while(count>0){
  TreeNode  node=stack.poll(); 	 
  list.add(node.val);
  if(node.left!=null){
   stack.offer(node.left); 	
  }
  if(node.right!=null){	  
   stack.add(node.right);	   	
}  
 count--;
}
lists.addFirst(list);  
}
return lists; 
}
public  static  void  main(String[]  args)	  
{

//没有写测试用例，通过在线测试

} 	
} 
class  TreeNode
{
int val;
TreeNode   left,right;
public TreeNode(int val){
this.val=val;		
}

}
