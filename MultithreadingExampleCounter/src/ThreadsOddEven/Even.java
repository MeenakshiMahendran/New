package ThreadsOddEven;

public class Even implements Runnable{
	
	SharedPrinter sp;
	
	public Even(SharedPrinter sp2) {
		// TODO Auto-generated constructor stub
		this.sp=sp2;
	}

	@Override
	public void run(){
		
		for(int i=2;i<=100;i=i+2){
			sp.printEven(i);
		}
		
	}
	
}
