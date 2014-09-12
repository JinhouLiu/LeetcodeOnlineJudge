public class  Solution{

public static ListNode  reverseBetween(ListNode head, int m, int n)
{
if(head==null||head.next==null||m==n){
	
return  head;

}
ListNode  helper=new ListNode(Integer.MIN_VALUE);
helper.next=head;
ListNode p=helper; 
int  k=1;
//定位m位置的前一个节点,关键思想
while(k++<m){	
p=p.next;
}
ListNode  cur=p.next; 
ListNode  temp=cur; 
while (m++<n){	
temp=cur.next;	
cur.next=temp.next;
temp.next=p.next;
p.next=temp;
}
return helper.next;
}

public static void  main(String[]  args)
{

／／省略了一些测试用例
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
