package homework8;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class UnitConverter extends JFrame {

	private String[] convertItems = {"inch -> cm", "ft -> m", "제곱미터 -> 평", "mile -> km"};
	
	public UnitConverter() {
		setTitle("Unit Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2,20,5));
		
		c.add(new JLabel("변환단위", SwingConstants.CENTER)); //1번
		
		JComboBox<String> strCombo = new JComboBox<String>(convertItems);
		c.add(strCombo); //2번
		
		JLabel before = new JLabel("1", SwingConstants.CENTER);
		c.add(before); //3번
		JLabel after = new JLabel("2", SwingConstants.CENTER);
		c.add(after); //4번
		

		JTextField from = new JTextField("0.0");
		c.add(from);
		from.setHorizontalAlignment(SwingConstants.RIGHT); //5번
		
		JTextField to = new JTextField("0.0");
		c.add(to);
		to.setHorizontalAlignment(SwingConstants.RIGHT); //6번
		to.setEditable(false);
		
		strCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] convert = convertItems[strCombo.getSelectedIndex()].split(" -> ");
                before.setText(convert[0]);
                after.setText(convert[1]);
                from.setText("0.0");
                to.setText("0.0");
            }
        }); //문자열 분리

        String[] convert = convertItems[strCombo.getSelectedIndex()].split(" -> ");
        before.setText(convert[0]);
        after.setText(convert[1]);
	
		from.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					float a = Float.parseFloat(from.getText());
					float b=0;

					switch (strCombo.getSelectedIndex()) {
					case 0:
						b = (float) (a*2.54);
						to.setText(String.format("%.2f", b));
						break;
					case 1:
						b = (float) (a * 0.3048);
						to.setText(String.format("%.2f", b));
						break;
					case 2:
						b = (float) (a * 0.3025);
						to.setText(String.format("%.2f", b));
						break;
					case 3:
						b = (float) (a * 1.609344);
						to.setText(String.format("%.2f", b));
						break;
					}
				}	
			}
		}); //단위변환 함수
		
		setSize(300,120);
		setVisible(true);	
		
	}

	public static void main(String[] args) {
		new UnitConverter();
	}
}
