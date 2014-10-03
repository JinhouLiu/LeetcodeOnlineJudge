public class Solution
{
public static void main(String[]  args)
{
//没有想测试用例
}
//通过在线测试
public static List<List<Integer>> subsetsWithDup(int[] num) 
{
Arrays.sort(num);
List<List<Integer>> result=new ArrayList<List<Integer>>();
result.add(new ArrayList<Integer>());
int oldval=num[0];//保存for循环中每次num[i]的前一个值，用于判断是否与num[i]的值相等
int oldj=0;//用于判断result的长度，这里标记还不是很清晰  
for(int i=0;i<num.length;i++)
{
int temp=oldj;
if(num[i]!=oldval)
{
oldval=num[i];temp=0;
}
int j=result.size();
oldj=j; 
while(j-->temp){
List<Integer> subset=new  ArrayList<>();
subset.addAll(result.get(j));
subset.add(num[i]);
result.add(subset);
}
}
return  result; 
}
}
