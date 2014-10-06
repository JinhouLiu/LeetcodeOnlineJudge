import java.util.ArrayList;
import java.util.List;
public class  Solution
{
public  static  void  main(String[]  args)
{
Interval   interval1=new   Interval(1, 3);
Interval   interval2=new   Interval(0, 1);
Interval   interval3=new   Interval(8, 10);
Interval   interval4=new   Interval(15, 18);
List<Interval> list=new ArrayList<>();
list.add(interval1);
list.add(interval2);
list.add(interval3);
list.add(interval4);
list=merge(list);
for (int i = 0; i <list.size();i++)
{
System.out.println(list.get(i).start+"\t"+list.get(i).end);		
}
}  

//版本一　　当数据大时直接超时
public static List<Interval> merge(List<Interval> intervals)
{	
List<Interval> list=new ArrayList<Interval>();
if(intervals==null||intervals.size()==0)
{	
return list;
}
for(int i=1;i<intervals.size();i++)
{
Interval key=intervals.get(i);
int j=i-1;
//基于快速排序分区的思想,按区间头从小到大排序
while(j>-1&&intervals.get(j).compareTo(key)==1)
{
intervals.set(j+1, intervals.get(j));
j--;
}
intervals.set(j+1,key);
}
Interval temp=intervals.get(0); 
for(int i=1;i<intervals.size();i++)
{
if(temp.end>=intervals.get(i).start)
{
temp.end=Math.max(temp.end,intervals.get(i).end);	
}
else
{	
list.add(temp);	
temp=intervals.get(i);
}	
}
list.add(temp);
return list; 
}	
}
class Interval  implements Comparable<Interval>  
{
          int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
		@Override
		 public int compareTo(Interval o) {
		   
           if(this.start>o.start)
           {
        	 return 1;    
           }
           else {
			
        	return  0;
		}
	 }
}

//版本２　通过在线测试
public static List<Interval> sortInterval(List<Interval> list){
Collections.sort(list,new Comparator<Interval>(){
@Override
public int compare(Interval o1, Interval o2){
if (o1.start>o2.start) {
return 1;
}else if (o1.start==o2.start){
return 0;
}else {
return -1;
}
}
});
return   list;
}
public static List<Interval> merge(List<Interval> intervals)
{	
List<Interval> list=new ArrayList<Interval>();
if(intervals==null||intervals.size()<2)
{	
return intervals; 	
}
intervals=sortInterval(intervals);
Interval temp=intervals.get(0); 
for(int i=1;i<intervals.size();i++)
{
if(temp.end>=intervals.get(i).start)
{
temp.end=Math.max(temp.end,intervals.get(i).end);	
}
else
{	
list.add(temp);	
temp=intervals.get(i);
}	
}
list.add(temp);
return list; 
}	
}
class Interval 
{
int start;
int end;
Interval() { start = 0; end = 0; }
Interval(int s, int e) { start = s; end = e; }

}
