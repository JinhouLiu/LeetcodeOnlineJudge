import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
public class Solution
{
//输出所有样例
public static List<String> ladderLength(String start, String end, Set<String> dict)
{
if(start==null||start.length()==0||end==null||end.length()==0||dict.size()==0||dict==null)
{
return null;	
}	
Queue<String> actionQueue=new LinkedList<>();
Set<String> visitedSet=new HashSet<>();
Map<String,String> mapTree=new HashMap<String, String>();
actionQueue.add(start);
visitedSet.add(start);
while(!actionQueue.isEmpty())
{
String w=actionQueue.poll();
for(String v:getOneEditWords(w))
{
if(v.equals(end))
{	
LinkedList<String>  list=new  LinkedList<>(); 	
list.add(v);
while(w!=null)
{
list.add(0,w);
w=mapTree.get(w);
}
return  list;
}
if(dict.contains(v))
{
if(!visitedSet.contains(v))
{
actionQueue.add(v);
visitedSet.add(v);//mark visited
mapTree.put(v, w);	
}	
}
}	
}
return null;
}
//产生所有可能一位不同的单词
public static Set<String> getOneEditWords(String word)
{
Set<String> words=new HashSet<>();       	
for(int i=0;i<word.length();i++)
{
char[] wordArray=word.toCharArray();   	
for(char c='a';c<='z';c++)
{
if(word.charAt(i)!=c)
{
wordArray[i]=c;
words.add(new  String(wordArray));
}		
}	
}
return words;
}
//输出结果 hit->hot->dot->dog->cog,得到正确的答案
public static void main(String[]  args)
{
String  start="hit";
String  end="cog";
Set<String>  dict=new  HashSet<>();
dict.add("hot");
dict.add("dot");
dict.add("dog");
dict.add("lot");
dict.add("log");
List<String>  result=ladderLength( start,end,dict);
for(int i=0;i<result.size();i++)
{
if(i==result.size()-1)
System.out.print(result.get(i));
else
System.out.print(result.get(i)+"->");
}
}
}
