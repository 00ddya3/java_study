package homework7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewFile extends JFrame {

	public NewFile() {
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		JLabel label = new JLabel("I Love Java");
		c.add(label);
		
		label.setFont(new Font("TimesRoman", Font.PLAIN, 10)); // 10 픽셀 크기
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("TimesRoman", Font.PLAIN, size+5)); 					
				}
				else if(e.getKeyChar() == '-') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("TimesRoman", Font.PLAIN, size-5)); 					
				}				
				
				
				else if(e.getKeyChar() == 'r') {
					JLabel la = (JLabel)e.getSource();
					la.setForeground(Color.red);
				} // r
				
				else if(e.getKeyChar() == 'g') {
					JLabel la = (JLabel)e.getSource();
					la.setForeground(Color.green);
				} // g
				
				else if(e.getKeyChar() == 'b') {
					JLabel la = (JLabel)e.getSource();
					la.setForeground(Color.blue);
				} // b
				
				else {
					JLabel la = (JLabel)e.getSource();
					la.setForeground(Color.black);
				} //default
				
			}
		});

		setSize(300,150);
		setVisible(true);
		
		label.setFocusable(true); // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); // 레이블에 키 입력 포커스 서정
	}
	
	
	public static void main(String[] args) {
		new NewFile();
	}


}
