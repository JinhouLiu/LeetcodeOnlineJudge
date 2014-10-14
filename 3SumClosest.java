public class Solution{
public  static void  main(String[]   args)
{
//未想测试用例
}
public static int threeSumClosest(int[] num, int target)
{
Arrays.sort(num);	
if(num.length<3)
{
return 0; 	
}
int sum;
int ans=num[0]+num[1]+num[2];
for(int i = 0;i<num.length-2;i++)
{
int j=i+1;   	
int  k=num.length-1;	
while(j<k)
   {
   sum=num[i]+num[j]+num[k];	  
   if(Math.abs(target-ans)>Math.abs(target-sum)){
    ans=sum;
    if (ans==target)
	return  ans;  	
	    
    }
    if(sum>target)
    {
     k--;     
	}else
	{
	 j++;	
	} 
  }   	
}
return ans; 
}
}
