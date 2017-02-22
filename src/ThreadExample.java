
public class ThreadExample extends Thread {
	 
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(1000);
				System.out.println(" TIMEOUT ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		te.run();

	}

}
