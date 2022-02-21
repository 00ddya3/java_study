package may20;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerEx extends JFrame{
	private JLabel label = new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		label.setSize(50, 20);
		label.setLocation(30, 30);
		c.add(label);
		
		setSize(250,250);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {	
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x, y);
			
			System.out.println("mouse pressed : (" + x + "," + y + ")" );
		}
		
		public void mouseReleased(MouseEvent e) {
			System.out.println("mouse released");
				}
			
		public void mouseClicked(MouseEvent e) {
			System.out.println("mouse clicked");
				}
			
		public void mouseEntered(MouseEvent e) {}
		
		public void mouseExited(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
