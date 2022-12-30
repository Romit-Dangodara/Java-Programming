// Scope of variables:
// The scope of a variable is the region of the program where it is accessible.
// There are two types of scope levels in Java
// - Class level scope (covered in OOPS section)
// - Block level scope

// Variable Arguments:                                                                          
// Variable arguments are used to pass a variable number of arguments to a function.
// The variable arguments are declared using the ellipsis operator (...) after the type of the last argument.
// The variable arguments are always passed as an array.
// The variable arguments must be the last argument in the argument list.


public class M8_Functions_VariableScope {

public static void main(String[] args) {
    int a = 10; // a is declared inside main() and is accessible only inside main()
    System.out.println("a = " + a);
    {
        int b = 20; // b is declared inside the block and is accessible only inside the block
        System.out.println("b = " + b);
    }
    // System.out.println("b = " + b); // b is not accessible here
    {
        int c = 30; // c is declared inside the block and is accessible only inside the block
        System.out.println("c = " + c);
    }
        // System.out.println("c = " + c); // c is not accessible here
    System.out.println("a = " + a);

    // Variable Arguments 
   float A1 = Avrg( 1,2,3,4,5,6,7,8,9,10);
   float A2 = Avrg( 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
   float A3 = Avrg( 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
System.out.println("A1 Average = " + A1);
System.out.println("A2 Average = " + A2);
System.out.println("A3 Average = " + A3);
}

public static float Avrg(float ...VariableArguments) {
    System.out.println("Number of arguments = " + VariableArguments.length);
    float total = 0;
    for (float num: VariableArguments) {
        total += num;
    }
    System.out.println("Total = " + total);
    System.out.println("Average = " + total / VariableArguments.length);
    return total / VariableArguments.length;
}

}

