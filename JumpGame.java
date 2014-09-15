public class Solution{
public  static  void   main(String[]  args)
{

//省略了一些测试用例

}
public static  boolean canJump(int[] A) {
int canReach=0;
for(int i=0;i < A.length && i <= canReach;i++){
if(i+A[i] > canReach) canReach = i+A[i];
if(canReach >= A.length-1) return true;
}
return (canReach >= A.length-1);
}
}
