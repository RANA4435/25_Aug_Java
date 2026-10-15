class Multi{
	int a;
	int b;
	int c;
	
	void Display(){
		int c=a*b;
		System.out.println("C="+c);
	}
}
public class Multiplication{
	public static void main(String args[]){
		Multi m1=new Multi();
		m1.a=10;
		m1.b=15;
		m1.Display();
	}
}