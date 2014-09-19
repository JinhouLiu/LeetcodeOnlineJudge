import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache{
private    Map<Integer, Integer>  map;
private   int  capacity;  
public LRUCache(int c)
{
this.capacity=c;	
this.map=new  LinkedHashMap<Integer,Integer>(capacity,0.75f,true){


protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
    return size() > capacity;
}
};
}
public int get(int  key)
{
if(!map.containsKey(key))
{
	
return -1;

}else
{	
return  map.get(key);
}
}
public void set(int  key,int  value)
{
map.put(key, value);	
}

}
