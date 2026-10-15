class Average
{
    public static void main(String args[])
    {
        int firstNum = Integer.parseInt(args[0]);
        int secNum = Integer.parseInt(args[1]);

        int res = Average.doSomething(firstNum, secNum);
    }

    public static int doSomething(int firstNum, int secNum)
    {
        System.out.println("Result=" + ((firstNum + secNum) / 2));
        return (firstNum + secNum) / 2;
    }
}