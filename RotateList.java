public class  Solution{

//题目表意不明，有点歧义

public static ListNode rotateRight(ListNode head, int n)
{
if (head==null||head.next==null||n==0){
return  head; 
	
}	
ListNode  helper=new  ListNode(Integer.MIN_VALUE);
helper.next=head;
ListNode fast=helper;
ListNode slow=helper;
    
int  i;
for(i=0;fast.next!=null;i++){	
fast=fast.next;
}
for(int j=i-n%i;j>0;j--){	
slow=slow.next;		
}
fast.next=helper.next;
helper.next=slow.next;
slow.next=null;
return helper.next;
}


public  static void  main(String[]  args)
{
	

}  	
}
class ListNode
{
int  val; 	
ListNode  next;
public ListNode(int  val){	
this.val=val;	
this.next=null;	
}
}
