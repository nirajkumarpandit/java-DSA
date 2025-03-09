package Array;
import java.util.*;
public class Matrix {
    // linear search 
    public static void linearSearch(int matrix[][],int target){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if (matrix[i][j]==target) {
                    System.out.print("the element at index : ("+i+","+j+")");
                }else{
                   
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][4];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int target=6;
        linearSearch(matrix,target);
        sc.close();
    }
}
