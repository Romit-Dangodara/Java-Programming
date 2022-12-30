// MODULE 10 Autoboxing Unboxing

import java.util.ArrayList;
public class M10_AutoboxingUnboxing {
public static void main(String[] args) {
// WRAPPER CLASS
// Why do we need Wrapper Class?
// Collections: Java collections require objects instead of premitive data types.
ArrayList<Integer> Arr = new ArrayList<Integer>();
// Synchronisation: Java synchronisation works with objects in Multithreading.
Integer i = 5;
int j = 5;

System.out.println(i);
System.out.println(j);

// AUTOBOXING: It is automatic converstion that the Java compiler makes between premitive types and their corresponding object wrapper classes.
// The act of putting an integer value into the Integer Wrapper Class is called as Autoboxing.
// Wrapper object has several inbuilt functions to work upon and for that reason we do Autoboxing.
int a = 5;
float b = 3.14F;
long c = 6000;
Integer intObj = a;
Float floatObj = b;
Long longObj = c;
System.out.println(intObj);
System.out.println(floatObj);
System.out.println(longObj);

System.out.println(Float.MAX_VALUE);
System.out.println(Float.MIN_VALUE);
System.out.println(Long.MAX_VALUE);
System.out.println(Long.MIN_VALUE);
System.out.println(Integer.max(5, 10));

// UNBOXXING: The automatic conversion of Wrapper object to its corresponding premitive data type is known as Unboxing.
// Premitive Data types are simply faster and for speed optimisation we do Unboxing.

Integer p = 5;
Float q = 4.25F;
Character r = 'R';
Double s = 410.514541;
int w = p;
float x = q;
char y = r;
double z = s;

System.out.println(p);
System.out.println(q);
System.out.println(r);
System.out.println(s);
System.out.println(w);
System.out.println(x);
System.out.println(y);
System.out.println(z);

}
}