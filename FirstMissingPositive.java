public class Solution{
public static int firstMissingPositive(int[] A)
{
if(A==null){	
return 1;
}
Hashtable<Integer,Boolean> table=new  Hashtable<>();
for(int i=0;i< A.length;i++){	
if(A[i]<=A.length&&A[i]>0)	
table.put(A[i], true);
}
for(int j= 1;j<=A.length+1; j++) {
if(table.containsKey(j))
continue; 	 
else if(j>=table.size()||!table.containsKey(j))
return j;    	
}
return 1;
}
public  static void  main(String[]  args)
{
//省略测试用例

}
}
