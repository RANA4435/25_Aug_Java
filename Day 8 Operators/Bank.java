class Bank{
public static void main(String args[]){

int minAge=20;
int maxAge=30;


int userAge=Integer.parseInt(args[1]);
String name=args[0];


System.out.println("name="+name);

System.out.println("Eligibility ="+(minAge<userAge));
System.out.println("Eligibility ="+(maxAge>userAge));

System.out.println("Result="+(minAge<userAge && maxAge>userAge));

}
}