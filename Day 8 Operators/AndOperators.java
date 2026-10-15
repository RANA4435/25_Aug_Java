class AndOperators
{
public static void main(String args[])
{
  int minAge =18;
  int maxAge = 60;
  
  int userAge = Integer.parseInt(args[1]);
  String  name =args[0];
  
  System.out.println("Applying for DL:"+name);
  
  System.out.println("condition1:"+(minAge<userAge));
  System.out.println("condition1:"+(maxAge>userAge));
  
  System.out.println("Allowed to aplly for Dl:"+(minAge<userAge &&(maxAge>userAge)));
}
}