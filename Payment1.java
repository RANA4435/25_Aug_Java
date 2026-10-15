class Payment1
{
    static int balance = 10;

    public static void main(String args[])
    {
		Payment1 pay = new Payment1();
        int amount = 200;
        int txnAmount = 10;

        System.out.println("amount=" + amount);
        System.out.println("txnAmount=" + txnAmount);
        System.out.println("amount=" + balance);

        Payment1.doSomething();
    }

    public static void doSomething()
    {
        System.out.println("This is Simple " + Payment1.balance);
    }
}

