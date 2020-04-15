package assignmentThree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TouchTypeKeyboard extends JFrame implements KeyListener{

	//Keyboard data in string(by row) 
	//push used to create the keyboard structure/layout ******Not Working
	//Using Fill instead 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String bottomRow[] = {"Fn","Cont","Opt","Com","fill","fill","fill","fill","space","Com","Opt","<","v",">"};
	String secondRow[] = {"fill","Shift", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "/", "^","fill","Shift" };
	String thirdRow[] = { "Caps", "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "\"","fill", "Enter" };
	String fourthRow[] = { "fill","Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\" };
	String topRow[] = { "~", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+", "fill",
	"BackSpace" };

	String text = "";

	//shift presses
	String shiftNotPressed = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
	String shiftSpecialChar = "~-+[]\\;',.?";
	int keyIndex;


	JTextArea inputs = new JTextArea();
	Map<Integer, JButton> map = new HashMap<>();
	JButton bottom[];
	JButton second[];
	JButton third[];
	JButton fourth[];
	JButton top[];


	int keycode;

	Color cc = new JButton().getBackground();//for key highlight


	public TouchTypeKeyboard() {

		super("TouchTypeKeyboard");

		gradientBg();

		init();

	}

	public final void gradientBg(){ 

		JPanel contentPane = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override 
			protected void paintComponent(Graphics grphcs) {
				Graphics2D g2d = (Graphics2D) grphcs;
				Dimension d = this.getSize();
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);

				GradientPaint gp = new GradientPaint(0, 0, getBackground().brighter(),
						0, d.height, getBackground().darker().darker());

				g2d.setPaint(gp);
				g2d.fillRect(0, 0, d.width, d.height);

				super.paintComponent(grphcs);
			}
		};
		contentPane.setOpaque(false);
		setContentPane(contentPane);

	}

	public final void init() {

		//Top Info as described on assignment
		JLabel info = new JLabel("<html>&nbsp;&nbsp;Type some text using your keyboard. The Keys" 
				+ " you press will be highlighted and text will be displayed."
				+ "<br>&nbsp;&nbsp;Note: Clicking the buttons with your"
				+" mouse will not perform any action. Made By Jorge Bejarano<br><br> </html>");

		setLayout(new BorderLayout());

		JPanel jpNorth = new JPanel();
		JPanel jpEast = new JPanel();
		JPanel jpWest = new JPanel();
		JPanel jpCenter = new JPanel();
		JPanel jpKeyboard = new JPanel(new GridBagLayout());
		JPanel jpNote = new JPanel();

		//adding panels
		add(jpNorth, BorderLayout.NORTH);
		add(jpNote);
		add(jpWest, BorderLayout.WEST);
		add(jpEast,BorderLayout.EAST);
		add(jpCenter, BorderLayout.CENTER);
		add(jpKeyboard, BorderLayout.SOUTH);

		//setting up the layout
		jpNorth.setLayout(new BorderLayout());
		jpNorth.add(info, BorderLayout.SOUTH);
		jpCenter.setLayout(new BorderLayout());
		jpCenter.add(inputs, BorderLayout.CENTER);
		jpCenter.setPreferredSize(new Dimension(300,200));

		//buttons

		// got an odd error with this structure of init
		//ask Q in next class
		/*
    	bottom = new JButton[bottomRow.length];
    	addKeys(jpKeyboard,4, bottomRow, bottom);
    	second = new JButton[secondRow.length];
    	addKeys(jpKeyboard,3, secondRow, second);
    	third = new JButton[thirdRow.length];
    	addKeys(jpKeyboard,2, thirdRow, third);
    	fourth = new JButton[fourthRow.length];
    	addKeys(jpKeyboard,1, fourthRow, fourth);
    	top = new JButton[topRow.length];
    	addKeys(jpKeyboard,0, topRow, top);
		 */

		bottom = new JButton[bottomRow.length];
		second = new JButton[secondRow.length];
		third = new JButton[thirdRow.length];
		fourth = new JButton[fourthRow.length];
		top = new JButton[topRow.length];

		addKeys(jpKeyboard,4, bottomRow, bottom);
		addKeys(jpKeyboard,3, secondRow, second);
		addKeys(jpKeyboard,2, thirdRow, third);
		addKeys(jpKeyboard,1, fourthRow, fourth);
		addKeys(jpKeyboard,0, topRow, top);

		//keyboard size
		jpKeyboard.setPreferredSize(new Dimension(250,170));

		info.setOpaque(false);
		jpNote.setOpaque(false);
		jpWest.setOpaque(false);
		jpEast.setOpaque(false);
		jpNorth.setOpaque(false);
		jpCenter.setOpaque(false);
		jpKeyboard.setOpaque(false);


		//Set MISC
		inputs.addKeyListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//testing keyboard layout
		//this.setResizable(true);
		//ask how set sizing dynamically
		this.setResizable(false);
		this.getContentPane().setPreferredSize(new Dimension(1150, 310));
		pack();
		this.toFront();
		this.setVisible(true);
	}



	public static void main(String[] args) {

		TouchTypeKeyboard a = new TouchTypeKeyboard();

	}


	protected final void addKeys(JPanel parent, int row, String[] keys, JButton[] buttons) {

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridy = row;
		gbc.gridx = 0;
		gbc.fill = GridBagConstraints.BOTH;

		int x = 0;
		for (int index = 0; index < keys.length; index++) {
			String key = keys[index];
			if ("blank".equalsIgnoreCase(key)) {
				gbc.gridx++;
			} else if ("fill".equalsIgnoreCase(key)) {
				gbc.gridwidth++;
				x++;
			} else {
				JButton btn = new JButton(key);
				buttons[index] = btn;
				parent.add(btn, gbc);
				gbc.gridx += x + 1;
				gbc.gridwidth = 1;
				x = 0;

				btn.setBackground(Color.WHITE);
				map.put(getKeyCode(key), btn);
			}
		}
	}


	@Override
	public void keyReleased(KeyEvent kEvnt) {

		keycode = kEvnt.getKeyCode();
		text = String.format("%s", KeyEvent.getKeyText(keycode));

		//getBackground();

		JButton btn = map.get(keycode);
		if (btn != null) {
			map.get(keycode).setBackground(Color.WHITE);
		}

	}

	@Override
	public void keyPressed(KeyEvent kEvnt) {

		keycode = kEvnt.getKeyCode();
		text = String.format("%s", KeyEvent.getKeyText(keycode));

		JButton btn = map.get(keycode);
		if (btn != null) {
			map.get(keycode).setBackground(new Color(100,200,240));
		}

	}


	@Override
	public void keyTyped(KeyEvent kEvnt) {

		text = String.format("%s", kEvnt.getKeyChar());

	}

	private int getKeyCode(String key) {

		switch (key) {
		case "BackSpace":
			return KeyEvent.VK_BACK_SPACE;
		case "Tab":
			return KeyEvent.VK_TAB;
		case "Caps":
			return KeyEvent.VK_CAPS_LOCK;
		case "Enter":
			return KeyEvent.VK_ENTER;
		case "Shift":
			return KeyEvent.VK_SHIFT;
		case "":
			return KeyEvent.VK_SPACE;
		case "+":
			return KeyEvent.VK_EQUALS;
		case ":":
			return KeyEvent.VK_SEMICOLON;
		case "\"":
			return KeyEvent.VK_QUOTE;
		case "?":
			return KeyEvent.VK_SLASH;
		case "~":
			return KeyEvent.VK_BACK_QUOTE;
		case "^":
			return KeyEvent.VK_UP;
		case "v":
			return KeyEvent.VK_DOWN;
		case "<":
			return KeyEvent.VK_LEFT;
		case ">":
			return KeyEvent.VK_RIGHT;
		default:
			return (int) key.charAt(0);
		}

	}

}
