import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution{

//这个编译器真是奇葩啊，第二个方法中两个参数位置不同都会给出不同答案，真尼玛奇葩  	
public static List<List<Integer>> combinationSum(int[] candidates, int target)
{	
List<List<Integer>>result=new LinkedList<List<Integer>>(); 	
if(candidates==null||target<0)
{
return null; 	
}
Arrays.sort(candidates);
recursive(new ArrayList<Integer>(),target,0,candidates,result);
return  result; 
}
public static void recursive(List<Integer>  list,int target,int  index,int[] candidates,List<List<Integer>>  result)
{
if(target==0){
result.add(list);
return;    	
}
for(int i = index; i < candidates.length; i++){
int	newTarget=target-candidates[i];
if(newTarget>=0)
{	
List<Integer> newList=new  ArrayList<Integer>(list);
newList.add(candidates[i]);
recursive(newList,newTarget,i,candidates,result);
}		
}	
} 
} 
