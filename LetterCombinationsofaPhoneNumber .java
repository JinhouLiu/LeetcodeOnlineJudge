import java.util.ArrayList;
import java.util.List;

public class Solution
{	

private static final String[]  LETTERS=
{
   "", //0;	
   "", //1
   "abc",//2
   "def",//3
   "ghi",//4
   "jkl",//5
   "mno",//6
   "pqrs",//7
   "tuv",//8
   "wxyz",//9
};	
public static List<String> letterCombinations(String digits)
{	
List<String> result=new ArrayList<>();
result.add("");
for(char c:digits.toCharArray()){
String letter=LETTERS[c-'0']; 	
if (letter.length()==0){	
continue;	
}
List<String>  newResult=new  ArrayList<>();
for (char  l :letter.toCharArray())

for (String s:result)
newResult.add(s+l);		
result=newResult;	
}
return  result;
}
public static void main(String[]  args)
{	
List<String> list=letterCombinations("23");
for (int i = 0; i < list.size(); i++){
	
System.out.print(list.get(i)+"\t");	
}
} 	
}
