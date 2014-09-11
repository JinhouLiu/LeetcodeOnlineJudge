public class Solution{
public static ListNode insertionSortList(ListNode head){	
ListNode helper=new ListNode(Integer.MIN_VALUE);
ListNode cur=head;
ListNode prev=helper; 
while(cur!=null){	
prev=helper;
while (prev.next!=null&&prev.next.val<cur.val){	
prev=prev.next;
}
ListNode next=cur.next;
cur.next=prev.next;
prev.next=cur;
cur=next;
}
return helper.next;
}
public  static  void main(String[]  args)
{
//没时间想测试用例
}
class ListNode{	
int val;
ListNode next;
public ListNode(int val){
this.val=val;	
this.next=null;	
} 	
}
