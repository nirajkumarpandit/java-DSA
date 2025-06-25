package ArrayList;

import java.util.ArrayList;
public class A {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();;

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(9);
        list1.add(0);list1.add(3);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(8);
        list2.add(6);
        mainList.add(list2);
        mainList.add(list1);
        System.out.println(mainList);
        for(int i=0; i<mainList.size(); i++){ 
            ArrayList<Integer>currList=mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
