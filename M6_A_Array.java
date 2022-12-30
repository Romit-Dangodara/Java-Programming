// MODULE 6 Arrays
// Java Array is Data Structure that stores data of same type in a sequential manner. An array takes a contiguous section of the memory.

import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

import javax.print.FlavorException;

public class M6_A_Array {
    public static void main(String[] args){

        int[] marks = {36, 39, 55, 99, 80};

        String[] fruits = {"Apple", "Banana", "Pineapple", "Mango", "Strawberry"};

        float[] GPA = new float[5];
        GPA[0] = 8;
        GPA[1] = 9;
        GPA[2] = 10;
        GPA[3] = 7;
        // GPA[4] = 6;

        System.out.println(marks[4]);
        System.out.println(marks[0]);
        System.out.println(fruits[4]);
        System.out.println(fruits[2]);
        System.out.println(GPA[4]);   // IF NOT DECLARED, IT RETURNS DEFAUL VALUE 0.0
        System.out.println(GPA[1]);
        System.out.println(GPA[0]);
        
        Scanner ip = new Scanner(System.in);
        int[] newarr = new int[5];
        for (int i = 0; i<newarr.length;i++)
        {
            System.out.println("newarr[" + i + "]: ");
            newarr[i] = ip.nextInt();
        }

        for(int j=0;j<newarr.length;j++)
        {
        System.out.println("newarr[" + j + "]: " + newarr[j]);
        }    

        // ENHANCED LOOP : FOR-EACH LOOP
    // CHECK WHEETHER THE GIVEN KEY VALUE IS PRESENT INSIDE MY ARRAY

    int[] arp = {5,10,15,20,25,30};
    System.out.println("Enter the number that you want to find in Array arp = {5,10,15,20,25,30}: ");
    int inp = ip.nextInt();
    boolean Check = false;
    for (int num: arp)
       {
        if (inp==num)
        {Check = true; 
        break; 
        }
       } 
    System.out.println(Check);
    }
}