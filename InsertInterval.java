public class Solution{
public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> results = new ArrayList<Interval>();
        if (intervals==null||intervals.size()==0){
            results.add(newInterval);
            return results;
        }

        int start=0,end=0;

        for (Interval i:intervals){
            
            //两句话不能颠倒
            if (newInterval.start>i.end) start++;
            if (newInterval.end>=i.start) end++;
            else break;
        }

        if (start==end){
            results.addAll(intervals);
            results.add(start,newInterval);
            return results;
        }

        for (int i=0;i<start;i++)
            results.add(intervals.get(i));
        Interval interval=new Interval(Math.min(newInterval.start,intervals.get(start).start),Math.max(newInterval.end,intervals.get(end-1).end));
        results.add(interval);
        for (int i=end;i<intervals.size();i++)
            results.add(intervals.get(i));
        return results;
    }
}
