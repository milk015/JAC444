package feb29;

import java.awt.FlowLayout;

import javax.swing.*;

public class _02FlowLayoutFrame extends JFrame{
	
	
	public _02FlowLayoutFrame() {
		
		//FlowLayout myFlowLayout = new FlowLayout(FlowLayout.RIGHT,20,30);
		setLayout(new FlowLayout(FlowLayout.RIGHT,20,30));
		//JLabel label = new JLabel("First Name");
		//this.add(label);
		
		add(new JLabel("First Name"));// adds label to frame/This
		
		add(new JTextField(15));
		
		add(new JLabel("M1"));
		
		add(new JTextField(2));
		
		add(new JLabel("Last Name"));
		
		add(new JTextField(15));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_02FlowLayoutFrame frame = new _02FlowLayoutFrame();
		
		frame.setSize(350, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}

}
