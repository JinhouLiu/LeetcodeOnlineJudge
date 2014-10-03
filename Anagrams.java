import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Solution
{

//大致思想是判断每个字符串组成的字符数组是否相同，也运用到了hashmap的特性
public static List<String> anagrams(String[] strs)
{
List<String>  result=new ArrayList<>(); 	
if(strs==null||strs.length==0){
return result; 	
}	   	
Map<String,ArrayList<String>>  map=new HashMap<>();
for (String s: strs)
{
char[] chars=s.toCharArray();
Arrays.sort(chars);
ArrayList<String>  array=map.get(new  String(chars));
if(array==null)
{
array=new  ArrayList<>();
array.add(s);
map.put(new  String(chars),array);	
}else
{
array.add(s);	
}
}
for(String  s:map.keySet())
{	
ArrayList<String>  list=map.get(s);  	
if(list.size()!=1)
{
result.addAll(list);	
}	
}
return result; 
}

public static void main(String[]  args)
{

//没有想测试用例
}  	
}
