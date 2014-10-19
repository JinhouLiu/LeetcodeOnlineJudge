public class Solution{

//判断一个字符串是否是数字
public static boolean isNumber(String s)
{
return s.matches("(\\s*)[+-]?((\\.[0-9]+)|([0-9]+(\\.[0-9]*)?))(e[+-]?[0-9]+)?(\\s*)");    		
}
}
