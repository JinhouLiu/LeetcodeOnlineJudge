public class Solution {

public  static  void  main(String[] args)
{
//省略了一些测试代码
}
public ListNode removeNthFromEnd(ListNode head, int n)
{
if (head==null){
return  null; 	
}
ListNode fast=head; 
ListNode slow=head;
for(int i = 0;i<n;i++){	
fast=fast.next;		
}
if(fast==null){	
return slow.next;
}
while(fast.next!=null){
fast=fast.next;
slow=slow.next;
}
slow.next=slow.next.next;
return head; 
}
}
