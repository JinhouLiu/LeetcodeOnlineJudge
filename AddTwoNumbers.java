//非递归写法
public class Solution{
public static  void  main(String[]  args)
{
//注意这个测试用例　　思维没想到　９９９９９９９９８９９９　　１　
}  
public static ListNode addTwoNumbers(ListNode l1,ListNode l2)
	{
	if(l1==null)
	{
	return l2;
	}	
	if(l2==null)
	{
	return l1;	
	}
	boolean carry=false; 
	ListNode helper=new ListNode(Integer.MIN_VALUE);
	ListNode cur=helper;
	while(l1!=null||l2!=null)
	{
	   if(l1!=null&&l2==null)
		  {	
		    if(carry==false)
		    {
		    ListNode curNext=l1;
		    cur.next=curNext;
		    l1=l1.next;
		    }else
		    {//carry==true
		          while(l1!=null&&carry!=false)
		          {
		        	  if(l1.val==9)//循环产生进位
			            {
			            ListNode curNext=new ListNode(0);
			            cur.next=curNext;
			            cur=cur.next;
			            l1=l1.next;
			            }else//不产生进位   
			            {
			            ListNode curNext=new  ListNode(l1.val+1);
			            cur.next=curNext;
			            cur=cur.next;
			            l1=l1.next;
			            carry=false;
			            }		        	  
				 }
		         while(carry==false&&l1!=null){//l1可能没有循环完，加上这个while循环确保l1到底了　　　
		        	 ListNode curNext=new  ListNode(l1.val);
			            cur.next=curNext;
			            cur=cur.next;
			            l1=l1.next;
			            carry=false;					
				} 
		        
					
			  
	}
		break;    
		} 
		if(l1==null&&l2!=null)
		{
		if(carry==false)
		{
			ListNode curNext=l2;
			cur.next=curNext;
			l2=l2.next;
		}else
		{//carry==true
			while (carry!=false&&l2!=null)
			{
				
			        if(l2.val==9)//再次产生进位
			        {
			        ListNode curNext=new ListNode(0);
			        cur.next=curNext;
			        cur=cur.next;
			        l2=l2.next;
			        
			        }else//不产生进位   
			        {
			        ListNode curNext=new  ListNode(l2.val+1);
			        cur.next=curNext;
			        cur=cur.next;
			        l2=l2.next;
			        carry=false;
			        } 	
			}
			 while(carry==false&&l2!=null){//原理同上
	        	 ListNode curNext=new  ListNode(l2.val);
		            cur.next=curNext;
		            cur=cur.next;
		            l2=l2.next;
		            carry=false;					
			} 
		       
		}
		break;  	
	}
		
	int nodeVal=l1.val+l2.val;
	if(l1!=null&&l2!=null)
	{      	
	       if(nodeVal/10==1)//两数想加产生一个进位时 
	       {
	           if(carry==false)//前一个没有进位 
	           {
	           ListNode curNext=new ListNode(nodeVal%10);
	           cur.next=curNext;
	           cur=cur.next;
	           l1=l1.next;
	           l2=l2.next;}else//说明前一个也有进位
	           {
	           ListNode curNext=new ListNode(nodeVal%10+1);
	           cur.next=curNext;
	           cur=cur.next;
	           l1=l1.next;
	           l2=l2.next;	
	           }	
	           carry=true;
	       }else{ //nodeVal/10=0
	            if(nodeVal==9)
	            {
	                 if(carry==true)
	                 {
	      		     ListNode  curNext=new  ListNode(0);
	      		     cur.next=curNext;
	      		     cur=cur.next;
	      		     l1=l1.next;
	      		     l2=l2.next;
	      		     }else //carry==false  
	      		     {
	      		     ListNode curNext=new  ListNode(nodeVal);
	      		     cur.next=curNext;
	      		     cur=cur.next;
	      		     l1=l1.next;
	      		     l2=l2.next;
	      		     
	      		     }
	                     
	            }else 
	             {
				      if(carry==true)
				      {
				      ListNode  curNext=new  ListNode(nodeVal+1);
				      cur.next=curNext;
					  cur=cur.next;
					  l1=l1.next;
					  l2=l2.next;
					  carry=false;
				      }else
				      {//carry==false
					  ListNode curNext=new  ListNode(nodeVal);
					  cur.next=curNext;
					  cur=cur.next;
					  l1=l1.next;
					  l2=l2.next;
					  } 
			     }
		    }          
	}
	}//end while
	if(carry==true){
	ListNode end=new  ListNode(1);
	cur.next=end;
	carry=false;
	}
	return helper.next;  
	}		
}
一种递归写法，代码更精简
public class Solution{
public static ListNode addTwoNumbers(ListNode l1,ListNode l2)
{
if(l1==null&&l2==null)
{
return  null; 	
}	
return  addLists(0,l1, l2); 
}
public static ListNode addLists(int   carry,ListNode  l1,ListNode  l2)
{
	
if(l1==null&&l2==null)
{
if(carry==0)return null;	
else
return new ListNode(carry); 	
}	
ListNode result=new ListNode(carry);
int val=carry;
if(l1!=null) val+=l1.val;
if(l2!=null) val+=l2.val;
result.val=val%10;
result.next=addLists(val>=10?1:0,l1==null?null:l1.next,l2==null?null:l2.next);
return  result; 
}     		
}
