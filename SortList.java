public class Solution{
／／通过归并来排序一个单链表
public static ListNode sortList(ListNode head)
{
if(head==null||head.next==null){	
return head; 		
}	    
ListNode fast=head.next.next;
ListNode slow=head;
while(fast!=null&&fast.next!=null){	
fast=fast.next.next;
slow=slow.next;
}	    
ListNode  h=sortList(slow.next);        
slow.next=null;
return MergeSort(sortList(head),h);
}

public static  ListNode  MergeSort(ListNode n1,ListNode n2)
{	
ListNode node=new ListNode(Integer.MIN_VALUE);
ListNode c=node;

while(n1!=null&&n2!=null){
if(n1.val<n2.val){
c.next=n1; 	
n1=n1.next;	
}
else
{
c.next=n2;	  
n2=n2.next;	
}
c=c.next;
 }
    if(n1!=null)
    {
      c.next=n1;	 
	 }	
	 if(n2!=null)
	 {
	 c.next=n2;	 		 
    }
   return node.next;  
}
public  static void  main(String[] args){

//时间有限，没想测试用例，通过leetcode  onlineJudge的在线测试

} 
	
}
class ListNode{	
int val;
ListNode  next;
public ListNode(int  val){
this.val=val;	
this.next=null;	
}
}
