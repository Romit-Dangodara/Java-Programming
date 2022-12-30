// RANDOM GAME
// WRITE A PROGRAM TO GENERATE RANDOM NUMBER BETWEEN 1 TO 10 AND PRINT THE OUTPUT. TERMINATE WHEN YOU GET 9 AND PRINT 'EVEN NUMBER' WHEN YOU GET THE SO BY REPLACING EVEN NUMBER.

import java.util.Scanner;

public class M5_Loopss_RandomGame {

    public static void main(String[] args)
    {
        while(true)
        {
            int yy = (int) (Math.random() * 10) + 1; 
            System.out.println(yy);
            
            // OPTION OF BREAK

            if (yy == 9)
            {break;}
            
            // OPTION OF CONTINUE
            
            if (yy % 2 == 0 )
            continue;
            {
                System.out.println("Even Number");
            }
        } 

    }
 
}
