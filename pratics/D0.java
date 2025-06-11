package pratics;

class D0 {
    // print the largest element in the array
    public static int largest(int arr[]){
        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        // second largest element
        int secLargest=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=max && arr[i]> secLargest ){
                secLargest=arr[i];
            }
        }
        return secLargest;
    }
    

    // optimal solution 
    public static int sLargest(int arr[]){
        int largest=arr[0]; int secLargest=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secLargest){
                secLargest=arr[i];
            }
        }
        return secLargest;
    }
    
    public static void main(String args[]) {
        int arr[]={20,30,4,50,100};
        System.out.println(sLargest(arr));
    }

}