// Question: You are given a matrix A, you have to return another matrix which is the transpose of A.
// NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row. The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index, and the element at (j, i)th index to (i, j)th index.
import java.util.Scanner;
public class M9_MDArrays_MatrixTranspose {
public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter Number of Rows: ");
    int row = SC.nextInt();
    System.out.println("Enter Number of Columns: ");
    int col = SC.nextInt();
    int[][] M1 = new int[row][col];
    for(int i = 0;i<M1.length;i++){
        for(int j=0;j<M1[i].length;j++){
            System.out.println("M1["+i+"]["+j+"]: ");
            M1[i][j] = SC.nextInt();
        }
    }    
    System.out.println("Matrix M1: ");    
    for(int i= 0; i<M1.length; i++){
        for(int j=0; j<M1[i].length;j++){
            System.out.print(M1[i][j] + " ");}
        System.out.println();
    }
    int[][] M2 = new int[col][row];
    M2 = transpose(M1);
    System.out.println("Matrix M1 Transpose = Matrix M2: ");
    for(int i= 0; i<M2.length; i++){
        for(int j=0; j<M2[i].length;j++){
            System.out.print(M2[i][j] + " ");}
        System.out.println();
    }
}

static int[][] transpose(int[][] Mat){
    int TrCol = Mat.length;
    int TrRow = Mat[0].length;
    int[][] TrMat = new int[TrRow][TrCol];
    for(int i=0;i<TrRow;i++){
        for(int j=0;j<TrCol;j++){
            TrMat[i][j] = Mat[j][i];
            }
    }    
    return TrMat;
}
}
