package Greedy_Algorithm;
import java.util.*;
/*      The fractional knapsack problem 
    given the weight and value n items put these items in knapsack of capicity w to get mixmum total value in the knapsack
Approach 
    value large and weight less
    1. find the ratio :value/weight because when increase value the ratio also increase 
            and sort the ratio in decreasing order
    2. choice the large ratio first in put into the knapsack and decrease the weight


*/
public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        double ratio[][]=new double[val.length][2];
        //0th col store the original idx // 1th col store ratio
    
        for(int i=0;i<val.length; i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        // sort
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int finalVal=0;
        int capicity=50;
        for(int i=ratio.length-1; i>=0;i--){
            int idx =(int)ratio[i][0];
            if(capicity>=weight[idx]){// include full item
                finalVal +=val[idx];
                capicity -=weight[idx];
            }else{ // include fractional item
                finalVal +=(ratio[i][1]*capicity);
                capicity=0;
                break;
            }
        }
        System.out.println("the max value : "+finalVal);
        
    }
}
