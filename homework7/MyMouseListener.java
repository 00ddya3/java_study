package homework7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyMouseListener extends MouseAdapter {
	
	private Dimension labelSize;
	
	public void mousePressed(MouseEvent e) {
		
		JLabel la = (JLabel) e.getSource();
		Container c = la.getParent();
		
		int w = c.getWidth();
		int h = c.getHeight();

		if(e.getPoint().x < 0) 
			e.getPoint().x = 0;
		if(e.getPoint().y < 0) 
			e.getPoint().y = 0;
		
		if(e.getPoint().x + 100> w) 
			e.getPoint().x = w-100;
		if(e.getPoint().y+30 > h)
			e.getPoint().y = h-30;
		
		la.setLocation(e.getPoint().x, e.getPoint().y);
		
		/*
		la.setLocation(e.getPoint().x, e.getPoint().y);

	      if (e.getLocationOnScreen().x > 480)
	         la.setLocation(480, e.getPoint().y);
	      else if (e.getLocationOnScreen().x < 0)
	         la.setLocation(0, e.getPoint().y);

	      if (e.getLocationOnScreen().y > 330)
	         la.setLocation(e.getPoint().x, 340);
	      else if (e.getLocationOnScreen().y < 0)
	         la.setLocation(e.getPoint().x, 0); */

	}
		
	public void mouseDragged(MouseEvent e) { // 마우스가 드래깅되는 동안 계속 호출
		JLabel la = (JLabel) e.getSource();
		Container c = la.getParent();
		
		int w = c.getWidth();
		int h = c.getHeight();

		if(la.getLocationOnScreen().x < 0) 
			la.getLocationOnScreen().x = 0;
		if(la.getLocationOnScreen().y < 0) 
			la.getLocationOnScreen().y = 0;
		
		if(e.getPoint().x + 100> w) 
			e.getPoint().x = w-100;
		if(e.getPoint().y+30 > h)
			e.getPoint().y = h-30;
		
		la.setLocation(la.getLocationOnScreen().x/2 + e.getPoint().x, la.getLocationOnScreen().y/2 + e.getPoint().y);
		
	}	
}
	
	/*
	public static void main(String[] args) {
		new MyMouseListener();
	} */

//}

