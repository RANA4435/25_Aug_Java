class Pay
{
public static void main(String args[])
{
System.out.println("Starting main()");
//Calling the value and passing the value(input)
boolean result=Pay.doSomething(10, "77889786797", "623773537262");
System.out.println("Is txn successful"+result);
System.out.println("Ending main()");
}
static boolean doSomething(int amountToBetxn, String senderAccNo, String recAccNo )
{
System.out.println("Enterd doSomething");
System.out.println("Input"+amountToBetxn+" "+senderAccNo+" "+recAccNo);
System.out.println("Exit doSomething");
return true;


}
}