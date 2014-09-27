import java.util.ArrayList;
import java.util.List;
public class Solution
{
static List<List<Integer>> result; 
static List<Integer> temp; 
 static boolean[]   isUsed;  
public static List<List<Integer>> permute(int[] num)
{
result=new ArrayList<>();
isUsed=new boolean[num.length];
temp=new  ArrayList<>();
doPermute(0, num);
return result; 
}
public static  void doPermute(int  index,int[]  num)
{
if(index==num.length)
{
result.add(new  ArrayList<>(temp));
return;
}
for(int i = 0; i < num.length; i++) {
if (!isUsed[i]){
temp.add(num[i]);	
isUsed[i]=true;
doPermute(index+1,num);
isUsed[i]=false;
temp.remove(index);
}	
}
}
//最简单的测试用例,通过在线测试,时间不够
public static void main(String[]  args)
{
int[] A={1,2,3};
List<List<Integer>>  result=permute(A);
System.out.println(result.size());
for (int i = 0; i <result.size(); i++) {
	
System.out.print(result.get(i));	
}
}  	
}
