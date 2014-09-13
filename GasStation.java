public class Solution {


public  static  void  main(String[] args)
{
//没有想测试用例

}

／／暴力解决，是否可以采取动态规划
public static int canCompleteCircuit(int[] gas, int[] cost)
{	
int tank=0;
int[]  newgas=new  int[gas.length*2];
int[]  newcost=new int[cost.length*2]; 
int  k=0;
for(int i=0;i< newcost.length;i++){
	
if(k>=gas.length)
{
	  k=k-gas.length;	
}
newcost[i]=cost[k];
newgas[i]=gas[k];
k++;
}
k=0;
for(int i = 0; i < newcost.length; i++){	
if(tank+newgas[i]>=newcost[i]&&tank>=0)
{  
	  k++;
      tank+=newgas[i]-newcost[i];      
     }else
     {    	 
	 k=0;	 
     }
    if(k==gas.length)
    {  
    return  i+1-gas.length; 	
		
    } 
   
}
return  -1;
}
}
