class Add{
int a;
int b;
int c;

void Display(){
int c=a-b;
System.out.println("c="+c);
}
}
public class Addition{
public static void main(String args[]){
Add a1=new Add();
a1.a=8;
a1.b=6;

a1.Display();
}
}