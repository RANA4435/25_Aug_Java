class Multiplication{
public static void main(String args[]){
int first=Integer.parseInt(args[0]);
int sec=Integer.parseInt(args[1]);

int res=Multiplication.multiply(first, sec);
}
static int multiply(int first, int sec){
System.out.println("Result="+(first*sec));
return first*sec;
}
}