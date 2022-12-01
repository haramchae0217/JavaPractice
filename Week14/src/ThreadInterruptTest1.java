public class ThreadInterruptTest1 {
	public static void main(String[] args) {
		MyThread1 th = new MyThread1();
		th.start();
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			return;
		}
		th.interrupt();
	}
}

class MyThread1 extends Thread {
	int n = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("Interrupted");
				return;
			}
		}
	}
}
