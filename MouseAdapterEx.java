package may20;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello"); 
	
	public MouseAdapterEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
	
		// 컨텐트 페인에 mouse 이벤트 리스너 연결
		c.addMouseListener(new MyMouseAdapter()); 

		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
	
		setSize(250, 250); // Frame의 크기 지정
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
	
	public static void main(String[] args) {
		new MouseAdapterEx();

	}

}
