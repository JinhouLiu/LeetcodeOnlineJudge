public class Solution {
public  static void  main(String[]  args)
{
//主要考虑数组全为９时的情况
}
public static int[] plusOne(int[] digits)
{	
if(digits==null)
{
return null; 	
}
if(digits[digits.length-1]!=9)
{	
digits[digits.length-1]+=1;
return  digits;
}
else//末位为９时	
{	
int count=(digits.length-1);
while(digits[count]==9&&count>0){
count--;	
}
if(digits[count]==9){//数组全为９时	
int[] newDigits=new  int[digits.length+1];
for(int i = 0; i < newDigits.length;i++){
if(i==0){
newDigits[i]=1;	
}else
{
newDigits[i]=0;		
}
}
return   newDigits;
}
else
{
digits[count]+=1;
for (int i = count+1; i < digits.length; i++){
	
	digits[i]=0;
}
}
}
return  digits;
}	
}
