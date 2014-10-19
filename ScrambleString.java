public class Solution5 {
 
//不理解题目意思


The main idea is:

separate s1 into two parts, namely --s11--, --------s12--------
separate s2 into two parts, namely --s21--, --------s22--------, and test the corresponding part (s11 and s21 && s12 and s22) with isScramble.
separate s2 into two parts, namely --------s23--------, --s24--, and test the corresponding part (s11 and s24 && s12 and s23) with isScramble

public static boolean isScramble(String s1, String s2)
{
if(s1==null||s2==null||s1.length()!=s2.length()) return false;
if(s1.equals(s2)){
return  true; 	
}
char[] c1=s1.toCharArray();
char[] c2=s2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
if(!Arrays.equals(c1,c2)){
return false; 	
}
for(int i = 1; i<s1.length();i++)
{	
	  if(isScramble(s1.substring(0,i), s2.substring(0,i)) && isScramble(s1.substring(i), s2.substring(i))) return true;
      if(isScramble(s1.substring(0,i), s2.substring(s2.length()-i)) && isScramble(s1.substring(i), s2.substring(0, s2.length()-i))) return true;
  
}
return false;  
}

}
