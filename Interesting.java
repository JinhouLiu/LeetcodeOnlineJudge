同样逻辑却会照成不同结果的代码：

for(Interval i:intervals)
{
if(i.start<=newInterval.end) end++;	
if(i.end<newInterval.start)  start++;	
else break;	
}

／／这是正确的代码
for(Interval i:intervals){
    if (newInterval.start>i.end) start++;
    if (newInterval.end>=i.start) end++;
    else break;
}
