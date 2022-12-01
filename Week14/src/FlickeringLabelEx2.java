import java.awt.*;
import javax.swing.*;

class FlickeringLabel2 extends JLabel implements Runnable {
	private long delay;
	private int n;
	
	public FlickeringLabel2(String text, long delay, int n) {
		super(text);
		this.delay = delay;
		this.n = n;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		while(true) {
			if(n == 0) {
				setBackground(Color.GREEN);
			} else {
				setBackground(Color.YELLOW);
			}
			if(n == 0) {
				n = 1;
			} else {
				n = 0;
			}
			try {
				Thread.sleep(delay);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class FlickeringLabelEx2 extends JFrame{
	public FlickeringLabelEx2() {
		setTitle("FlickeringLabelEx2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel2 fLabel = new FlickeringLabel2("건국대학교", 1000, 0);
		FlickeringLabel2 fLabel2 = new FlickeringLabel2("소프트웨어전공", 1000, 1);
		
		c.add(fLabel);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlickeringLabelEx2();
	}
}