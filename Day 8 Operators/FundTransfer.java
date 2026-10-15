class FundTransfer{
public statuc void main(String args[]){
System.out.println("Starting main()"0;
//Calling the method and passing the values(input)
boolean result=FundTransfer.doTransaction(10, "36129887217" "3612652389");
System.out.println("is transaction successful ? "+ result);
System.out.println("Ending main");
}
static boolean doTransaction(int amountToBeTxn, String senderAccNo, String recAccNo){
System.out.println("Entered doTransaction()");
}
System.out.println("Input Recieved "+amountToBeTxn +" "+ senderAccNo +" "+recAccNo);
System.out.println("Exit doTransaction");
return true;

}