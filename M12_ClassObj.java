// MODULE 12 Classes & Objects
// WHAT IS OOPS: Object Oriented Programming Style (OOPS) is a programming style that deals with classes & objects.
// The main aim of object-oriented programming is to implement real- world entities, for example, object, classes, abstraction, inheritance, polymorphism, etc.
// Classs: It is blueprint of object.
// Object: It is entity that has a state and some behaviour.        

public class M12_ClassObj {
public static void main(String[] args) {
    Mobile Oppo = new Mobile();
    Mobile Vivo = new Mobile();
    Oppo.PowerOn();
    System.out.println("Model: " + Oppo.Model);
    System.out.println("Price: " + Oppo.GetPrice());
    System.out.println("Colour: " + Oppo.Colour);
    Oppo.Update();
    Oppo.Model = "OPPO  Find  X2";
    Oppo.Price = 57000;
    Oppo.SetPrice(50000);
    Oppo.Colour = "Ocean";
    System.out.println("Model: " + Oppo.Model);
    System.out.println("Price: " + Oppo.GetPrice());
    System.out.println("Colour: " + Oppo.Colour);
    Oppo.PowerOff();

    Vivo.PowerOn();
    System.out.println("Model: " + Vivo.Model);
    System.out.println("Price: " + Vivo.GetPrice());
    System.out.println("Colour: " + Vivo.Colour);
    Vivo.Update();
    Vivo.Model = "Vivo V23 5G";
    Vivo.Price = 34190;
    Vivo.SetPrice(30000);
    Vivo.Colour = "Stardust Black";
    System.out.println("Model: " + Vivo.Model);
    System.out.println("Price: " + Vivo.GetPrice());
    System.out.println("Colour: " + Vivo.Colour);
    Vivo.PowerOff();

}
}

class Mobile{
String Model = "Mobile Model";
int Price = 1000;
String Colour = "Colour Black";
boolean isPowered = false;

void PowerOn(){
    isPowered = true;
    System.out.println(Model + " Mobile Function Power On");
    System.out.println();
}
void PowerOff(){
    isPowered = false;
    System.out.println(Model + " Mobile Function Power Off");
    System.out.println();
}   
void Update(){
    System.out.println(Model + " Mobile Function System Update");
    System.out.println();
}
// Getter
float GetPrice(){
    return Price;
}
// Setter 
void SetPrice(int PriceValue){
    if (PriceValue<0){
        PriceValue = 0;
        }
    Price = PriceValue;
}
}