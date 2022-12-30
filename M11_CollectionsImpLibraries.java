import java.math.BigInteger;

public class M11_CollectionsImpLibraries {
public static void main(String[] args) {
    // MinMax
    System.out.println("MinMax Functions");
    System.out.println(Math.min(10, 15));
    System.out.println(Math.max(10, 15));
    // Rounding Off
    System.out.println("Rounding Off");
    System.out.println(Math.floor(3.59));
    System.out.println(Math.ceil(3.59));
    System.out.println((double) Math.round(3.59));
    System.out.println((float) Math.round(3.49));
    // Log and Exponents
    System.out.println("Log and Exponents");
    double e = Math.E;  
    System.out.println(e);
    System.out.println(Math.log(e));
    System.out.println(Math.exp(e));
    System.out.println(Math.log10(100));
    System.out.println(Math.PI);
    System.out.println("Power and Square Root");
    System.out.println(Math.pow(5,3));
    System.out.println(Math.sqrt(4));
    System.out.println(Math.sqrt(64));
    // Trigonometric Methods
    System.out.println("Trigonometric Functions");
    System.out.println(Math.PI);
    System.out.println(Math.sin(Math.PI/2));    // Use Unit in Radian. Degree is not allowed.
    System.out.println(Math.sin(Math.PI/6));
    System.out.println(Math.cos(Math.PI/3));
    System.out.println(Math.tan(Math.PI));
    System.out.println(Math.tan(Math.PI/2));
    System.out.println(Math.tan(Math.PI/3));
    System.out.println(Math.tan(Math.PI/4));
    System.out.println(Math.tan(Math.PI/6));
    double Pythagoras = Math.pow(Math.sin(Math.PI/2), 2) + Math.pow(Math.cos(Math.PI/2), 2);
    System.out.println(Pythagoras);
    // Big Integer
    System.out.println("Big Integer");
    BigInteger B1 = new BigInteger("50000000000000000000");
    BigInteger B2 = new BigInteger("150000000000000000000");
    System.out.println(B1);
    System.out.println(B2);
    System.out.println(B1.add(B2));    
    System.out.println(B1.subtract(B2));
    System.out.println(B1.divide(B2));
    System.out.println(B1.multiply(B2));
    System.out.println(B1.pow(5));
    // Data Converstion from Numeric to Big Integer
    System.out.println("Data Converstion from Numeric to Big Integer");
    long p = 6054;
    BigInteger q = new BigInteger(p +"");
    System.out.println(p);
    System.out.println(q);

    BigInteger r = new BigInteger("50");
    int s = r.intValue();
    System.out.println(r);
    System.out.println(s);

}
}
