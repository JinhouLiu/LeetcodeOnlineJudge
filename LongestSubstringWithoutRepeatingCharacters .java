public class Solution
{
public  static  void   main(String[]  args)
{
//通过在线测试
} 
//大致思想是将字符按照顺序入到一个linkedList中，如果容器中包含此字符，就从头开始直到这个字符首次出现的地方全部移除，同时记录容器的最大元素值
public static int lengthOfLongestSubstring(String s)
{
LinkedList<Character> list=new LinkedList<>(); 
int    maxLength=0; 
for(int i = 0;i<s.length();i++)
{
	
if(list.contains(s.charAt(i)))
{	
int index=list.indexOf(s.charAt(i));
while(index>=0)
{
list.remove(index);
index--;
}
}
list.addLast(s.charAt(i));
if(maxLength<list.size()){
maxLength=list.size();	
}
}
return maxLength;
}
}
