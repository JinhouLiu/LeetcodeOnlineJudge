import java.util.ArrayList;
import java.util.List;
public class Solution{

//未使用队列

public static  List<List<Integer>> levelOrder(TreeNode root){		
List<List<Integer>> result=new ArrayList<>();
List<TreeNode>  level=new  ArrayList<>();
level.add(root);
while(true){
if(level.isEmpty()||level.get(0)==null){	
break;
}
List<TreeNode> nextCurrent=new  ArrayList<>();  
List<Integer>   curVal=new ArrayList<>();
for(TreeNode node:level){	
curVal.add(node.val);
if(node.left!=null)
nextCurrent.add(node.left);	
if(node.right!=null)
nextCurrent.add(node.right);
}

result.add(curVal);

level=nextCurrent;

}

return  result;

}
public static void  main(String[]  args)
{

//省略了一些测试代码，以通过leetcode onlineJudge测试

}


}
class  TreeNode
{
int  val;
TreeNode  left,right;
public TreeNode(int    val){
this.val=val;
}


} 
