package may13;
import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		c.setLayout(null); // 배치관리자 제거
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		// 9개의 버튼 컴포넌트를 생성하고 모두 동일한 크기로 설정
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼 생성
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b); // 버튼을 컨텐트 페인에 부착
		}
	
		setSize(300, 200);
		setVisible(true);
		}
	
	public static void main(String[] args) {
		new NullContainerEx();
	}

}
