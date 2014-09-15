public class Solution{

public static ListNode swapPairs(ListNode head)
{
if(head==null||head.next==null){	
return  head;
}
ListNode  helper=new  ListNode(Integer.MIN_VALUE);
helper.next=head;
for(ListNode cur=helper;cur.next!=null&&cur.next.next!=null;cur=cur.next.next){	
cur.next=swap(cur.next,cur.next.next);
}
return helper.next;  
}
private static ListNode  swap(ListNode  node1,ListNode  node2)
{
node1.next=node2.next;	
node2.next=node1;
return node2; 
}       
public static void  main(String[]  args)
{
//省略一些测试用例
} 		
}
class  ListNode
{
int val;
ListNode   next;
public ListNode(int val){
this.val=val;
this.next=null;	
}
}
