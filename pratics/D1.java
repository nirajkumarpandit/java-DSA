package pratics;

import java.util.Scanner;

public class D1 {
    // Array user input and output code

    public static int basic(int arr[][], int row, int col){
        Scanner sc = new Scanner(System.in);
        // input ke liye
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("the the array is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row of array :");
        int row = sc.nextInt();
        System.out.println("Enter the col of array :");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];;
        
        basic(arr, row, col);
    }
}
