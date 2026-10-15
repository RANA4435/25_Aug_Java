class AddTwo
{
public static void main(String args[])
{
int firstNum=Integer.parseInt(args[0]);
int firstSec=Integer.parseInt(args[1]);

   AddTwo.doSomething(firstNum, firstSec);
}
	public static void doSomething(int firstNum, int firstSec)
	{
	System.out.println("First="+firstNum);
	System.out.println("Second="+firstSec);

	System.out.println("result="+(firstNum+firstSec));
	}

}