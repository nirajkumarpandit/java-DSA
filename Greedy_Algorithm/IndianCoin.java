package Greedy_Algorithm;
import java.util.*;

/*
The problem is indian coins we are given indian coins and notes we have to find the minimum number
of coins/notes to make change for the given value
money[]={1,2,5,10,20,50,100,500,2000}
eg:-v=590 --> 500+50+20+20
Approach
        1.sort the money in reverse order because we have to find the min change of value. the large
            money can easyly give and then rest money in the form of coin
        2. check money[i]<val the give money[i] 
 */
public class IndianCoin {
    public static void main(String[] args) {
        Integer money[]={1,2,5,10,20,50,100,500,2000};
        int val=590;
        int cout=0;
        // sort
        Arrays.sort(money,Comparator.reverseOrder());
        for(int i=0; i<money.length; i++){
            if(money[i]<=val){
                while(money[i]<=val){
                    cout++;
                    val -=money[i];
                }
            }
        }
        System.out.print("the minimum number of change : "+cout);
        
    }
}
