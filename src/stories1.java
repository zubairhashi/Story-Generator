import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class stories1 {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stories1 window = new stories1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public stories1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	JLabel displaystoryLabel = new JLabel("");

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1259, 818);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		displaystoryLabel.setVerticalAlignment(SwingConstants.TOP);
		displaystoryLabel.setFont(new Font("Arial", Font.PLAIN, 26));


		displaystoryLabel.setBounds(10, 0, 1233, 578);
		frame.getContentPane().add(displaystoryLabel);


		
		story1();

	}

	public void story1() {

		String story1 = "<html>" + "There once was a king named Midas who did a good deed for a Satyr. And he was then granted a wish by Dionysus, the god of wine.\r\n"
				+ "\r\n"
				+ "For his wish, Midas asked that whatever he touched would turn to gold. Despite Dionysus’ efforts to prevent it, Midas pleaded that this was a fantastic wish, and so, it was bestowed.\r\n"
				+ "\r\n"
				+ "Excited about his newly-earned powers, Midas started touching all kinds of things, turning each item into pure gold.\r\n"
				+ "\r\n"
				+ "But soon, Midas became hungry. As he picked up a piece of food, he found he couldn’t eat it. It had turned to gold in his hand.\r\n"
				+ "\r\n"
				+ "Hungry, Midas groaned, “I’ll starve! Perhaps this was not such an excellent wish after all!”\r\n"
				+ "\r\n"
				+ "Seeing his dismay, Midas’ beloved daughter threw her arms around him to comfort him, and she, too, turned to gold. “The golden touch is no blessing,” Midas cried" + "<html>";


		displaystoryLabel.setText(story1);
	}

}
