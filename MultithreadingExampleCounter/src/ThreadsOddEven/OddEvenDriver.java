package ThreadsOddEven;

public class OddEvenDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SharedPrinter sp=new SharedPrinter();
		Thread t1=new Thread(new Odd(sp),"Odd");
		Thread t2=new Thread(new Even(sp),"Even");
		
		t1.start();
		t2.start();
		
	}

}
