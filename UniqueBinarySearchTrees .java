public class Solution{

public  static  void  main(String[]    args)
{
//省略了一些测试用例
}

//典型的卡特兰数的应用
public static int numTrees(int n)
{
ArrayList<Integer> list=new  ArrayList<>();
list.add(1);
list.add(1);
for(int i=2;i<=n;i++){
int sum=0; 
for(int j = 1; j <=i; j++){
sum+=list.get(j-1)*list.get(i-j);	
}
list.add(sum);  
}
return  list.get(n);   
}
}
