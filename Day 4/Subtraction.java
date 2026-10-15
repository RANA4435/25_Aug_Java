class Subtract{
int a;
int b;
int c;

void Display(){
 c=a-b;
 System.out.println("c="+c);
}
}
public class Subtraction{
public static void main(String args[]){
Subtract s1=new Subtract();
s1.a=112;
s1.b=90;

s1.Display();
}
}