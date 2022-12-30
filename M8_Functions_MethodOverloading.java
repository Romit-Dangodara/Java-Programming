// Method overloading is the act of having multiple methods having same name but different parameters.
// It increases the readability of the program.
// It is also known as compile time polymorphism.
// It is used to perform different tasks using the same method name.
// Method Signature: It is the combination of method/function name and parameters.

public class M8_Functions_MethodOverloading {

static int addition(int a, int b){
    System.out.println("Sum of " + a + " and " + b + " is ");
    return a+b;
}
static int addition(int a, int b, int c){
    System.out.println("Sum of " + a + ", " + b + " and " + c + " is ");
    return a+b+c;
}
static String addition(String a, String b){
    System.out.println("Concatenation of " + a + " and " + b + " is ");
    return a + b;
}
public static void main(String[] args) {
    System.out.println(addition(5, 6));
    System.out.println(addition(5, 6, 7));
    System.out.println(addition("Romit ", "Dangodara"));
}
    
}
