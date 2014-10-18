import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class  Solution1
{
public static int maxPoints(Point[] points)
{	
int maxLine=0;
for(int i = 0;i<(points.length-maxLine);i++){
          int coincident=0;
          Map<Double,Integer> pointCount=new HashMap<Double, Integer>();  
             for(int j=i+1;j<points.length; j++) {
        	   Double slope; 
	           if(points[i].x==points[j].x&&points[i].y==points[j].y){
		       coincident++;
		       continue;
		    
	          }else if (points[i].x==points[j].x){
 	  	
   		       slope=Math.PI;   
		   
		   
	           }else   if (points[i].y==points[j].y){
		
	           slope=0.0;   	    
		   
	          }else {
		
		     slope=new  Double((double)(points[i].y-points[j].y)/(double)(points[i].x-points[j].x)); 
	         } 
	 
	   if (pointCount.containsKey(slope)) pointCount.put(slope, pointCount.get(slope)+1);		   
 	   else	pointCount.put(slope, 1);	   
		   
    	                  	
}
             maxLine=Math.max(maxLine, 1+coincident+maxValue(pointCount));
}
return maxLine;  
} 
private   static int maxValue(Map<Double, Integer> doubleIntMap) {
    int max = 0;
    Set<Double> keys = doubleIntMap.keySet();
    Iterator iter = keys.iterator();
    while (iter.hasNext())
        max = Math.max(max, doubleIntMap.get(iter.next()));
    return max;
}
public static void main(String[]  args)
{
//省略了一些测试用例
}   		
}
class Point
{
int x;
int y;
public Point(){}
public Point(int  x,int y)
{
this.x=x;
this.y=y;
} 
}
