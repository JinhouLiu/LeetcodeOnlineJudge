public class Solution{

public static void  main(String[] args)
{

//省略了一些测试代码
}

／／测试通过
public static void reorderList(ListNode head){
if(head==null){	
return  ;		
}	
ListNode fast=head;
ListNode slow=head; 
while(fast!=null&&fast.next!=null){
fast=fast.next.next;
slow=slow.next; 		
}
ListNode secondHead=slow.next;
slow.next=null;
secondHead=reverse(secondHead);    
ListNode  cur=head;
while(secondHead!=null){
ListNode temp=secondHead.next; 	
secondHead.next=cur.next;
cur.next=secondHead;
cur=cur.next.next;
secondHead=temp;
}
 
}
public static ListNode reverse(ListNode head)
{
if(head==null||head.next==null){	
return head;	
}
ListNode pre=new ListNode(Integer.MIN_VALUE);
pre.next=head;
head=pre;
ListNode node=pre.next; 
while(node.next!=null){
	ListNode temp=node.next; 
    node.next=temp.next;
    temp.next=pre.next;
    pre.next=temp;   
}
return pre.next; 
}  
}
