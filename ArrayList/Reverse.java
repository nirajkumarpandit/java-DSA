package ArrayList;
import java.util.ArrayList;
public class Reverse {
    // print the ArrayList 
    public static void print(ArrayList<Integer>list){
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }

    // reverse the ArrayList
    public static void reverse(ArrayList<Integer>list){
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }

    // swap two numbers
     public static void swap(ArrayList<Integer>list, int idex1, int idex2){
        int temp=list.get(idex1);
        list.set(idex1, list.get(idex2));
        list.set(idex2, temp);
     }
     // maximum number in ArrayList 
     public static int maxArrayList(ArrayList<Integer>list){
        int largest=list.get(0);
        for(int i=0; i<list.size(); i++){
           largest= Math.max(largest, list.get(i));
        }
        return largest;
     }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(13);
        list.add(4);
        list.add( 5);
        list.add(6);
        // reverse(list);
        int idex1=1;int idex2=3;
        swap(list, idex1, idex2);
        System.out.print(list);
        // System.out.println(maxArrayList(list));
    }
}
