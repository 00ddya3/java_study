package homework7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyKeyListener extends KeyAdapter {

	public void keyPressed(KeyEvent e) {

		if (e.getKeyChar() == '+') {
			JLabel la = (JLabel) e.getSource();
			Font f = la.getFont();
			int size = f.getSize();
			la.setFont(new Font("Arial", Font.PLAIN, size + 5));
		}

		else if (e.getKeyChar() == '-') {
			JLabel la = (JLabel) e.getSource();
			Font f = la.getFont();
			int size = f.getSize();
			if (size <= 5)
				return;
			la.setFont(new Font("Arial", Font.PLAIN, size - 5));
		}

		else if (e.getKeyChar() == 'r') {
			JLabel la = (JLabel) e.getSource();
			la.setForeground(Color.red);
		} // r

		else if (e.getKeyChar() == 'g') {
			JLabel la = (JLabel) e.getSource();
			la.setForeground(Color.green);
		} // g

		else if (e.getKeyChar() == 'b') {
			JLabel la = (JLabel) e.getSource();
			la.setForeground(Color.blue);
		} // b

		else if (e.getKeyChar() == 'y') {
			JLabel la = (JLabel) e.getSource();
			la.setForeground(Color.yellow);
		} // y

		else {
			JLabel la = (JLabel) e.getSource();
			la.setForeground(Color.black);
		} // default

	}
}