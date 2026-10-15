class Drivers
{
public static void main(String args[])
{
	System.out.println("Starting the main()");
	//calling an Object from the other class
    OrderMgt object=new OrderMgt();
    object.PlaceOrder("Iphone 16");

    System.out.println("Ending the main()");

}
}