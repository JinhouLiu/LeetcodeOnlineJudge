public class Solution{
public  static   void  main(String[]  args)
{
//没想测试用例
}
//大致思想就是先从左往右扫描，再从右往左扫描,通过在线测试
public static int candy(int[] ratings)
{
int[] candy=new int[ratings.length];
candy[0]=1;
for(int i=1;i<candy.length;i++)
{
candy[i]=ratings[i]>ratings[i-1]?candy[i-1]+1:1;	
}
int totalCandy=candy[ratings.length-1];
for(int i=ratings.length-2;i>=0;i--)
{
//考虑１２３２１的情况，这就是为什么要&&后面的判断的原因
candy[i]=(ratings[i]>ratings[i+1]&&candy[i+1]+1>candy[i])?candy[i+1]+1:candy[i];
totalCandy+=candy[i];
}
return  totalCandy;
}	
}
