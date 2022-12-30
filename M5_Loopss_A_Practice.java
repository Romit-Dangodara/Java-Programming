import java.util.Random;
import java.util.Scanner;

public class M5_Loopss_A_Practice {
    public static void main (String[] args) {
    
    // FOR LOOP - NUMBER OF INTERATIONS ARE KNOWN BEFORE THE EXECUTION
    // FOR(INITIALISATION;CONDITION; UPDATE)
    
    // PRINT NUMBERS FROM 1 TO 10
    // for(int i=1;i<=10;i++)
    // {System.out.println(+ i);}
    
    // WHILE LOOP
    // PRINT NUMBERS FROM 1 TO 10
/*  int i=1;
    while(i<=15){
    System.out.println(i);
    i++;
    }
*/

// RUN BELOW 3 VARIABLES TO SEE DIFFERENCE BETWEEN WHILE AND DO-WHILE
/*  int i = 5;
    while (i>0)
    {System.out.println(i);
    i= i-1;
    }
    do
    {
        System.out.println(i);
        i= i-1;
    }    while(i>0);
*/

    // BREAK STATEMENT
    // PRINT NUMBERS FROM 1 TO 10
    int i=1;
    while(i<=15){
        if(i> 6){
            System.out.println("Breaking out of the loop.");
            break;}
    System.out.println(i);
    i++;
    }
    }
    
}
