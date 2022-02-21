package homework7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextMoving extends JFrame{
	
	public TextMoving() {
		setTitle("MouseListener와 KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("I Love Java");
		c.add(label);
		
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setLocation(10,10);
		label.addKeyListener(new MyKeyListener());

		//MymouseListener mouseListener = new MyMouseListener();
		label.addMouseListener(new MyMouseListener());
		label.addMouseMotionListener(new MyMouseListener());
	
		setSize(600, 400);
		setVisible(true);

		label.setFocusable(true);
		label.requestFocus();

	}

	public static void main(String[] args) {
		new TextMoving();
	}
}