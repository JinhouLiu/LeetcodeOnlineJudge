import java.util.ArrayList;
import java.util.List;
public class Solution
{
public  static void  main(String[]  args)
{
//没想测试用例，但通过在线测试
}
public static List<List<Integer>> subsets(int[] num)
{
Arrays.sort(num);//加这个是与题目要求有关    
List<List<Integer>> result=new ArrayList<List<Integer>>();
result.add(new ArrayList<Integer>());
for(int i = 0; i<num.length;i++)
{	
ArrayList<ArrayList<Integer>> sub=new ArrayList<>(); 
for(int j=0;j<result.size();j++){
ArrayList<Integer> elem=new ArrayList<>(); 
elem.addAll(result.get(j));
elem.add(num[i]); 
sub.add(elem);
}
result.addAll(sub);
}
return result; 
}		
}
