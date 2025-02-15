package Array;
public class Subarray {
  public static void main(String[] args) {
    int arr[]={2,3,4,5,6};
    int total=0;
    for(int i=0; i<arr.length;i++){
        int start=i;
        for(int j=i; j<arr.length; j++){
            int end=j;
            for(int k=start; k<=end;k++){
                System.out.print(arr[k]);
            }
            total++;
            System.out.println(" ");
        }
    }
    System.out.println("the total Subarray :"+total);
  }
}
