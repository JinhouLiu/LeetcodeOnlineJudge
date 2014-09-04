public class Solution{

public  static  void  main(String[]  args)
{	
／／省略了一些测试节点
}
public static ListNode deleteDuplicates(ListNode head)
{	
if(head==null){	
return null;
}
if(head.next==null){	
return  head;
}
ListNode p=head,q=head.next;
while(q!=null){	
if(p.val==q.val){	
p.next=q.next;
q=q.next;	
}else{
p=p.next;	
q=q.next;	
}
}
return head; 
}	
}
class ListNode
{
int val;
ListNode  next;
public ListNode(int val){
this.val=val;	
this.next=null;	
}
} 
