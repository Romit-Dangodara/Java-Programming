// MODULE 9 Multidimensional Arrays
import java.util.Scanner;
public class M9_MDArrays {
public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int row = SC.nextInt();
    System.out.println("Enter the number of columns: ");
    int col = SC.nextInt();
    int[][] D2Array2 = new int[row][col];
    for(int i= 0; i<D2Array2.length; i++){
        for(int j = 0; j< D2Array2[i].length; j++){
            System.out.println( "D2Array2["+i+"][" + j +"]: ");
            D2Array2[i][j] = SC.nextInt();
        }
    }
    System.out.println("Matrix D2Array2:");
    for(int i= 0; i<D2Array2.length; i++){
        for(int j = 0; j< D2Array2[i].length; j++){

            System.out.print(D2Array2[i][j] + " ");
        }
        System.out.println();
    }
}    
}
