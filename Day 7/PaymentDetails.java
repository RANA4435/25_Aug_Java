class PaymentDetails
{
    static int balance = 1000;
	static int salary=16000;

    public static void main(String args[])
    {
		PaymentDetails.doSomething();
    }
	public static void doSomething()
	{
		System.out.println("Balance="+balance);
		System.out.println("salary="+salary);
	}
}