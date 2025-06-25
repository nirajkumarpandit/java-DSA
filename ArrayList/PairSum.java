package ArrayList;

import java.util.ArrayList;

public class PairSum {
    // brute force approach 
    // find the all possible pair and check the sum exit or not

    // public static boolean pairSum1(ArrayList<Integer>list, int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){                           // time complexity= O(n^2)
    //             // check sum are equal to target or not 
    //             if(list.get(i)+list.get(j)== target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }


    // optimal approach 
    // use two pointer approach 
    public static boolean pairSum1(ArrayList<Integer>list, int target){
        int start=0; int end=list.size()-1;
        while ((start<end)) {
            // case 1 check sum equla or not
            if(list.get(start)+list.get(end)== target){
                return true;
            }
            // case 2
            if(list.get(start)+list.get(end) < target){
                start++;
            }else{
                end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum1(list, 5));

    }
}
