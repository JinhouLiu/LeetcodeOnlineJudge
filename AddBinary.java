//一种思想简单但当输入字符串长度就会超时，不是很好的方案
public class Solution
{	
public static String addBinary(String a, String b)
{
if(a==null)
{
return  b;	
}
if(b==null)
{
return  a ; 
}
int m=Integer.valueOf(a,2);
int n=Integer.valueOf(b,2);
return String.valueOf(Integer.toBinaryString(add(m, n))); 
}
public static int add(int a,int b)
{
if(b==0)
{
return a; 
}
int s=a^b;
int c=(a&b)<<1;
return add(s, c);
}
public static void main(String[]  args)
{	
Long start=System.nanoTime(); 	
System.out.println(addBinary("01", "1"));
Long  end=System.nanoTime();
System.out.println((end-start)/10e3);
}  		
}
