// MODULE 8:  Functions - Call Stack
// main() -> sum() -> result



public class M8_Functions_CallStack {
static int one(int A){
    A = A + 10;
    System.out.println("inside one() in Beginning, A = " + A);
    int B = two(A);
    B = B -10;
    System.out.println("inside one() in End, B = " + B);
    return B;    
}
static int two(int A){
    A = A + 10;
    System.out.println("inside two() in Beginning, A = " + A);
    int B = three(A);
    B = B -10;
    System.out.println("inside two() in End, B = " + B);
    return B;
}
static int three(int A){
    A = A + 10;
    System.out.println("inside three() in Beginning, A = " + A);
    int B = A;
    System.out.println("inside three() in End, B = " + B);
    return B;
}
public static void main(String[] args) {
    int A = 0;
    System.out.println("inside Main() in Beginning, A = " + A);
    int B = one(A);
    B = B -10;
    System.out.println("inside Main() in End, B = " + B);
}
}
