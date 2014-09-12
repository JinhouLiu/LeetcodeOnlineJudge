public class Solution{

//思路很简单，新建两个链表，一个用于存储小于x的节点，另一个用于存储大于或等于x的节点,最后两个链表联合起来	
public  static  ListNode   partition(ListNode head, int x)
{
if(head==null||head.next==null){	
return head;  	
}
ListNode  small=new ListNode(Integer.MIN_VALUE);
ListNode  first=small; 
ListNode  big=new  ListNode(Integer.MIN_VALUE);
ListNode  second=big; 
while(head!=null){
   if(head.val<x){
    first.next=head;	
	first=first.next;	
	}else {
	second.next=head;
	second=second.next;	
	}
  head=head.next; 	
}
second.next=null;
first.next=big.next;
return  small.next; 
}

public static void main(String[]  args)
{	

//省略了一些测试用例
} 		
}
class ListNode
{	
int  val;
ListNode  next;
public ListNode(int   val){
this.val=val;
this.next=null;
}	
}
