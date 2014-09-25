public class Solution
{
//通过在线测试
static boolean  InvalidInput=false;   	
public static  double pow(double x, int n)
{
if(n>Integer.MAX_VALUE||n<=Integer.MIN_VALUE)
{
return 1.0; 	
}	
if(x==0&&n<0)
{
InvalidInput=true;
return 0.0;
}
if(n<0)
{	
double result=powWithExponent(x,-n); 
return 1.0/result;
}else{
double  result=powWithExponent(x, n); 
return  result;
}
}
public  static double powWithExponent(double x,int n)
{
if(n==0)
{	
return 1.0;	
}
if(n==1)
{	
return x;     	
}
double  result=powWithExponent(x,n>>1);
result*=result;
if((n&0x1)==1)
{
result*=x;	
}
return result;
}
}
