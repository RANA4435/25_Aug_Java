class Driving{

public static void  main(String args[]){
{
  int minAge=18;
  int maxAge=55;
  
  int userAge=Integer.parseInt(args[1]);
  String name=args[0];
  
  System.out.println("Person Who is applying for the Dl="+name);
  
  
  System.out.println(" Minimum Age Should be between 18="+(minAge<userAge));
   System.out.println(" Minimum Age Should be between 18="+(maxAge>userAge));
   
   
   
    System.out.println("if the age lie between the minAge and maxAge="+(minAge < userAge && maxAge > userAge));

}
}
}