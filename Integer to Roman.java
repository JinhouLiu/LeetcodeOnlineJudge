import java.util.LinkedHashMap;
public class Solution
{
//看别人的，想不出来，对别人的代码有了一定的依赖，不愿意想问题了，ＧＧ
private static LinkedHashMap<Integer,String> map=new  LinkedHashMap<Integer,String>();       
static
{
map.put(1000,"M");
map.put(900,"CM");
map.put(500,"D");
map.put(400,"CD");
map.put(100,"C");
map.put(90,"XC");
map.put(50,"L");
map.put(40,"XL");
map.put(10,"X");
map.put(9,"IX");
map.put(5,"V");
map.put(4,"IV");
map.put(1,"I");
}		
public static String intToRoman(int num)
{
for(Integer i:map.keySet())
{
if(num>=i)
{
return  map.get(i)+intToRoman(num-i);	
}
}
return "";
}		
}
