class PassFail{
public static void main(String args[]){

 int minMarks=39;
 int maxMarks=100;
 
 int userMarks=Integer.parseInt(args[1]);
 String name=args[0];
 
 System.out.println("Name="+name);
 
 System.out.println("Pass if marks is 40 or above of it="+(maxMarks>userMarks));
 System.out.println("fail if marks is 39 or below  of it="+(minMarks<userMarks));

System.out.println("Excellent ="+(maxMarks>userMarks && minMarks<userMarks));
 
}
}