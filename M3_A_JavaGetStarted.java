// MODULE 3 Getting Started with Java

import java.util.Scanner;

public class M3_A_JavaGetStarted {
    public static void main (String[] args)
    {
        char character = 'd';
        System.out.println(character);

        boolean check = true;
        System.out.println(check);

        System.out.println("8 Bits = 1 Byte");
        
        String any = "List of Public Holidays";
        System.out.println(any);
        System.out.println(any.charAt(0));
        System.out.println(any.charAt(1));
        System.out.println(any.charAt(2));
        String listofholidays = """
            Makar Sankranti	2023-01-14	Saturday	Regional	
            Republic Day	2023-01-26	Thursday	National	
            Maha Shivratri (Maha vad-14)	2023-02-18	Saturday	Regional	
            Holi 2nd Day-Dhuleti	2023-03-08	Wednesday	Regional	
            Chetichand	2023-03-22	Wednesday	Regional	
            Shree Ram Navmi	2023-03-30	Thursday	Regional	
            Mahavir Janma Kalyanak	2023-04-04	Tuesday	Regional	
            Good Friday	2023-04-07	Friday	Regional	
            Dr Baba Saheb Ambedkar Birthday	2023-04-14	Friday	Regional	
            Bhagvan Shree Parshuram Jayanti (Vaishakh sud-3)	2023-04-22	Saturday	Regional	
            Ramzan-Eid (Eid-Ul-Fitra) (1st Shawaal) (Muslim, Shiya, Sunni)	2023-04-22	Saturday	Regional	            
                """;
        System.out.println(listofholidays);
        
// This is comment

//TYPECASTING

        int i = 10;
// WIDENING TYPECASTING (INCREASING ORDER OF SIZE)
// ORDER (DOUBLE > FLOAT > LONG > INT > SHORT > BYTE)
        long l=i;
// EXPLICIT TYPECASTING (DECREASING ORDER OF SIZE)
        int x= (int)l;
        System.out.println(i);
        System.out.println(l);
        System.out.println(x);

// CONSTANTS IN JAVA

        final float PI = (float) 3.14;
        float radius = 215;
        float area;
        area= PI * radius * radius;
        System.out.println(area);

//READING INPUT IN JAVA

//Step 1: Import Code for Scanner class
//Step 2: Create o bject of scanner class
//Step 3: Use Argument System.in in Constructor new Scanner

        Scanner Sc = new Scanner(System.in);

    //Float
        System.out.println("Enter to Redius of Circle");
        float read = Sc.nextInt();
        System.out.println(read);
        float areanew;
        areanew = PI * read * read ;
        System.out.println("Area of Circle is " + areanew);
    //String
        System.out.println("Enter Sample String");
        String ppp = Sc.next();
        System.out.println(ppp);
    //Booolean    
        System.out.println("Enter Sample bool");
        boolean bool = Sc.nextBoolean();
        System.out.println(bool);
    // Character (We have to take index of string because next in Scanner don't have option for character specifically)
    System.out.println("Enter Sample String to get the character");
        char c = Sc.next().charAt(0);
        System.out.println(c);
    }
}
