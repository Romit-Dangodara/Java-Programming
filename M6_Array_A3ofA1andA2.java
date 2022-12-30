// ARRAY EXERCISE
// 2. Read two arrays from the user and generate a third array containing all the common elements from the first two.

import java.util.Scanner;
public class M6_Array_A3ofA1andA2 {
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
// USER DEFINED ARRAY A2        
        System.out.println("Enter the Value of Array Length A2: ");
        int N = IP.nextInt();
        int[] A2 = new int[N];
        for(int j=0;j<N;j++){
            System.out.println("Enter the Value of A2[" + j + "]: ");
            A2[j] = IP.nextInt();
            }

    //FINDING NUMBER OF COMMON ELEMENTS
    int count = 0;
    for(int p=0;p<A2.length;p++){
        for(int q=0;q<A1.length;q++){
                if(A1[q]==A2[p]){
                count = count + 1;
                }
            }
        }
        System.out.println("Number of Common Elements in Array A1 & A2 = " + count); 
    

    // TO PRINT COMMON ELEMENTS AND CREARE THE ARRAY OF THESE COMMON ELEMENTS IN A3 ARRAY    
    int[] A3 = new int[count];
    int in = 0;
            for(int p=0;p<A2.length;p++){
                for(int q=0;q<A1.length;q++){
                        if(A1[q]==A2[p]){
                        A3[in] = A1[q];
                        System.out.println("A1[" + q + "] = A2[" + p + "] = A3[" + in + "] = "  + A3[in]);
                        in = in + 1;
                    }
                    }
                }


    }
}