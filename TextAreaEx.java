package may27;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame {
	
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20);
	private int i=0;

	public TextAreaEx() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요 "));
		c.add(tf); 
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				
				ta.append(t.getText() + "\n"); //텍스트필드의 문자열을 텍스트영역 창에 추가
				//ta.insert(t.getText() + "\n", 0); //텍스트필드의 문자열을 텍스트영역 창 첫번째 열에 추가
				t.setText(""); // 현재 텍스트 필드에 입력된 내용 지우기
				
				i++;
				if (i>=5) {
					ta.setText(""); //텍스트필드에 입력된 내용 지우기
					i=0;
				}
			}
		});
		
		setSize(300, 300);
		setVisible(true);
		}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
