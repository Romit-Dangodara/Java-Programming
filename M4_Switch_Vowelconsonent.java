// VOWEL OR CONSONENT
// FOR GIVEN A CHARACTER, STATE WHETHER IT IS VOWEL OR CONSONENT 
// SOLUTION : USE SWITCH CONDITION 
// WE WILL USE ENHANCED SWITCH CASE VERSION IN THIS CODE

import java.util.Scanner;
public class M4_Switch_Vowelconsonent {
    public static void main(String[] args) {
        Scanner annn = new Scanner(System.in);
        System.out.println("Enter any character");
        char C = annn.next().charAt(0);
            switch (C){
            // Write all cases in single case if you have same output or block of code to be executed. Refer below    
            case 'a','e','i','o','u' -> System.out.println("This character '" + C + "' is vovel");
            case 'A','E','I','O','U' -> System.out.println("This character '" + C + "' is vovel");
            default -> System.out.println("This character '" + C + "' is consonent");
        }
    }
    
}
