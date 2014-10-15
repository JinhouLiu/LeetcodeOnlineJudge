public class Solution{


//动态规划从尾部开始递归
public static List<String> wordBreak(String s, Set<String> dict)
{
if(s.length()==0||s==null)
{
return null; 	
}
Map<Integer,List<String>> validMap=new HashMap<Integer,List<String>>();
List<String> result=new ArrayList<>();
result.add("");
validMap.put(s.length(),result);
for(int i=s.length()-1;i>=0;i--)
{
     List<String> values=new ArrayList<>(); 
          for(int j=i+1;j<=s.length();j++){
              if(dict.contains(s.substring(i, j))){
                 for(String   words:validMap.get(j)){        	
                 values.add(s.substring(i, j)+(words.isEmpty()?"":" ")+words);				
		         } 	    
            }      
      }
validMap.put(i,values);
}
return   validMap.get(0);  
}
}
