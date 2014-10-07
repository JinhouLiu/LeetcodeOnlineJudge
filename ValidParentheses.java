import java.util.ArrayDeque;
import java.util.Deque;
public class Solution
{
public static boolean isValid(String s)
{
if(s==null||s.length()==0)
{
return false;	
}	
Deque<Character> stack=new ArrayDeque<Character>();
for(int i = 0;i<s.length();i++)
{	
if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
{
stack.push(s.charAt(i));
}
else if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')')
{
if(stack.isEmpty()) return false;	
Character character=stack.pop();
         switch(s.charAt(i)){
              case'}':
	              if(character!='{')return  false; 	
	              break;
              case']':
            	  if(character!='[')return  false; 	
	              break;
              case')':
	              if(character!='(')return  false; 	
	              break;	 
          } 
    }else return  false; 
}
if(!stack.isEmpty())return false; 	
return true; 
}		
public  static  void  main(String[]   args)
{
String string="(){}[";
System.out.println(isValid(string));
}   		
}
