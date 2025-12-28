package Greedy_Algorithm;
import java.util.*;
public class Activity_Selection {
    public static void main(String[] args) {
        int start[] ={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9}; // sorted diya hai
        int maxAct=0;
        // create ArrayList for store the Activity 
        ArrayList<Integer> ans= new ArrayList<>();
        // pick first activity because ye sabse pahle complete hoga q ki end time ke sorted hai 
        maxAct =1;
        ans.add(0); // add first activity in arrayList 
        int lastEnd =end[0];// first activity ka ending time store
        for(int i=1; i<end.length; i++){
            if(start[i]>=lastEnd){ // agar starting time first ke end time ke = ya lagreho to
                // select activity
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        // print the activity
        System.out.println("The maximum activity : "+ maxAct );
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+i+" ");
        }
    }
}
