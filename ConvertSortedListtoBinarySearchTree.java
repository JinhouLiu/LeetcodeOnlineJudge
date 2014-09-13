public class  Solution
{
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
public static void main(String[]  args)
{
ListNode l1=new ListNode(1);
ListNode l2=new ListNode(2); 	
ListNode l3=new ListNode(3); 	
ListNode l4=new ListNode(4); 	
ListNode l5=new ListNode(5); 	
ListNode l6=new ListNode(6); 	
ListNode l7=new ListNode(7);
l1.next=l2;
l2.next=l3;
l3.next=l4;
l4.next=l5;
l5.next=l6;
l6.next=l7;
TreeNode node=sortedListToBST(l1);
List<List<Integer>> list=new ArrayList<>();
list=levelOrder(node);
 for(int i = 0; i < list.size();i++){	 
System.out.println(list.get(i));	 	
} 
}

//通过测试
public  static  TreeNode sortedListToBST(ListNode head){
if(head==null){	
return null;
}
int count=0; 
ListNode p=head;
while(p!=null){
p=p.next;
count++;	
}
return  sortedListToBST(new ListNode[]{head}, 0, count-1);
}
public static TreeNode sortedListToBST(ListNode[] head,int  start,int end)
{
if(start>end){	
return null;		
}
//避免上溢
int mid=start+(end-start)/2;
TreeNode left=sortedListToBST(head, start, mid-1);
TreeNode root=new   TreeNode(head[0].val);
root.left=left;
head[0]=head[0].next;
root.right=sortedListToBST(head, mid+1,end);

return root; 
}  
}
class ListNode
{
int val;
ListNode   next;
public ListNode(int val){
this.next=null; 
this.val=val;	
}
}
class TreeNode
{
int val;
TreeNode   left,right; 
public TreeNode(int val){	
this.val=val;
}
} 
