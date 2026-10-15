class Payment
{
static int salary=1800;
static int salary1=1900;
  int balance=200;

public static void main(String args[])
{
	Payment pp=new Payment();
	System.out.println("Balance="+pp.balance);
  Payment.doSomething();
}
public static void doSomething()
{
System.out.println("salary" +salary);
System.out.println("salary1" +salary1);
}
}