import java.util.ArrayList;
import java.util.List;
public class Solution4{
	
public static ArrayList<Integer> getRow(int rowIndex)
{	
ArrayList<Integer> list=new ArrayList<>(rowIndex+1);
if(rowIndex>0){	
list.add(0,1);
}
for(int i=1;i<list.size();i++)
{	
list.add(i,list.get(i-1)*(rowIndex-i+1)/i);
}
System.out.println(list.size());
return list;
}  
public static void main(String[] args)
{	
List<Integer>  list=getRow(4);
for(int i = 0;i<list.size();i++){
System.out.println(list.get(i));		
}
} 
}
