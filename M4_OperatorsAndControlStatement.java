// MODULE 4: OPERATORS AND CONTROL STATEMENTS

import java.util.Scanner;

public class M4_OperatorsAndControlStatement {
    public static void main (String[] args)
    {
 
    //ARITHMATIC OPERATOR
    
    double a = 5.2;
    double b = 5.1;
    
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
    
    //RELATIONAL OPERATORS
    
    System.out.println(a == b);
    System.out.println(a != b);
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a >= b);
    System.out.println(a <= b);    
    
    //ASSIGNMENT (=) VS EQUALITY (==) OPERATOR

    double x = 10;
    x = a;
    System.out.println(x);
    System.out.println(x == a);
    System.out.println(x == b);

    //IF-ELSE 
    // Write Condition and it should return boolean value
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value of y: ");
    float y = scan.nextFloat()    ;
    if (y>0)
    {System.out.println("Positive Number");}
    else if (y<0)
    {System.out.println("Negative Number");}
    else 
    {System.out.println("Value is Zero");}
    
    //SWITCH CASE
    String Weather =  "Rainy" ;
    switch (Weather)
    {
        case "Rainy":
        System.out.println("Take an Umbrella");
        break;
        case "Sunny":
        System.out.println("Wear Sunglasses ");
        break;
        default:
        System.out.println("Check Weather Forecast");
    }

    //TERNARY OPERATOR : IT IS CONDENSED FORM OF IF-ELSE STATEMENT
        Scanner abb = new Scanner(System.in);
        System.out.println("Enter the Value of Integer N: ");
        int N = abb.nextInt();
    //Using Ternary Operator    
        String answer = N % 2 == 0 ? "Even" : "Odd" ;
        System.out.println("N = " + N + " is " + answer);

    
    //LOGICAL OPERATORS : USED TO MAKE DECISIONS IN CODITION
    // 3 TYPES : 1. AND, 2. OR, 3. NOT
    // & AND, && SHORT CIRCUIT AND, | OR, || SHORT CIRCUIT OR, ! NOT
    
    // EXAMPLE OF AND OPERATOR
    int age = 20;
    String country = "India";
    String Answer = (age >= 21 && country == "India") ? "Person can vote" : "Person cann't vote";
    System.out.println(Answer);

    //EXAMPLE OF OR OPERATOR
    String degree = "BCom";
    String Answer2 = (degree == "BCA" || degree == "BTech") ? "Shortlisted" : "Not Shortlised";
    System.out.println("Students with '" + degree  + "' degree are " + Answer2);

    // EXAMPLE OF NOT OPERATOR
    boolean attendence = false;
    int midmark = 35;
    String Answer3 = (!attendence || midmark<=35) ? "Not Qualified" : "Qualified" ;
    System.out.print(Answer3);
    }
}
