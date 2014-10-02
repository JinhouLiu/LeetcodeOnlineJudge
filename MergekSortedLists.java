public class Solution{
//基于２路并归思想更进一步的提升
public static ListNode mergeKLists(List<ListNode> lists)
{	
if(lists.size()==0||lists==null)
{
return null;	
}
if(lists.size()==1)
{
return lists.get(0);	
}
if(lists.size()==2)
{	
return mergeTwoLists(lists.get(0),lists.get(1));   
}
else
{	
return mergeTwoLists(mergeKLists(lists.subList(0,lists.size()/2)),mergeKLists(lists.subList(lists.size()/2,lists.size()))); 	
}
}
public static ListNode mergeTwoLists(ListNode l1, ListNode l2)
{
if(l1==null){	
return l2;
}
if(l2==null)
{	
return l1;
}
if (l1.val<l2.val)
{	
l1.next=mergeTwoLists(l1.next, l2);
return  l1;
}
else
{	
l2.next=mergeTwoLists(l1,l2.next);
return  l2;
}
}
//基于优先堆的实现
public static ListNode mergeKLists(List<ListNode> lists)
{
if(lists==null||lists.size()==0)
{
return null;	
}
if(lists.size()==1)
{	
return  lists.get(0); 	
}
ListNode helper=new  ListNode(Integer.MIN_VALUE);
ListNode  cur=helper;    
PriorityQueue<ListNode> queue=new  PriorityQueue<>(lists.size(), new   Comparator<ListNode>(){
@Override
public int compare(ListNode o1, ListNode o2)
{
if(o1.val>o2.val) return 1; 	
else if (o1.val<o2.val)  return -1;
else return 0; 
}
});
for(int i = 0;i<lists.size();i++)
{
if(lists.get(i)!=null)
queue.add(lists.get(i));		
}
while(!queue.isEmpty())
{	
cur.next=queue.poll();	
cur=cur.next;
if(cur.next!=null)
queue.add(cur.next); 	
}
return helper.next; 
}
public  static  void  main(String[] args)
{
//没想测试用例,通过在线测试
}
}
