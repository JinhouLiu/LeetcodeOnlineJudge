import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution{
	
public static void main(String[]  args)
{
int[]   num={10,1,2,7,6,1,5};    
List<List<Integer>> result=combinationSum2(num, 7);
for (int i = 0; i < result.size(); i++) {
	
	for (int j = 0; j < result.get(i).size(); j++) {
		
		System.out.print(result.get(i).get(j)+"\t");
	}
	
	System.out.println();
}
	
}
public  static List<List<Integer>> combinationSum2(int[] num, int target) {
    if(num.length==0) return new ArrayList<List<Integer>>();
    Arrays.sort(num); //sort the array of num so it's easier to manage
    List<List<Integer>> result = helper(num,target,0);
    if(result==null) return new ArrayList<List<Integer>>();
    return result;
}

public  static  List<List<Integer>>   helper(int[]  num,int  target,int index)
{	
List<List<Integer>> result=new ArrayList<>();      	
List<Integer> temp=new ArrayList<>(); 
Set<List<Integer>>  set=new  HashSet<>();
for(int i = index; i < num.length; i++) {
 temp=new   ArrayList<>();
if(num[index]>target) break;		

if(num[i]==target)
{	
temp.add(num[i]);
result.add(temp);
return result; 
}

List<List<Integer>> t=helper(num, target-num[i], i+1);
if(t!=null)
{
    for(List<Integer> a:t)
    {
        a.add(0,num[i]);
        if(!set.contains(a)) //make sure there is no duplicates
        {
            set.add(a);
            result.add(a);
        }
    }
}
}
return  result; 
}

}
