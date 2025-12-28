package Greedy_Algorithm;
import java.util.*;
public class Sorting_Activity_Selection {
    public static void main(String[] args) {
        // end time sorted nahi hai 
        int start[]={0,1,3,5,5,8};
        int end [] ={6,2,4,7,9,9}; 

        // sorting
        //create a 2D array 
        int activitees [][]=new int[start.length][3]; // 3 colum and many rows 
        //1 col store --> index , 2col store--> start , 3rd store --> end
        for(int i=0; i<start.length; i++){
            activitees[i][0]=i;
            activitees[i][1]=start[i];
            activitees[i][2]=end[i];
        }
        Arrays.sort(activitees, Comparator.comparingDouble(o -> o[2])); // o[2] --> colum 2 ke basis per sorting
        //Comparator.comparingDouble(o -> o[2]) --> lembda function for sorting 2D array
        
        // create ArrayList for storring activity
        ArrayList <Integer> ans =new ArrayList<>();
        int maxAct =1;
        ans.add(activitees[0][0]);
        int lastEnd =activitees[0][2];
        for(int i=1; i< end.length; i++){
            if(activitees[i][1] >= lastEnd){
                maxAct++;
                ans.add(activitees[i][0]);
                lastEnd =activitees[i][2];
            }
        }
        // printing
        System.out.println("Maximum Activity perform : "+maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+i+" ");
        }
    }
}
