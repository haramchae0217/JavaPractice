import java.util.Scanner;

public class ThreadInterruptTest2 {
	public static void main(String[] args) {
		MyThread2 th = new MyThread2();
		th.start();
		for(int i = 0; i < 5; i++) {
			new Scanner(System.in).nextLine();
			th.interrupt();
		}
	}
}

class MyThread2 extends Thread {
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
				n = 0;
			}
		}
	}
}
