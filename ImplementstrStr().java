public class Solution
{
public  static void  main(String[]  args)
{


}
//暴力破解，通过在线测试
public String strStr(String haystack, String needle) {
            int index = -1;
            index = haystack.indexOf(needle);
         
       return  index==-1?null:haystack.substring(index); 
    
}
}
