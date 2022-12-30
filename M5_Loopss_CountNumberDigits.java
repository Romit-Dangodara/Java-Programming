        // COUNT DIGITS OF NUMBER

import java.util.Scanner;

public class M5_Loopss_CountNumberDigits {
    public static void main (String[] args) {
        Scanner abd = new Scanner(System.in);
        System.out.print("Enter the Integer N: ");
        int N = abd.nextInt();
        int OriginalN = N;
        int Count =0;
        for(N=N;N>0;N = N/10)
        {Count = Count + 1;}
        System.out.println("Number of digits in integer " + OriginalN + " are " + Count );
    }    
}
