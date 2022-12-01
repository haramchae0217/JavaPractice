import java.awt.*;
import javax.swing.*;

public class CountDownLabelEx extends JFrame {
	public CountDownLabelEx() {
		setTitle("Runnable을 구현한 카운트다운 레이블");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		CountDownLabel label = new CountDownLabel(8);
		label.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(label);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CountDownLabelEx();
	}
}

class CountDownLabel extends JLabel implements Runnable {
	int n = 10;
	
	public CountDownLabel(int n) {
		if(n > 0) {
			this.n = n;
		}
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		while( n >= 0) {
			setText(Integer.toString(n));
			n--;
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
