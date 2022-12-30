// ARRAY EXERCISE
// 3. Given an array, find the maximum and the minimum elements in it.
import java.util.Scanner;
public class M6_Array_MinMax {
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
    
    // Find Minimum and Maximum
    int maxx = A1[0];
    int minn = A1[0];
    for(int p= 0; p < A1.length; p++){
        for(int q= 0; q < A1.length; q++){
            if((A1[p]>=A1[q]) && (A1[p]>=maxx)){
                maxx =  A1[p];
            }
            else if((A1[p]<=A1[q]) && (A1[p]<=minn)){
                minn =  A1[p];
            } 
        }
    }
    System.out.println("Maximum Number: " + maxx);
    System.out.println("Minimum Number: " + minn);
}    
}
