package ThreadsOddEven;
import java.util.concurrent.Semaphore;

public class SharedPrinter {
	
	private Semaphore semOdd=new Semaphore(1);
	private Semaphore semEven=new Semaphore(0);
	
	public void printOdd(int number){
		
			try {
				semOdd.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" : "+number);
			semEven.release();
		
	}
	
	public void printEven(int number){
		
		try {
			semEven.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" : "+number);
		semOdd.release();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
