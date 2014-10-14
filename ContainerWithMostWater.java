public class Solution
{
//大致思想  假设我们当前寻找的解不是最优解，那么必然存在最优解还未被求值，假设我们左边已经到了最优解左边，那么我们来考虑又边，如果右边等于左边说明寻找结束，他必然跳过了最优解，与假设矛盾，假设
右边还没有到最优解，那么必然会寻找到最优解
public static int maxArea(int[] height)
{
if(height==null||height.length==0)
{
return 0;	
}
int left=0,right=height.length-1,maxArea=0;
while(left<right)
{
maxArea=Math.max(maxArea,(right-left)*Math.min(height[left], height[right]));	
if(height[left]<height[right])
{	
left++;	
}else{
right--;	
}		
}
return maxArea; 
}
}
