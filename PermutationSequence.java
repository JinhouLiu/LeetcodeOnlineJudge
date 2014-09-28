import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution{
static List<List<Integer>> result; 
static List<Integer> temp;
static boolean[]   isUsed;
static Map<Integer,List<Integer>>  map;
static  int k;
//时间复杂度太高的一种方案，但是复用了以前的代码
public static List<List<Integer>> permute(int[] num)
{
k=0;	
result=new ArrayList<>();
map=new  HashMap<>();
isUsed=new boolean[num.length];
temp=new  ArrayList<>();
doPermute(0, num);
return result;
}
public static String getPermutation(int n, int k)
{
int[] A=new int[n];
for(int i = 0; i < A.length;i++)
{
A[i]=i+1;
}
permute(A);
return map.get(k-1).toString();
}
public static  void doPermute(int  index,int[]  num)
{
	
if(index==num.length)
{	
map.put(k++,new ArrayList<>(temp));
return;
}
for(int i = 0; i < num.length; i++)
{
if(!isUsed[i])
{
temp.add(num[i]);	
isUsed[i]=true;
doPermute(index+1,num);
isUsed[i]=false;
temp.remove(index);
}	
}
}
public  static void  main(String[]  args)
{

}   		
}
