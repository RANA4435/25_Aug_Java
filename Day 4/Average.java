class Average1{
  int a;
  int b;
  int c;

  void Display(){
   double c=(a+b)/2.0;
  
    System.out.println("c="+c);
  }
}
public class Average{
  public static void main(String args[]){
    Average1 a1=new Average1();
    a1.a=2;
    a1.b=7;
    a1.Display();
  }
}