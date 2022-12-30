import java.util.Scanner;
public class M8_Functions_BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height: "); // In Centimeter
        float A = sc.nextInt();
        A =A/100; // Convert into Meter
        System.out.println("ENter Weight: ");  // In Kilogram
        float B = sc.nextInt();
        float BMI = BMI(A, B);
        System.out.println(BMI);
    }

    static float BMI(float x, float y){
        float BMI = y / (x * x);
        if(BMI<18.5)
            System.out.println("Underweight");
        else if(BMI>=18.5 && BMI<25)
            System.out.println("Normal weight");
        else if(BMI>=25 && BMI<30)
            System.out.println("Overweight");
        else if(BMI>=30)
            System.out.println("Obese");        
        return BMI;
    }
}
