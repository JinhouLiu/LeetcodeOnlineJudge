public class Solution{

public static  void  main(String[] args)
{

//只想了几个简单的测试用例，通过leetcode  online  judge的在线测试

}
public  static List<List<Integer>>  zigzagLevelOrder(TreeNode  root)
{	
List<List<Integer>> lists=new ArrayList<>(); 
if(root==null){	
return lists;
}
int order=0;
List<TreeNode>  level=new ArrayList<>();
level.add(root);

while(true){
if(level.isEmpty()||level.get(0)==null){
break;		
}	
List<Integer> cur=new ArrayList<>();
List<TreeNode> nextLevel=new  ArrayList<>(); 
for(TreeNode  node:level){
   cur.add(node.val);
   if (node.left!=null){
	nextLevel.add(node.left);   	
   }
   if(node.right!=null){
  nextLevel.add(node.right);  	
  }
}
if(order==0){
lists.add(cur);
order=order^1;
}else{
List<Integer>  h=new   ArrayList<>();      
for(int i=cur.size()-1; i>=0;i--){

h.add(cur.get(i));	
	
}	
lists.add(h);
order=order^1;
}
level=nextLevel;
}
return lists; 
}   
}
