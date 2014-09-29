public class Solution
{
public  static  void  main(String[] args)
{
//没想测试用例
}
public static ArrayList<ArrayList<Integer>>  combine(int n, int k)
{
ArrayList<ArrayList<Integer>> result=new ArrayList<>();
combine(n, k,1,result, new ArrayList<Integer>());
return result; 
}
private  static void  combine(int n,int   k,int start,ArrayList<ArrayList<Integer>>   result,ArrayList<Integer>  list)
{
if(k==0)
{
result.add(list);
return;
}
for(int i=start;i<=n;i++)
{
ArrayList<Integer>  l= new  ArrayList<>(list);
l.add(i);
combine(n, k-1, i+1, result,l);	
}
}
}
