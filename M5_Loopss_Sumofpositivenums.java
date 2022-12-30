// SUM OF POSITIVE NUMBERS
// GIVEN A STRWEAM OF NUMBERS, READ NUMBERS TILL YOU READ A NEGATIVE NUMBER AND PRINT THEIR SUM OF NUMBERS READ SO FAR 

import java.util.Scanner;

public class M5_Loopss_Sumofpositivenums {
    public static void main (String[] args){
        Scanner ip = new Scanner(System.in);
        int Sum = 0;
        int N;
        do{
            System.out.println("Enter the Input Variable: ");
            N = ip.nextInt();
            Sum = Sum + N;
        } while(N >= 0);
        System.out.println("Sum of input variables is " + Sum);
    }
}
