// Given a string, check whether it is palindrome or not.
// A string is said to be palindrome if it is equal to its reverse.
// For example, "Tenet" is a palindrome.

import java.util.Scanner;
public class M7_Strings_Palindrome {
public static void main(String[] args) {
Scanner IP = new Scanner(System.in);
System.out.println("Enter String S1 to check whether it is pendrome or not: ");
String S1 = IP.nextLine();
S1 = S1.toUpperCase();
// Create S2 Using String builder
StringBuilder S2 = new StringBuilder(S1);
S2.reverse();
// Convert StringBuilder instance into String.
String S3 = S2.toString();          

System.out.println("Original String S1: " + S1);
System.out.println("Reversed String S3: " + S3);

if(S1.equals(S3))
    {System.out.println(S1 + " is Palindrome.");}
else
    {System.out.println(S1 + " is Not Palindrome.");}    
}
}    