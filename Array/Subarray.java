package Array;
public class Subarray { 
  public static void main(String[] args) {
    int arr[]={2,3,4,5,6};
    int total=0;
    for(int i=0; i<arr.length;i++){
        for(int j=i; j<arr.length; j++){
            for(int k=i; k<=j;k++){
                System.out.print(arr[k]);
            }
            total++;
            System.out.println(" ");
        }
    }
    System.out.println("the total Subarray :"+total);
  }
}
