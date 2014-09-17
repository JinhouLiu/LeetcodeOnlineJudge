import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class  Solution
{
//层次遍历树
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
while(count>0){
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
}
return  result; 
}			
//通过测试	
public static  TreeNode sortedArrayToBST(int[] num)
{
	
return sortedArrayToBST(num, 0, num.length-1);

}
public   static TreeNode  sortedArrayToBST(int[] num,int  start,int  end){
if (start>end){
return  null;		
}
int mid=start+(end-start)/2;
 
TreeNode left=sortedArrayToBST(num,start,mid-1);
TreeNode root=new TreeNode(num[mid]);  
root.left=left;
root.right=sortedArrayToBST(num, mid+1, end);
return root; 
}
public  static  void  main(String[]  args)
{
Long  start=System.nanoTime(); 	
int[] a={1,3};  	
TreeNode n=sortedArrayToBST(a, 0,a.length-1);
List<List<Integer>> list=levelOrder(n);
for(int i = 0; i < list.size();i++){
System.out.println(list.get(i));		
}
Long  end=System.nanoTime();
System.out.println((end-start)/10e3);
} 		
}
class TreeNode
{	
int val;
TreeNode left,right;
public TreeNode(int val){
this.val=val;
}
} 
