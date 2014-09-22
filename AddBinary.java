／／很好思想方案，跟自己想的差不多，基础不扎实，我跟他想的相反，还有a.charAt(m-1-i)-'0'是我没想到的，基础不好
public static String addBinary(String a, String b)
{
if(a==null)
{
return b;	
}
int m=a.length(); 

if(b==null)
{
return a; 
}
int n=b.length();   
int  carry=0; 
String  res=""; 
int maxLen=Math.max(a.length(),b.length());
for(int i = 0; i < maxLen;i++)
{
int  p=i<a.length()?a.charAt(m-1-i)-'0':0;  
int  q=i<b.length()?b.charAt(n-i-1)-'0':0;
int  temp=p+q+carry;
carry=temp/2;
res=temp%2+res;
}
return(carry == 0)?res:"1" +res;
}

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
