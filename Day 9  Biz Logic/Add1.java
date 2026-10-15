class Main{
  public static void main(String args[]){
    int firstNum=Integer.parseInt(args[0]);
    int secNum=Integer.parseInt(args[1]);

    int res=Main.doSomething( firstNum,  secNum);
  }
  static int  doSomething(int firstNum, int secNum){
    System.out.println("Result="+( firstNum+ secNum));
    return firstNum+ secNum;
  }

}