public class Solution{
public static void main(String[] args)
{	

} 
//暴力破解,时间复杂度有点高
public int maxProfit(int[] prices){
if(prices.length<=1)
{
return price;
}
int max=Integer.MIN_VALUE; 		
for (int i = 0; i < prices.length; i++){
	for(int j = i+1;j< prices.length; j++){
		  int  profile=prices[j]-prices[i];   
	     if(profile>max){	    	 
max=profile; 	    	 
}			
}	
}    	
return   max;    
}
//一种更为优雅的方案
public int maxProfit(int[] prices)
{	
if(prices.length<=1){	
return 0;
}
int profile=0;
int min=prices[0];
for(int i=0;i<prices.length;i++){	
min=Math.min(min, prices[i]);
profile=Math.max(profile,prices[i]-min);
}
return profile;
}
}
