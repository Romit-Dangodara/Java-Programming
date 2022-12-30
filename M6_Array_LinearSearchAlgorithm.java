// ARRAY
// LINEAR SEARCH ALGORITHM
// Given an array and a key value as input, find the index of the key in the array. Return -1 if it is not present.

import java.util.Scanner;
public class M6_Array_LinearSearchAlgorithm {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Length of Array: ");
        int z = ip.nextInt();
        int[] newarr = new int[z];
        for (int i = 0; i<newarr.length;i++){
            System.out.println("Enter value of array newarr[" + i + "]: ");
            newarr[i] = ip.nextInt();
        }
        System.out.println("Enter any value that you want to search in the array: ");
        int N = ip.nextInt();
        int Ans = -1;
        for(int j=0;j<newarr.length;j++){
            if(newarr[j]==N){
                Ans = j;
                System.out.println( N + " IS ON INDEX NUMBER " + Ans + " IN OUR ARRAY.");
                // break; // IF BREAK IS NOT USED IT WILL RETURN ALL INDICES WITH PERTICULAR VALUE
            }            
        }
        System.out.println(Ans);
    }
}