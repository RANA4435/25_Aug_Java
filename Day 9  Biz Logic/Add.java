class Add
{
public static void main(String args[])
{
  String firstNum=args[0];
  String secNum=args[1];
  
  int firstNumInt=Integer.parseInt(firstNum);
  int secNumInt=Integer.parseInt(secNum);
  
  System.out.println("Adding Two Numbers="+(firstNumInt +secNumInt));
}
}
