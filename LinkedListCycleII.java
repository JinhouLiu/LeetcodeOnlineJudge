public class Solution{
	
public  static  void  main(String[]  args)
{
	
//省略了一些测试代码
} 
public ListNode detectCycle(ListNode head){	
if(head==null){	
return null;
}
ListNode  slow=head,fast=head;
while(fast!=null&&fast.next!=null){
slow=slow.next;	
fast=fast.next.next;
if (fast==slow)  break; 
}
if (fast==null||fast.next==null){
return null;	
}
slow=head;
while(slow!=fast){	
slow=slow.next;
fast=fast.next;
}
return slow;
}
} 
class ListNode
{	
int  val;
ListNode  next; 
public ListNode(int  val)
{	
this.val=val;		
}
}
