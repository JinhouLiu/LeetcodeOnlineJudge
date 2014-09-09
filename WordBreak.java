import java.util.Set;
public class Solution{
//动态规划，自底向上，测试通过
public boolean  wordBreak(String s, Set<String> dict)
{
if(s==null||dict.contains(s)){

return true;

}
boolean[] can=new boolean[s.length()+1];
can[0]=true;
for(int i=1;i<=s.length();i++)	
   for(int j=0; j<=i; j++)
{
if(can[j]&&dict.contains(s.substring(j, i))){	
can[i]=true;	
break;	
}	  
}
return can[s.length()]; 
}
public static  void  main(String[]  args)
{
//省略了一些测试代码通过leetcode onlineJudge的测试  
}
//动态规划，自顶向下,测试通过
public  boolean wordBreak(String s, Set<String> dict)
{
if(s==null||dict.contains(s)){
return true;
}
boolean[] can=new boolean[s.length()+1];
can[s.length()]=true;
for(int i = s.length()-1;i>=0;i--){
 for(int j = i; j<=s.length();j++) {
    if(can[j]&&dict.contains(s.substring(i, j))){
	        can[i]=true;  
          break;
}	   
} 
}
return can[0];
}
//暴力求解方法

public boolean wordBreak(String s, Set<String> dict)
{
if(s==null||di)

}
}
