class OrderMgt
{
	private int value=1800;
public void PlaceOrder(String itemName)
{
	OrderMgt objectMgt=new OrderMgt();
	//calling the values by using the objectMgt
	System.out.println("Print thee value="+objectMgt.value);
    System.out.println("Order="+itemName);
}
}