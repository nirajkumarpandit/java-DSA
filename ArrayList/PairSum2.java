package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSum(ArrayList<Integer>list, int target){
        // find the breaking point 
        int bp=-1; 
        int n=list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){ // this condition oppose the sorted list
                bp=i;                       // the this point is the breaking point
                break;
            }
        }
        int lp=bp+1; // smallest element 
        int rp=bp;// largest element
        while (lp !=rp) {
            // case 1
            if(list.get(rp)+list.get(lp)== target){
                return true;
            }
            // case 2
            if(list.get(rp)+list.get(lp) < target) {
                lp=(lp+1)%n;  // for rotation because lp always move largest element
            }else{
                // case 3
                rp=(n+rp-1)%n;// rp move smallest element
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum(list, 16));
    }
}
