package ArrayList;

import java.util.ArrayList;

public class MostWater{
    // Brute force approach 
    // find the all possible pair and calculate the area of container

    // static int storeWater(ArrayList<Integer> height){
    //     int maxWater=0;
    //     for(int i=0; i<height.size(); i++){   // for line 1
    //         for(int j=i+1; j<height.size(); j++){ /// for line 2      // T.C= O(n^2)
    //             int ht=Math.min(height.get(i), height.get(j));
    //             int width= j-i;
    //             int currWater=ht*width;
    //             maxWater=Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }

    // optimal solution
      // using two pointer approach
       public static int storeWater(ArrayList<Integer>height){
        // calculate the height and width
        // create two pointer
        int lp=0; 
        int rp=height.size()-1;
        int maxWater=0;
        while (lp<rp) {
            // height
             int ht=Math.min(height.get(lp), height.get(rp));
             //width
             int width=rp-lp;
             // current water
             int currWAter=ht*width;
             maxWater=Math.max(currWAter, maxWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
       }

    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));

    }
}