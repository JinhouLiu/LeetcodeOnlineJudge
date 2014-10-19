public class Solution{
public static int sqrt(int x)
{
long ans=0;     
long bit=1l<<16;             	
while(bit>0){	
ans|=bit;	
while(ans*ans>x)
{
ans^=bit;	
}	
bit=bit>>1;
}
return (int)ans; 
}
}
