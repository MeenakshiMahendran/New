package ThreadsOddEven;

public class Odd implements Runnable{

	SharedPrinter sp;
	
	public Odd(SharedPrinter sp2) {
		// TODO Auto-generated constructor stub
		this.sp=sp2;
	}

	@Override
	public void run(){
		
		for(int i=1;i<=100;i=i+2){
			sp.printOdd(i);
		}
		
	}

}
