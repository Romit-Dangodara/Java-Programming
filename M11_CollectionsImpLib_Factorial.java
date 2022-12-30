// Given a number N, compute its factorial using BigInteger.

import java.math.BigInteger;
import java.util.Scanner;

public class M11_CollectionsImpLib_Factorial {
public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter the value of integer N: ");
    int N = SC.nextInt();
    BigInteger Factotial = new BigInteger("1");
    int Fact = 1;
    for (int i = 1; i <= N; i++) {
        BigInteger ii = new BigInteger(i +"");
        Factotial = Factotial.multiply(ii);
    }
    System.out.println("Factorial of " + N + " is : " + Factotial);
}    
}