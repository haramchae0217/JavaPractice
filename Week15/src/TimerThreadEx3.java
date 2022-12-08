public class TimerThreadEx3 {
	public static void main(String[] args) {
		TimerThread3 th = new TimerThread3();
		th.start();
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			return;
		}
		th.finish();
	}
}

class TimerThread3 extends Thread {
	private int n = 0;
	private boolean flag = false;
	public void finish() { flag = true; }
	
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
				if(flag == true) {
					return;
				}
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
