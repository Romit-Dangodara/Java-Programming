// MODULE 8 Functions

// We can pass values to methods, known as parameters, and return values from them as well.
// This is done by using the return keyword. The return keyword is used to return a value from a method. The return keyword is used to exit a method.
// They allow us to divide our code in logical blocks. They allow us to reuse code.
public class M8_Functions {
public static void main(String[] args) {
    String Name= "Romit";
    int Age = 22;
    String Gender = "Male";
    String City = "Surat";
    introduce(Name, Age, Gender, City);
    product(5,6);
    int result = sum(5, 6);         // We can store the returned value in a variable.

    System.out.println("Sum: " + result);

    System.out.println("Suare of 5 is " + square(5));

    System.out.println("Suare of 10 is " + square(10));

    String[] AAA1 =  heroes();
    for(String num: AAA1){
        System.out.println(num);}

}
static void introduce(String Name,int Age,String Gender,String City){
    System.out.print("My name is "+ Name + ". ");
    System.out.println("I am "+Age+" years old " + Gender + " from " + City + " city.");
}
static void product(int c, int d){
    System.out.println("Product of " + c + " and " + d + " is " + c*d + ".");
}
// RETURN METHOD
static int sum(int a, int b){
    int result = a + b;
    return result;
}
static int square(int pp){
    return pp*pp;
}
static String[] heroes(){
    String[] Superheroes = {"Batman, Superman, Spiderman, Ironman, Hulk"};
    return Superheroes;
}

}