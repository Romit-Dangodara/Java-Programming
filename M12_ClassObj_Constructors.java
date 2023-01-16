// A Java constructor is special method that is called when an object is instantiated.
// It has the same name as the class itself and is invoked automatically at the time of object construction.
// Constructor does not have any return type.
class Mobilee {
String Model;
int Price;
String Colour;
boolean isPowered = false;

Mobilee(String Model, int Price, String Colour){
    this.Model = Model;
    this.Price = Price;
    this.Colour = Colour;
}

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


public class M12_ClassObj_Constructors {
public static void main(String[] args) {

Mobilee Oppo = new Mobilee("OPPO Find X2", 50000, "Ocean");
Oppo.PowerOn();
Oppo.Update();
System.out.println("Model: " + Oppo.Model);
System.out.println("Colour: " + Oppo.Colour);
Oppo.PowerOff();

Mobilee Vivo = new Mobilee("Vivo V23 5G", 34190, "Stardust Black");
Vivo.PowerOn();
Vivo.Update();
System.out.println("Model: " + Vivo.Model);
System.out.println("Price: " + Vivo.GetPrice());
System.out.println("Colour: " + Vivo.Colour);
Vivo.PowerOff();

Mobilee Lava = new Mobilee("Lava Blaze 5G", 10999, "Dark Blue");
Lava.PowerOn();
Lava.Update();
System.out.println("Model: " + Lava.Model);
System.out.println("Price: " + Lava.GetPrice());
System.out.println("Colour: " + Lava.Colour);
Lava.PowerOff();
}
}
