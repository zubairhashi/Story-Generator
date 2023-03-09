import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class stories3 {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stories3 window = new stories3();
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
	public stories3() {
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




		story3();

	}



	public void story3() {
		String story3 = "<html>" + "Asha was getting frustrated and tired of life, so she asked her father what to do. Her father told her to bring an egg, two tea leaves, and a potato. He then brought out three vessels, filled them with water, and placed them on the stove.\r\n"
				+ "\r\n"
				+ "Once the water was boiling, he told Asha to place the items into each pot and keep an eye on them. After 10 minutes, he asked Asha to peel the egg, peel the potato, and strain the leaves. Asha was left confused.\r\n"
				+ "\r\n"
				+ "Her father explained, “Each item was placed into the same circumstance, boiling water. See how each responded differently?”\r\n"
				+ "\r\n"
				+ "He continued, “The egg was soft, but is now hard. The potato was hard, but is now soft. And the tea leaves, they changed the water itself.”\r\n"
				+ "\r\n"
				+ "The father then asked, “When adversity calls, we respond in the same manner as they have. Now, are you an egg, a potato, or tea leaves?”" + "<html>";

		displaystoryLabel.setText(story3);

	}
}