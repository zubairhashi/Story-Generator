import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class stories4 {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stories4 window = new stories4();
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
	public stories4() {
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



		story4();

	}



	public void story4() {

		String story4 = "<html>" + "There was an old owl who lived in an oak tree. Every day, he observed incidents that occurred around him.\r\n"
				+ "\r\n"
				+ "Yesterday, he watched as a young boy helped an old man carry a heavy basket. Today, he saw a young girl shouting at her mother. The more he saw, the less he spoke.\r\n"
				+ "\r\n"
				+ "As the days went on, he spoke less but heard more. The old owl heard people talking and telling stories.\r\n"
				+ "\r\n"
				+ "He heard a woman saying an elephant jumped over a fence. He heard a man saying that he had never made a mistake.\r\n"
				+ "\r\n"
				+ "The old owl had seen and heard what happened to people. There were some who became better, some who became worse. But the old owl in the tree had become wiser, each and every day.\r\n"
				+ "\r\n"
				+  "<html>";	

		displaystoryLabel.setText(story4);
	}
}
