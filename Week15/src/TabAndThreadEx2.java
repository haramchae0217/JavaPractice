import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel2 extends JLabel {
	int barSize = 0; // 바의 크기
	int maxBarSize;
	
	MyLabel2(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawString(Integer.toString(barSize), 280, 15);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth()))
				/maxBarSize*barSize);
		if(width==0) return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill() {
		if(barSize == maxBarSize) {
			try {
				wait();
			} catch (InterruptedException e) { 
				return; 
			}
		}
		barSize++;
		repaint(); // 바 다시 그리기
		notify();
	}
	
	synchronized void consume() {
		if(barSize == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}
		}
		barSize--;
		repaint(); // 바 다시 그리기
		notify();
	}
}

class ConsumerThread2 extends Thread {
	MyLabel2 bar;
	
	ConsumerThread2(MyLabel2 bar) {
		this.bar = bar;
	}
	
	public void run() {
		while(true) {
			
			try {
				sleep(500);
				bar.consume();
			} catch (InterruptedException e) {
				return; 
			}
		}
	}
}

public class TabAndThreadEx2 extends JFrame {
	MyLabel2 bar = new MyLabel2(100);
	
	TabAndThreadEx2(String title) {
		super(title);
		this.setDefaultCloseOperation
			(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				bar.fill();
			}
		});
		setSize(350,200);
		setVisible(true);
		ConsumerThread2 th = new ConsumerThread2(bar);
		th.start(); // 스레드 시작
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new TabAndThreadEx2(
				"아무키나 빨리 눌러 바 채우기");
	}
}
