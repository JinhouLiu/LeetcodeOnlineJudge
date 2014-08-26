public class Solution
{

public　static 　boolean 　hasCycle(ListNode  head)
{

if(head==null)
{

return false;

}

ListNode fast=head;
ListNode slow=head;

while(fast!=null&&fast.next!=null)
{
fast=fast.next.next;	
slow=slow.next;	
if (slow==fast){
	
return  true; 	
	
}
}
return false; 
}  
public  static  void   main(String[]  args)
{
	
//省略了一些测试代码
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
