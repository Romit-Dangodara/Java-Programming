// ARRAY EXERCISE
// 1. Given an integer N, generate & print an array containing squares of all numbers from 1 to N. 
// 2. Read two arrays from the user and generate a third array containing all the common elements from the first two.
// 3. Given an array, find the maximum and the minimum elements in it.
// 4. Given an array, generate a new array that is reverse of it.

import java.util.Scanner;
public class M6_Array_Square {
    public static void main(String[] args){
        Scanner IP = new Scanner(System.in);
        System.out.println("Enter the Value of Array Length: ");
        int N = IP.nextInt();
        int[] kk = new int[N];
            for(int i=0;i<N;i++){
                kk[i] = i + 1;
                System.out.println("kk[" + i + "]: " + kk[i]);
                System.out.println("Square of kk[" + i + "] = " + kk[i] + " is " + (kk[i] * kk[i]) );
                System.out.println("Cube of kk[" + i + "] = " + kk[i] + " is " + (kk[i] * kk[i] * kk[i]) );
            }
        // FOR SQUARE AND CUBE OF USER DEFINED ARRAY        
        // for(int i=0;i<N;i++){
        //     System.out.println("Enter the Value of kk[" + i + "]: ");
        //     kk[i] = IP.nextInt();
        //     }
        // for(int i=0;i<N;i++){
        //     System.out.println("Square of kk[" + i + "] = " + kk[i] + " is " + (kk[i] * kk[i]) );
        //     System.out.println("Cube of kk[" + i + "] = " + kk[i] + " is " + (kk[i] * kk[i] * kk[i]) );
        //     }
    }
}
