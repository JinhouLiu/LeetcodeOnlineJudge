public   class Solution{

public  static  void  main(String[] args)
{

未写测试用例，通过leetcode online  judge的测试
}   
public  static  int maxProfit(int[] prices){
int  profile=0;
if (prices==null){
return profile;	
}

for(int i = 1; i < prices.length; i++) {

if(prices[i]-prices[i-1]>0)
{
profile+=(prices[i]-prices[i-1]); 			
} 
}	
return profile; 	
}

}
