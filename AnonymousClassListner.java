package may20;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListner extends JFrame {
	public AnonymousClassListner() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("익명클래스 테스트");
		JButton btn = new JButton("Action");
		c.add(label);
		c.add(btn);
	
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				setTitle(b.getText());
			}
		});
	
		setSize(350, 150);
		setVisible(true);
	}	

		public static void main(String [] args) {
			new AnonymousClassListner();
	}
}

