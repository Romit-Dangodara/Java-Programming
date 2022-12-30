// SUM OF TWO MATRICES
// Given two matrices of same size, print their
import java.util.Scanner;
public class M9_MDArrays_Sumof2Matrix {
public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int row = SC.nextInt();
    System.out.println("Enter the number of columns: ");
    int col = SC.nextInt();
    System.out.println("Enter the elements of Matrix M1: ");
    int[][] M1 = new int [row][col];
    CreateMatrix(M1);
    System.out.println("Enter the elements of Matrix M2: ");
    int[][] M2 = new int [row][col];
    CreateMatrix(M2);
    int[][] M3 = new int [row][col];
    M3 = sum(M1, M2);
    System.out.println("Matrix M1");
    display(M1);
    System.out.println("Matrix M2");
    display(M2);
    System.out.println("Sum [Matrix M3] = Matrix M1 + Matrix M2");
    display(M3);

}

static int[][] CreateMatrix(int[][] Matrix){
    Scanner SC = new Scanner(System.in);       
    for(int i= 0; i<Matrix.length; i++){
        for(int j=0; j<Matrix[i].length;j++){
            System.out.println("["+i+"]["+j+"]: ");
            Matrix[i][j] = SC.nextInt();
        }
    }
    return Matrix;
}

static int[][] sum(int[][] Matrix1,int[][] Matrix2){
    int[][] MatrixSum = new int [Matrix1.length][Matrix1[0].length];
    for(int i=0;i<Matrix1.length;i++){
        for(int j=0;j<Matrix1[i].length;j++){
            MatrixSum[i][j] = Matrix1[i][j] + Matrix2[i][j];
        }
    }
    return MatrixSum;
}

static void display(int[][] Matrix){
    for(int i= 0; i<Matrix.length; i++){
        for(int j=0; j<Matrix[i].length;j++){
            System.out.print(Matrix[i][j] + " ");
        }
        System.out.println();
    }
}
}