// STRING EXERCISES
// Write a Java program to reverse a string.
import java.util.Scanner;
public class M7_Strings_ReverseString {
public static void main(String[] args){
Scanner IP = new Scanner(System.in);
System.out.println("Enter a string to get the reverse string: ");    
String S1 = IP.nextLine();

// Create Reverse String S2 Using For Loop
String S2 = "";
for(int i = S1.length()-1; i >= 0; i --){
    S2 = S2 + S1.charAt(i);
}

// Create S3 Using String builder
StringBuilder S3 = new StringBuilder(S1);
S3.reverse();
// Convert StringBuilder instance into String.
String S4 = S3.toString();          

System.out.println("Original String S1 = " + S1);
System.out.println("Reversed String S2 = " + S2);
System.out.println("Reversed String S3 = " + S4);
System.out.println("Reversed String S4 = " + S4);

}
}