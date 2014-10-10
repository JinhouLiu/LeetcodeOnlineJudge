import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//注意去除重复元素
public class Solution
{
public static List<List<Integer>> threeSum(int[] num)
{	
Arrays.sort(num);
List<List<Integer>> result=new  ArrayList<List<Integer>>(); 	
if(num==null||num.length<=2)
{
return result;		
}
for(int i= 0;i<num.length-2;i++)
{
if(i>0&&num[i]==num[i-1])continue;
if(num[i]>0)
break;
else 
{	
  for(int j = i+1 ,k=num.length-1 ; k>j;)
  {
	  if (j>i+1&&num[j]==num[j-1])
	   {
		j++;
		continue;	  
		}
	  if(num[k]==num[k-1])
	   {
	    k--;	 	
	   } 
	  if(num[i]+num[j]>0)
	  {
	   break;	   
	  }
	  int sum=num[i]+num[j]+num[k];
	  if(sum<0)j++;
	  else  if (sum>0) k--;
	  else{
	   List<Integer>   temp=new  ArrayList<>();
	   temp.add(num[i]);
	   temp.add(num[j]);
	   temp.add(num[k]);
	   result.add(temp);
	   j++;
	    }	  
    }
}
}
return result; 
}		  		
}
