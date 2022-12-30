// ARRAY EXERCISE
// 4. Given an array, generate a new array that is reverse of it.
import java.util.Scanner;
public class M6_Array_ReverseArray {
public static void main(String[] args){
    Scanner IP = new Scanner(System.in);
    // USER DEFINED ARRAY A1        
    System.out.println("Enter the Value of Array Length A1: ");
    int M = IP.nextInt();
    int[] A1 = new int[M];
    for(int i=0;i<M;i++){
        System.out.println("Enter the Value of A1[" + i + "]: ");
        A1[i] = IP.nextInt();
        }
    // GENERATE REVERSE OF ARRAY
    int[] A2 = new int[M];
    int q = 0;
    for(int p= (A1.length - 1); p >= 0; p--){
            A2[q] = A1[p];
        System.out.println("A2[" + q + "] = A1[" + p + "] = " + A2[q]);
        q=q+1;
    }
}       
}