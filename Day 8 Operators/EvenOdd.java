class EvenOdd{

public static void main(String args[]){
   int userNumber=Integer.parseInt(args[0]);
   
   
   System.out.println("Enter the Number="+userNumber);
   System.out.println("Even="+(userNumber %2==0));
   System.out.prinltn("Odd="+(userNumber% 2!=0));
}
}