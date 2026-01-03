package Greedy_Algorithm;
import java.util.*;

/*  min absolute difference pair
given that two array A and B equal length pair each element A to B such that sum of 
absolute difference of all pairs minimum
absolute difference --> |a-b|
then we have to find the sum of absolute difference
Approach
    1. sort the array because the differece of close element is minimum 
    2.itrate from start to end and claculate the absolute difference sum 

 */
public class Min_Absolute_difference {
    public static void main(String[] args) {
        int A[]={1,2,3,4};
        int B[]={2,3,4,5};
        // sort 
        Arrays.sort(A);
        Arrays.sort(B);
        int minSum=0;
        for(int i=0; i<A.length; i++){
            minSum +=Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum absolute sum :"+minSum);
    }
}
