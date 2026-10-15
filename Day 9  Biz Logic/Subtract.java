class Subtraction{
  public static void main(String args[]){
    int firstNum=Integer.parseInt(args[0]);
    int secNum=Integer.parseInt(args[1]);

    int res=Subtraction.doSubtract(firstNum, secNum);
  }
  static  int doSubtract(int firstNum,  int secNum){
    System.out.println("Result="+(firstNum-secNum));
    return firstNum-secNum;
  }
}