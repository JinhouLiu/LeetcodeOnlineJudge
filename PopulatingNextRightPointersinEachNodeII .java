//层次遍历变形
public static void connect(TreeLinkNode root)
{	
if(root==null)
{
return;	
}   
Queue<TreeLinkNode> queue=new LinkedList<>(); 
queue.offer(root);
int count=0; 
while(!queue.isEmpty()){
List<TreeLinkNode> val=new ArrayList<>(); 	
count=queue.size();	
while (count>0){	
TreeLinkNode node=queue.poll();
val.add(node);
if(node.left!=null)
{	
queue.offer(node.left);	
}
if(node.right!=null)
{	
queue.offer(node.right);	
}
count--;
}

for(int i = 0;i <val.size() ;i++)
{	
if(i==val.size()-1){
	
val.get(i).next=null;

}else{
	
val.get(i).next=val.get(i+1);	
}
}

}
}
//使用帮助节点，思路大致相同，耗时两者相差不大，但很多人推荐这种方法，不懂为什么
 public static void connect(TreeLinkNode root)
{
TreeLinkNode head=null;
TreeLinkNode prev=null;
TreeLinkNode cur=root;
while(cur!=null){
   while(cur!=null){
	  if(cur.left!=null)
	  {
   	       if(prev!=null){
	       prev.next=cur.left;  
	       }else{
           head=cur.left;
           }     	 
   	   prev=cur.left;	  
	 } 
	 if(cur.right!=null)
	 {
	 if(prev!=null){
		prev.next=cur.right;
	    }else{
	   head=cur.right;	
	   } 
	   prev=cur.right;	 
	 } 
	 cur=cur.next;  
	}
cur=head;
head=null;
prev=null;
}

}
