package Array;

public class TotalPair {
    public static void totalPair(int arr[]){
        int tp=0;
        for(int i=0; i<arr.length; i++){

            int current=arr[i];  
             for(int j=i+1;j<arr.length; j++){
                System.out.print("("+current+","+arr[j]+") ");
                tp++;
            }
            System.out.println();
            current++;
            
        }
        System.out.println("total numbers of pairs "+tp);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        totalPair(arr);
    }
}
