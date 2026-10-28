public class Main{
public static void main(String args[]){
System.out.println("Inside Main class Main method");
Payment  payment= new Payment();
payment.paymentMethod();
Demo2 kchbhi = new Demo2();
kchbhi.demo2();

}
}

class Payment{
public void paymentMethod(){
	System.out.println("Inside MAin class method");
}
}

class Demo2{
	
	public void demo2(){
		System.out.println("Inside Demo Class");
	}
}
