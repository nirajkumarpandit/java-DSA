package Greedy_Algorithm;
import java.util.*;

// i have to find the maximum number of chain fromed 
//given that pair of numbers the first number is less than second number 
// the chain formed (a,b)(c,d) where b<c 
// this problem same as Activity problem 
//Approch 
//      i have to find non overlapping pair
    // 1. sort the array based on second number beause after select one pair we have to choice non overlapping pair
    //2. check if firstPairEnd < secondPairStart
public class Max_chainPair {
   public static void main(String[] args) {
    int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
    // sorted 
    Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));
    // select first pair
    int Max_chainPair=1;
    int chainEnd=pair[0][1];
    for(int i=1; i<pair.length; i++){
        if(pair[i][0]>=chainEnd){
            Max_chainPair++;
            chainEnd=pair[i][1];
        }
    }
    System.out.print("The maximum chain pair : "+Max_chainPair);
   } 
}
