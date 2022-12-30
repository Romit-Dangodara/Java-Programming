// Row & Column Sums
import java.util.Scanner;
public class M9_MDArrays_RowColumnSums {
public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter Number of Rows: ");
    int row = SC.nextInt();
    System.out.println("Enter Number of Columns: ");
    int col = SC.nextInt();
// Create Matrix
    int[][] M1 = new int[row][col];
    for(int i = 0;i<M1.length;i++){
        for(int j=0;j<M1[i].length;j++){
            System.out.println("M1["+i+"]["+j+"]: ");
            M1[i][j] = SC.nextInt();}
    }
// Display Matrix
    System.out.println("Matrix M1: ");    
    for(int i= 0; i<M1.length; i++){
        for(int j=0; j<M1[i].length;j++){
            System.out.print(M1[i][j] + " ");}
        System.out.println();
    }
// Summation
    System.out.println("Below given first " + row + " elements contain the sum of each " + row + " rows, and the next " + col + " elements contain the sum of each " + col + " columns.");
    Summation(M1);
}
static int[] Summation(int[][] Matrixx){
    int Row = Matrixx.length;
    int Col = Matrixx[0].length;
    int[] SumAll = new int[Row+Col];
    for(int i = 0; i<Row;i++){
        for (int j = 0; j < Col; j++) {
            SumAll[i] = SumAll[i] + Matrixx[i][j];
        }
        System.out.println("Sum of Row " + (i+1) + " elements = " + SumAll[i]);
    }
    for(int i = 0; i<Col;i++){
        for (int j = 0; j < Row; j++) {
            SumAll[i+Row] = SumAll[i+Row] + Matrixx[j][i];
        }
        System.out.println("Sum of Column " + (i+1) + " elements = " + SumAll[i+Row]);
    }
    return SumAll;
}
}