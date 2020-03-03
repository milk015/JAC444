package feb29;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ExerciseOne {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame frame = new JFrame("TestFrame");
		JButton button = new JButton("Change Colour");
		JPanel pan = new JPanel();
		//JPanel panTwo = new JPanel();
		JButton buttonTwo = new JButton("Cancel");
		pan.add(button);
		pan.add(buttonTwo);
		frame.add(pan);
		
		//panTwo.add(buttonTwo);
		//frame.add(panTwo);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			  {
				
			    pan.setBackground(Color.blue);
				
			  }
		});
		//frame.add(button);
		button.setForeground(Color.ORANGE);
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
		/*
		JFrame frameTwo = new JFrame("SecondTestFrame");
		frameTwo.setSize(300, 500);
		frameTwo.setVisible(true);
		frameTwo.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		*/

	}

}
