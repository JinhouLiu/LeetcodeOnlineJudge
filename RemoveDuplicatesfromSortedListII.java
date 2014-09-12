public class  Solution{

public  static void  main(String[]  args)
{
//没时间写测试用例及代码	
}
//通过两个指针来实现
public static ListNode deleteDuplicates(ListNode head){
	
if(head==null||head.next==null){
return head; 		
}
ListNode helper=new  ListNode(Integer.MIN_VALUE); 
ListNode  cur=helper;
ListNode suc=null;
while(head!=null){
for(suc=head.next;suc!=null&&suc.val==head.val;suc=suc.next);
if(head.next==null||head.next==suc){
  cur.next=head;	
  cur.next=cur;
  cur.next=null;
}
head=suc;
}
return  helper.next; 
}
}
class ListNode
{
int  val;
ListNode   next;
public ListNode(int  val){
this.val=val; 
this.next=null;	
}
}
