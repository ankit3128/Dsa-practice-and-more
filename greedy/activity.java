
import java.util.*;

public class activity {
    public static void main(String[] args){
        int start[] ={1,3,0,5,8,5};
        int end [] ={2,4,6,7,9,9};

        //sorting
        int activities [][] =new int [start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1] =start[i];
            activities[i][2]= end[i];

        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        
       


        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
         
        



        // 1 activity 
        maxAct=1;
        ans.add(activities[0][0]);
        int LastEnd =activities[0][2];
         for(int i=1;i<end.length;i++){
            if(activities[i][1]>=LastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                LastEnd =activities[i][2];

            }
         }
         System.out.println("max activities ="+maxAct);
         for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i)+" ");
         }
         System.out.println();
    }
}

/*import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Step 1: Sort by end time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        // Step 2: Greedily select intervals
        int count = 1; // first interval is always taken
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= lastEnd) {
                // non-overlapping → keep it
                count++;
                lastEnd = intervals[i][1];
            }
        }

        // Step 3: Min removals = total - kept
        return intervals.length - count;
    }
}
*/ 