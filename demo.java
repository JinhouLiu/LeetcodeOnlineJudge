import java.util.ArrayList;
import java.util.List;
public class  Solution{
public static List<Interval> merge(List<Interval> intervals)
{	
List<Interval> list=new ArrayList<Interval>();
if(intervals==null||intervals.size()==0)
{
	
return list;

}
quicksort(intervals, 0,intervals.size()-1);
/*
//快速排序，超过时间限制
for(int i=1;i<intervals.size();i++)
{
Interval key=intervals.get(i);
int j=i-1;  
while(j>-1&&intervals.get(j).compareTo(key)==1)
{
intervals.set(j+1, intervals.get(j));
j--;
}
intervals.set(j+1,key);
}
*/
Interval temp=intervals.get(0); 
for(int i=1;i<intervals.size();i++)
{
if(temp.end>=intervals.get(i).start)
{
temp.end=Math.max(temp.end, intervals.get(i).end);	
}
else{	
list.add(temp);	
temp=intervals.get(i);
}	
}
list.add(temp);
return list; 
}
public  static void quicksort(List<Interval>  list, int left, int right) {
int dp;
if(left < right){
        dp=partition(list, left, right);
        quicksort(list, left, dp - 1);
        quicksort(list, dp + 1, right);
}
}

public static int partition(List<Interval> list,int left,int right)
{	
Interval x =list.get(right);
int i=left-1;
for (int j =left;j<right;j++)
{
if(list.get(j).compareTo(x)==0)
{
 i=i+1; 
 Interval  temp=list.get(i);
 list.set(i, list.get(j));
 list.set(j, temp);    
}
Interval temp=list.get(i+1);
list.set(i+1, list.get(right));
list.set(right, temp);	
}
return i+1;
}

public  static  void  main(String[]  args)
{
Interval n1=new Interval(4, 5);
Interval n2=new Interval(1, 4);
Interval n3=new Interval(0, 1);
Interval n4=new Interval(15, 18);
List<Interval>   list=new  ArrayList<>();
list.add(n1);
list.add(n2);
list.add(n3);
List<Interval>   list2=merge(list);
for (int i = 0;i<list2.size();i++)
{
System.out.print(list.get(i).start+"\t"+list.get(i).end);	
}
}   
}

class Interval  implements Comparable<Interval>  
{
int start;
int end;
Interval() { start = 0; end = 0; }
Interval(int s, int e) { start = s; end = e; }
@Override
public int compareTo(Interval o)
{		   
if(this.start>o.start)
{
return 1;    
}
else
{			
return  0;
}
}
}
