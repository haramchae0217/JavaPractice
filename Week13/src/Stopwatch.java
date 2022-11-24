import java.awt.*;
import javax.swing.*;

class Sthread extends Thread {
	private JLabel j;
	private int interval;
	
	public Sthread( JLabel j , int interval) {
		this.j = j;
		this.interval = interval;
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) {
			j.setText( Integer.toString(n) + ".");
			n++;
			if(n == 60) n = 0;
			try {
				sleep( interval );
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class Stopwatch extends JFrame {
	public Stopwatch() {
		setTitle("Stopwatch");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		
		JLabel j1 = new JLabel();
		j1.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add( j1 );
		
		JLabel j2 = new JLabel();
		j2.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add( j2 );
		
		setSize(300, 170);
		setVisible(true);
		
		Thread th1 = new Sthread(j1, 1000);
		th1.start();
		Thread th2 = new Sthread(j2, 100);
		th2.start();
		
	}
	public static void main(String[] args) {
		new Stopwatch();
	}
}
