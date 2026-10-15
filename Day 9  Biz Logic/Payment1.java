class Payment1
{
static int salary=100000;
static int age=60;
int bonus=20000;

public static void main(String args[])
{
Payment1 pp=new Payment1();
System.out.println("Bonus="+pp.bonus);

 Payment1.doSomething();
}
public static void doSomething()
{
System.out.println("Salary="+salary);
System.out.println("Age="+age);
}
}