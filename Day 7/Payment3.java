class Payment3
{
	static int balance=1000;
public static void main(String args[])
{
	// Payment3 pp=new Payment3();
  int empl=299;
  int salary=15000;
  
  System.out.println("Employee="+empl);
  System.out.println("Salary="+salary);
  System.out.println("Balance="+balance);
  Payment3.doSomething();
}
public static void doSomething()
{
	System.out.println("Balance="+Payment3.balance);
}
}