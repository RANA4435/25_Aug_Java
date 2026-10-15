class Driver
{
public static void main(String args[])
{
	System.out.println("Starting of the main()" );
    OrderMgmt objectMgmt=new OrderMgmt();
    objectMgmt.PlaceOrder("Iphone 18");
	System.out.println("Print the value="+objectMgmt.value);
    System.out.println("Ending of the main()");
}
}