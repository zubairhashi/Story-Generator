import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class stories2 {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stories2 window = new stories2();
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
	public stories2() {
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


		
		story2();

	}



	public void story2() {


		String story2 = "<html>" + "Once upon a time, a farmer had a goose that laid one golden egg every day. The egg provided enough money for the farmer and his wife to support their daily needs. The farmer and his wife continued to be happy for a long time.\r\n"
				+ "\r\n"
				+ "But, one day, the farmer thought to himself, “Why should we take just one egg a day? Why can’t we take them all at once and make a lot of money?” The farmer told his wife his idea, and she foolishly agreed.\r\n"
				+ "\r\n"
				+ "Then, the next day, as the goose laid its golden egg, the farmer was quick with a sharp knife. He killed the goose and cut its stomach open, in the hopes of finding all its golden eggs. But, as he opened the stomach, the only thing he found was guts and blood.\r\n"
				+ "\r\n"
				+ "The farmer quickly realized his foolish mistake and proceeded to cry over his lost resource. As the days went on, the farmer and his wife became poorer and poorer. How jinxed and how foolish they were." + "<html>";			


		displaystoryLabel.setText(story2);



	}
}
