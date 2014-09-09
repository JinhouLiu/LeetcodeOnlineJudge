import java.util.ArrayList;
import java.util.List;
public class Solution4{
	
public static ArrayList<Integer> getRow(int rowIndex)
{	
ArrayList<Integer> list=new ArrayList<>(rowIndex+1);
if(rowIndex>0){	
list.add(0,1);
}
for(int i=1;i<list.size();i++)
{	
list.add(i,list.get(i-1)*(rowIndex-i+1)/i);
}
System.out.println(list.size());
return list;
}  
public static void main(String[] args)
{	
List<Integer>  list=getRow(4);
for(int i = 0;i<list.size();i++){
System.out.println(list.get(i));		
}
} 
}
／／the  seconds

import java.util.LinkedList;

public class Solution{	
static LinkedList<LinkedList<Integer>> result;
public static LinkedList<LinkedList<Integer>>   pathSum(TreeNode root,int sum)
{
result=new  LinkedList<LinkedList<Integer>>();	
if(root==null){
	
return result;
}
LinkedList<Integer>  list=new  LinkedList<>();
bfs(root, sum, list, 0);
return  result;
}
public static void bfs(TreeNode  root,int  sum,LinkedList<Integer>  list, int  count)
{	
list.addLast(root.val);
if(root.left==null&&root.right==null&&(root.val+count)==sum){	
result.addLast(list);
}
if(root.left!=null){	
bfs(root.left,sum,list,count+root.val);
}
if(root.right!=null){			
bfs(root.right, sum, list, count+root.val);
}
list.pollLast();
}

public static void main(String[]  args)
{
TreeNode  n1=new TreeNode(1); 
TreeNode  n2=new TreeNode(2); 
TreeNode  n3=new TreeNode(3); 
TreeNode  n4=new TreeNode(4); 
TreeNode  n5=new TreeNode(5); 
TreeNode  n6=new TreeNode(6); 
TreeNode  n7=new TreeNode(6);
n1.left=n2;
n1.right=n3;
n2.left=n4;
n2.right=n5;
n3.left=n6;
n3.right=n7;
pathSum(n1, 10);

System.out.println(result.size()); 
for (int i = 0; i < result.size(); i++){
	
for(int j = 0; j<result.get(i).size();j++){
	
System.out.print(result.get(i).get(j)+"\t");		
}	
System.out.println();
}


}    
}
class TreeNode
{	
int val;
TreeNode left,right;
public TreeNode(int  val)
{
this.val=val;	
}
}

//the thrid

import java.util.ArrayList;
import java.util.List;
public class Solution{	
static ArrayList<Integer> list=new  ArrayList<>(); 	
public static List<Integer> postorderTraversal(TreeNode root)
{
if (root==null){
return list; 	
}		
if(root.left!=null){
postorderTraversal(root.left);	
}
if(root.right!=null){
postorderTraversal(root.right);
}
list.add(root.val);
return list; 
}
public static void main(String[]  args)
{	
TreeNode  n1=new TreeNode(1); 	
TreeNode  n2=new TreeNode(2);
TreeNode  n3=new TreeNode(3);
n1.left=n2;
//n2.left=n3;
postorderTraversal(n1);
for(int i = 0;i<list.size();i++){	
System.out.println(list.get(i));		
}
}
}
class TreeNode
{
int val;
TreeNode left,right;
public TreeNode(int val){	
this.val=val;	
}
}
//question  4
public static List<Integer> postorderTraversal(TreeNode root)
{
if (root==null){
return list; 	
}		
if(root.left!=null){
postorderTraversal(root.left);	
}
if(root.right!=null){
postorderTraversal(root.right);
}
list.add(root.val);
return list;
}
//Problem  6
public static RandomListNode copyRandomList(RandomListNode head)
{	
if(head==null){
return null;
}
RandomListNode p=head;
while(p!=null){	
RandomListNode q=new RandomListNode(p.label);
q.next=p.next;
p.next=q;
}
p=head;
while(p!=null){
p.next.random=(p.random==null?null:p.random.next);
p=p.next.next;
}
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
