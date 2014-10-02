import java.util.ArrayList;

public class Solution
{
//首先的想法，经过简单测试,没有问题,问题是运行时间太长
public static int removeDuplicates(int[] A)
{
if(A==null||A.length==0)
{
return 0;	
}
if(A.length==1)
{
return 1;	
}
ArrayList<Integer> list=new ArrayList<>();
int slow=0,fast=1;
while(fast<A.length)
{
while(fast<A.length&&A[fast]==A[slow])
{	
fast++;
}
if((fast-slow)>=2)
{
list.add(A[slow]);
list.add(A[slow]);
}else
{
list.add(A[slow]);
}
if(fast==A.length){
break;	
}
slow=fast;
fast=fast+1;
}
if(!(A[0]==A[fast-1])){
list.add(A[fast-1]);	
}
return list.size();
}
//版本２,更高效的版本,运用了数字的一些技巧　
public static int removeDuplicates(int[] A)
{
if(A==null||A.length==0)
{
return 0;	
}
if(A.length==1){
return 1;	
}
if(A.length==2){
return 2;	
}
int len=2,itor=2;
while(itor<A.length)
{
if(A[itor]!=A[len-2])
{
A[len++]=A[itor];     	
}
itor++;	
}
return len;
}    
public static void main(String[]  args)
{
//没有想测试用例
//自己想的版本超时也用了额外的内存空间,好处是得到了我们需要的数组，但不符合题目要求
}  
}
