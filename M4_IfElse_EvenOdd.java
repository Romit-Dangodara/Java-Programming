import java.util.Scanner;
public class M4_IfElse_EvenOdd {
    public static void main (String[] args)
{
    Scanner abb = new Scanner(System.in);
    System.out.println("Enter the Value of Integer N: ");
    int N = abb.nextInt();

//Using if-Else Condition    
    // if (N%2 == 0)
    // {System.out.println("N = " + N + " is Even");}
    // else
    // {System.out.println("N = " + N + " is odd");}

//Using Ternary Operator    
    String answer = N % 2 == 0 ? "Even" : "Odd" ;
    System.out.println("N = " + N + " is " + answer);
}    
}
