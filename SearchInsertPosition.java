public class Solution {

//最简单的一种想法,时间复杂度O(n)
public int searchInsert(int[] A, int target)
{	
for(int i = A.length-1;i>=0;i--){
if(target>A[i]){
return i+1; 	
}else if(target==A[i]){
return i; 
} 
}
return 0; 
}
//分冶法，时间复杂度有点降低
public static  int searchInsert(int[] A, int target)
{

return search(A, 0, A.length-1, 7);
	
}
public static int  search(int[] A,int  start,int end,int  target)
{
if(start>end){	
return start;
}
int  middle=(start+end)/2;
if(A[middle]==target)  return middle;
if (A[middle]<target){
	
   return search(A, middle+1, end, target); 		
}else{
	
 return  search(A, start, middle-1, target);	
}

}

public static void main(String[] args)
{
//未能向测试用例，时间不多
}
}
