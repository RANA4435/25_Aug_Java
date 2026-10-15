class Mobile{
  String brand;
  String processor;
  int model;
  int price;
  
  
  void Display(){
  System.out.println("Brand="+brand);
  System.out.println("Processor="+processor);
  System.out.println("Model="+model);
  System.out.println("price="+price);
  }
}
public class MobileBrand{
public static void main(String args[]){
   Mobile m1=new Mobile();
   m1.brand="Vivo v20 pro";
   m1.processor="Snap dragon";
   m1.model=2026;
   m1.price=30000;
   
   m1.Display();
}
}