package Array.twoDArray;

public class Matrix {
    static int diagonalSum(int matrix[][]){
        int sum=0; 
        // this is the brute force approach 
        // first the diagonal element lie when i==j in primary diagonal 
        // the secondary diagonal i+j matrix ke length ke equal hota hai

        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix.length; j++){
        //         // primary diagnal 
        //         if(i==j){
        //             sum +=matrix[i][j];                  the time complexity = O(n^2)
        //         }
        //         else if(i+j== matrix.length-1){
        //             sum +=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;


        // Optimal solution 
        for(int i=0; i<matrix.length; i++){
            // primary diagonal 
            sum +=matrix[i][i];   // the i and j are equal in primary diagonal matrix
            // secondary diagonal
            if(i !=matrix.length-i-1){                   // if the matrix is  odd like 3*3 then 
                sum +=matrix[i][matrix.length-i-1];// the midle element calculate two times
            }                                   // i+j=n-1
                                                // j=n-i-1== matrix.lenght-i-1
        }
        return sum;
        
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(matrix));;

    }
}
