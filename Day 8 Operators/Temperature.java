class Temperature{
public static void main(String args[]){

int temMin = 20;
int temMax = 40;

int userName=Integer.parseInt(args[1]);
String name= args[0];

System.out.println("Name="+name);

System.out.println("Good But Not Comfortable="+(temMin<userName));
System.out.println("Typically very high not good="+(temMax>userName));

System.out.println("Result="+(temMin<userName  && temMax>userName));
}
}