public class Solution
{
//不用除号实现除法
public  static   int  add(int  a,int b)
{	
if(b==0)
{
return a;	
}
int  s=a^b;
int  c=(a&b)<<1;
return  add(s, c); 
}
public static int  negative(int i)     
{
return add(~i,1);  	
}
public static int subtraction(int a,int b)
{	
return add(a,negative(b));
}
public  static   int   getSign(long   number)
{
return (int)number>>31;    		
} 
//转化为正数
public static  long  bePositive(long number)
{
if(getSign(number)>=0)
return number;
else
return negative(number);
}
public  static  long   substraction(long a,long b)
{
 return  add(a, negative(b));	
} 
public  static   long  add(long a,long b)
{if(b==0)
{
return a;	
}
long s=a^b;
long  c=(a&b)<<1;
return  add(s, c);	      
}
public static  long  negative(long   number)
{
return   add(~number,1);	
}
public static int divide(int a,int b)
{
if(b==0) return 0;
boolean flag=false;
if(getSign(a)==getSign(b)) flag=true; 
long  aa=bePositive((long)a);

long  bb=bePositive(b);
int i=31;
long ans=0;
while(i>=0)
{
if((aa>>i)>=bb)
{
ans=add(ans,1<<i);
aa=substraction(aa,bb<<i);
}
i=subtraction(i, 1);
}
if(flag==true)return  (int)ans;  		
else  return  (int)negative(ans); 
}
}
