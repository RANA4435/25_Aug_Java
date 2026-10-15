class PaymentDetails
{
public static void main(String args[])
{
boolean result=PaymentDetails.doSomething(100, "kamdev", "Aamir");
System.out.println("result="+result);
}
static boolean doSomething(int amount, String sender, String reciever) 
{
System.out.println("Input="+amount);
System.out.println("Sender="+sender);
System.out.println("reciever="+reciever);
return true;
}
}