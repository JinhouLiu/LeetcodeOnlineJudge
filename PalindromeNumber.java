public class Solution
{
//判断一个数是否是回文不使用额外空间
public static boolean isPalindrome(int x)
{	
if(x<0)//negative number can't be a  palindrome  number    
{
return false; 	
}
int div=1;
while(x/div>=10)//我首先想的是想x/>１这导致了当x是一位数时出现了判断失误的情况 
{
div*=10;	
}
while(x!=0)
{
int l=x/div;
int r=x%10;
if(l!=r)
{
return false;	
}
x=(x%div)/10;//截掉x的首位和末位
div/=100;
}
return true; 
}
}
