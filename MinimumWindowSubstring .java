import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
public class Solution{

//这题实在不会，参考别人的代码
public static String minWindow(String S, String T) 
{
if(S==null||T==null||S.length()<T.length()){
return "";		
}
Map<Character, Integer> map=new  HashMap<Character, Integer>();
int   left=T.length(),start=-1,end=S.length();
for (int i=0;i<T.length();i++){
    char c= T.charAt(i);
    map.put(c,map.containsKey(c)?map.get(c)+1:1);
}
Deque<Integer> queue= new LinkedList<Integer>();
for(int i = 0; i < S.length();i++)
{
char c=S.charAt(i); 
if(!map.containsKey(c))
{
continue;	
}	 
int n=map.get(c);
map.put(c,n-1);
queue.add(i);
if(n>0) left--; 
char head=S.charAt(queue.peek());
while(map.get(head)<0){
queue.poll();
map.put(head, map.get(head)+1);
head=S.charAt(queue.peek());
}
if (left==0){
    int new_length=queue.peekLast()-queue.peek()+1;
    if (new_length<end-start) {
        start=queue.peek();
        end=queue.peekLast()+1;
    } 
}
}
if (left==0)  return S.substring(start,end);
else return "";
}
}
