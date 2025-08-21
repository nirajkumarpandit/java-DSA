package Array;

public class RemoveDuplicate{
    // remove duplicate in sorted array
    public static int remove(int arr[]) {
        // using two ponter approach
        // create a variable
        int i = 0;
        // iterate over the loop and check i==j
        
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i+1]=arr[j];  // place next unique element 
                i++;
            } 
        }
        return i+1; //The return value i+1 gives the count of unique elements.
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,2,2,3,3,3,4,47};
         int newArray=remove(arr);  // capture the new variable 
        for(int i=0; i<newArray; i++){
            System.out.print(arr[i]+" "); // print the unique element 
        }
    }
}
