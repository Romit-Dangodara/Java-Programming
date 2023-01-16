// Write a class to store and perform operations on Complex Numbers
// Construct a class called ComplexNumber which stores two properties
// real - The real part
// imaginary - The imaginary part
// The name of the properties should be strictly real and imaginary
// Implement the following functionalities inside this class :-
// add(ComplexNumber) -> Returns an object of ComplexNumber having sum of the two complex numbers.
// subtract(ComplexNumber) -> Returns an object of ComplexNumber having difference of the two complex numbers.
// multiply(ComplexNumber) -> Returns an object of ComplexNumber having multiplication of the two complex numbers.
// divide(ComplexNumber) -> Returns an object of ComplexNumber having division of the two complex numbers.


public class M12_ClassObj_ComplexNum {
    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(5, 6);
        ComplexNum c2 = new ComplexNum(3, 4);
        c1.Print();
        c2.Print();
        ComplexNum C3 = c1.Add(c2);
        C3.Print();
        ComplexNum C4 = c1.Subtract(c2);
        C4.Print();
        c1.Multiply(c2);
        c1.Print();
        c1.Divide(c2);
        c1.Print();

        System.out.println(c1);
    }
}

class ComplexNum{

int real;
int imaginary;
ComplexNum(int real, int imaginary){
    this.real = real;
    this.imaginary = imaginary;
}

void Print(){
    System.out.println(this.real + " + " + this.imaginary + "i");
}

ComplexNum Add(ComplexNum CC){
    this.real = this.real + CC.real;
    this.imaginary = this.imaginary + CC.imaginary;
    ComplexNum CN = new ComplexNum(this.real, this.imaginary);
    return CN;
}

ComplexNum Subtract(ComplexNum CC){
    this.real = this.real - CC.real;
    this.imaginary = this.imaginary - CC.imaginary;
    ComplexNum CN = new ComplexNum(this.real, this.imaginary);
    return CN;
}

ComplexNum Multiply(ComplexNum CC){
    this.real = (this.real * CC.real) - (this.imaginary * CC.imaginary);
    this.imaginary = (this.imaginary * CC.real) + (this.real * CC.imaginary); 
    ComplexNum CN = new ComplexNum(this.real, this.imaginary);
    return CN;
}

ComplexNum Divide(ComplexNum CC){
    this.real = ((this.real * CC.real) + (this.imaginary * CC.imaginary))/(CC.real * CC.real + CC.imaginary * CC.imaginary);
    this.imaginary = ((this.imaginary * CC.real) - (this.real * CC.imaginary)/(CC.real * CC.real + CC.imaginary * CC.imaginary)); 
    ComplexNum CN = new ComplexNum(this.real, this.imaginary);
    return CN;
}

public String toString(){
    System.out.println("This is the toString method");
    return this.real + " + " + this.imaginary + "i";
}

}