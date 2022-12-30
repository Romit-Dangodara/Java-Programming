//  LARGEST OF N NUMBERS
// GIVEN TE NUMBER N, i.e., THE SIZE OF INPUT FOLLOWED BY N MORE INTEGERS, FIND THE LARGEST OF THESE N NUMBERS

import java.util.Random;
import java.util.Scanner;

public class M5_Loopss_LargestOfNnumbers {
    public static void main (String[] args) {

    Scanner abd = new Scanner(System.in);
    System.out.print("Enter the Value of Integer N: ");
    int N = abd.nextInt();
    int ans = Integer.MIN_VALUE;
        for(int i = 1; i <=N; i++)
    {
        int X = abd.nextInt();
        ans = Math.max(X,ans);
    }
    System.out.print("Maximum Number is " + ans);
    }
}
