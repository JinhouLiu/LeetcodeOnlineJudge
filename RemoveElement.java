public class Solution{

//想法出现了一点偏差，我首先想到的是利用快速排序来排列数组，在删除重复元素，与最优解法有一点点差距

public  static  void  main(String[] args)
{

//省略了一些测试用例
}
public static int removeElement(int[] A, int elem)
{
int  begin=0;
for(int i = 0; i < A.length; i++){
if (A[i]!=elem){
A[begin++]=A[i];	
}		
}
return begin;  
}
}
