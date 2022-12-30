// MODULE 7 Strings

public class M7_Strings {
public static void main(String[] args) {

// STRING CLASS    
    String s = "Hello Romit Dangodara";
    System.out.println(s);
    System.out.println(s.length());
    System.out.println(s.charAt(2));
    System.out.println(s.toUpperCase());

    System.out.println("Romit".length());
    System.out.println("Romit".toUpperCase());

// STRING POOL AND NEW KEYWORD
// String Pool is area in heap memory where the string literals are stored.
// > All strings in Java are immutable
// > All string pool reside in heap memory
    String S1 = "abc";
    String S2 = "abc";
    if(S1==S2){System.out.println("S1 and S2 are equal because both are pointing to same String " + S1 + "residing in String Pool.");}
    else{System.out.println("S1 and S2 are not equal.");}
    String S3 = "def";


// String Using New Keyword
// These String do not reside in String Pool, Instead they are created and stored in the heap memory.
    String S4 = new String("abc");
    if(S1==S4){System.out.println("S1 and S4 are equal.");}
    else{System.out.println("S1 and S4 are not equal, because S4 was created with new keyword, it resied outside string pool.");}

// Equals Method to find String Classes. It allows us to check & compare content of the string, rather then object references.    
    if(S1.equals(S4)){System.out.println("S1 and S4 are equal if we compare content of the string, rather then object references using Equal Method");}
    else{System.out.println("S1 and S4 are not equal.");}

// STRING CLASS METHODS
// String class offers several methods out of the box. We will be looking at some of them in this section.  
String SSS = "Hello World!";

// 1. CharAt: charAt method allows us to access the character at the specified index.
System.out.println(SSS.charAt(0));

// 2. length: The length() method returns the length of the string.
System.out.println(SSS.length());

// 3. indexOf: indexOf methods returns the index of the first occurrence of the specified char or string in the given string. If it is present, then it returns -1.
System.out.println(SSS.indexOf("e"));
System.out.println(SSS.indexOf("N"));

// 4. equals: Equals method is used to compare whether the two strings contain the same sequence of characters.
if(S1.equals(S4)){System.out.println("S1 and S4 are equal if we compare content of the string, rather then object references using Equal Method");}
else{System.out.println("S1 and S4 are not equal.");}

// 5. contains: Returns true if and only if this string contains the specified sequence of char values
System.out.println(SSS.contains("Hello"));

// 6. toLowerCase, toUpperCase: Returns new strings after changing the case. Original string remains intact.
System.out.println(SSS.toUpperCase());
System.out.println(SSS.toLowerCase());

// 7. replace: Replaces the target string (first) with the given replacement string (second) and returns a new string.
String SPP = SSS.replace("Hello", "Hiii");
System.out.println(SPP);

// 8. substring: Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex. If endIndex is not given, it is taken as string length.
System.out.println(SPP.substring(0, 6));

// 9.. String concatenation: Concatenation is the process of appending one string to the end of another string. Java strings can be added by using the '+' operator. • When a string is concatenated with primitive types, they are automatically typecasted to strings. • When a string is concatenated with non-primitive types, the toString() on that object is called automatically.
String SQQ = SSS + " " + SPP + 5;
System.out.println(SQQ);


// STRING BUILDER CLASS
// Java StringBuilder Class is used to create mutable (modifiable) string.
StringBuilder SS1 = new StringBuilder("HELLO");
System.out.println(SS1);

SS1.append(" WORLD");
System.out.println(SS1);

SS1.insert(6, "BEAUTIFUL ");
System.out.println(SS1);

SS1.reverse();
System.out.println("Reverse of SS1: " + SS1);

SS1.reverse();
System.out.println("Reverse of SS1: " + SS1);

SS1.replace(0, 5, "HEY");
System.out.println(SS1);

SS1.delete(4, 14);
System.out.println(SS1);

// Convert StringBuilder instance into String.
String NewSS1 = SS1.toString();
System.out.println("SS1: " + SS1);
System.out.println("NewSS1: " + NewSS1);

// Strings Vs Char Arrays
String P1 = "Hello";
char[] P2 = {'H','e','l','l','o'};
System.out.println("P1: " + P1);
System.out.println("P2: " + P2[1]);

// Convert String to Char Array and ViceVersa
char[] P3 = P1.toCharArray();
System.out.println("P3: "+ P3[0]);
String P4 = new String(P2);
System.out.println("P4: " + P4);


}
}