class Voting
{
public static void main(String args[])
{
  int minAge=18;
  int maxAge=145;
  
  
  String name=args[1];
  int userAge=Integer.parseInt(args[1]);
  
  System.out.println("Name of a person who is voting="+name);
  
  System.out.println("Not Eligible below="+(minAge<userAge));
  System.out.println("Eligible for the voting="+(maxAge>userAge));
  
  System.out.println("Codition check="+(minAge<userAge && maxAge>userAge));
}
}