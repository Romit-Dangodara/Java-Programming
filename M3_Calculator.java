//SIMPLE INTEREST CALCULATOR

import java.util.Scanner;

public class M3_Calculator {
    public static void main(String[] args)
    {
        Scanner abc = new Scanner(System.in);

        System.out.println("Enter the Principal Amount");
        float P = abc.nextFloat();
        System.out.println("Enter the % of Rate of Interest");
        float R = abc.nextFloat();
        System.out.println("Enter Time Period in Year");
        float N = abc.nextFloat();
        float I;

        I = P * R * N / 100;

        System.out.println("Interest Amount is " + I);

    }

}

