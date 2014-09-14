public class Solution{

//对哈希不熟悉，导致这题无从下手，借鉴别人的思路及代码
public  static  int longestConsecutive(int[] num)
{
if (num==null||num.length==0){
return   0;	
}
int  longest=0; 
HashMap<Integer, Integer>  map=new HashMap<>();  
for(int i = 0; i < num.length;i++){	
if(map.containsKey(num[i]))
continue;	
int low=num[i];
int upp=num[i];
if (map.containsKey(num[i]-1))
low=map.get(num[i]-1);		
if(map.containsKey(num[i]+1))
upp=map.get(num[i]+1);
longest=Math.max(longest,upp-low+1);
map.put(num[i], num[i]);
map.put(low, upp);
map.put(upp,low);
}
return longest; 
}
}
