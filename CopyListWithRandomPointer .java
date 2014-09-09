public class Solution{	
public static void main(String[]  args)
{
／／省略了一些测试用例	
}
//方法一，比较好的方法
public static RandomListNode copyRandomList(RandomListNode head)
{	
if(head==null){	
return null;
}
RandomListNode p=head;
do{		
RandomListNode q=p.next;
p.next=new RandomListNode(p.label);
p.next.next=q;
p=q;
}while (p!=null);
p=head;
do {
p.next.random=(p.random==null?null:p.random.next);
p=p.next.next;	
}while(p!=null);
p=head;
RandomListNode r=p.next;
for(RandomListNode q=r;;){
p.next=q.next;
p=p.next;
if(p==null) break;
q.next=p.next;
q=q.next;
}
return r;
}
}
class RandomListNode
{
int label;
RandomListNode next,random; 
public RandomListNode(int label){
this.label=label;		
}
} 
