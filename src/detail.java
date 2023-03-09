import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class detail {

	public JFrame frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					detail window = new detail();
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
	public detail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	stories1 s1 = new stories1();
	stories2 s2 = new stories2();
	stories3 s3 = new stories3();
	stories4 s4 = new stories4();

	JCheckBox cb1 = new JCheckBox("Fantasy");

	JCheckBox cb2 = new JCheckBox("Sci-Fi");

	JCheckBox cb3 = new JCheckBox("Mystery");

	JCheckBox cb4 = new JCheckBox("Tragedy");


	JCheckBox kidsCheckbox = new JCheckBox("Kids");

	JCheckBox teenCheckbox = new JCheckBox("Teens");

	JCheckBox adultCheckbox = new JCheckBox("Adults");


	JPanel panel1 = new JPanel();



	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 1327, 824);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		panel1.setBounds(0, 11, 1307, 774);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);



		// Section for the first question

		JLabel genreLabel = new JLabel("Choose one of the following genres");
		genreLabel.setBounds(41, 11, 209, 29);
		panel1.add(genreLabel);

		JCheckBox cb1 = new JCheckBox("Fantasy");
		cb1.setBounds(41, 63, 97, 23);
		panel1.add(cb1);

		JCheckBox cb2 = new JCheckBox("Sci-Fi");
		cb2.setBounds(41, 142, 97, 23);
		panel1.add(cb2);

		JCheckBox cb3 = new JCheckBox("Mystery");
		cb3.setBounds(202, 63, 97, 23);
		panel1.add(cb3);

		JCheckBox cb4 = new JCheckBox("Tragedy");
		cb4.setBounds(202, 142, 97, 23);
		panel1.add(cb4);

		ButtonGroup cBox1 = new ButtonGroup();
		cBox1.add(cb1);
		cBox1.add(cb2);
		cBox1.add(cb3);
		cBox1.add(cb4);



		//Section for the second question 

		JLabel ageLabel = new JLabel("Select the age group\r\n");
		ageLabel.setBounds(41, 281, 162, 23);
		panel1.add(ageLabel);

		JCheckBox kidsCheckbox = new JCheckBox("Kids");
		kidsCheckbox.setBounds(41, 381, 97, 23);
		panel1.add(kidsCheckbox);

		JCheckBox teenCheckbox = new JCheckBox("Teens");
		teenCheckbox.setBounds(41, 445, 97, 23);
		panel1.add(teenCheckbox);

		JCheckBox adultCheckbox = new JCheckBox("Adults");
		adultCheckbox.setBounds(41, 517, 97, 23);
		panel1.add(adultCheckbox);

		ButtonGroup cBox3 = new ButtonGroup();
		cBox3.add(kidsCheckbox);
		cBox3.add(teenCheckbox);
		cBox3.add(adultCheckbox);




		//Buttons that display age group settings

		JButton kidsDetails = new JButton("Details");
		kidsDetails.setBounds(161, 382, 100, 20);
		panel1.add(kidsDetails);

		JButton teensDetails = new JButton("Details");
		teensDetails.setBounds(161, 446, 100, 20);
		panel1.add(teensDetails);

		JButton adultsDetails = new JButton("Details");
		adultsDetails.setBounds(161, 518, 100, 20);
		panel1.add(adultsDetails);



		kidsDetails.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Family friendly");
			}
		});



		teensDetails.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Violence, Minimal substance use, Minimal profanity", "Details", JOptionPane.WARNING_MESSAGE);
			}
		});



		adultsDetails.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Violence, Substance use, Adult themes, Profanity", "Details", JOptionPane.WARNING_MESSAGE);
			}
		});




		JButton finishButton = new JButton("Finished");
		finishButton.setBackground(Color.WHITE);
		finishButton.setForeground(Color.BLACK);
		finishButton.setBounds(172, 696, 118, 29);
		panel1.add(finishButton);








		//Whenever one of the genre checkboxes are selected, dpending on how many age categories fit the genre, the availabe age groups
		//will only be able to be selected (Sample size of stories)

		cb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				kidsCheckbox.setEnabled(false);
				teenCheckbox.setEnabled(true);
				adultCheckbox.setEnabled(false);


			}
		});


		cb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				kidsCheckbox.setEnabled(true);
				teenCheckbox.setEnabled(false);
				adultCheckbox.setEnabled(false);
			}
		});


		cb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				kidsCheckbox.setEnabled(false);
				teenCheckbox.setEnabled(true);
				adultCheckbox.setEnabled(false);

			}
		});



		cb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				kidsCheckbox.setEnabled(false);
				teenCheckbox.setEnabled(false);
				adultCheckbox.setEnabled(true);



			}
		});


		finishButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if ( cb1.isSelected() == true || cb2.isSelected() == true || cb3.isSelected() == true || cb4.isSelected() == true && kidsCheckbox.isSelected() == true || teenCheckbox.isSelected() == true || adultCheckbox.isSelected() == true){


					if (cb1.isSelected() ) {
						
						frame.dispose();
						s1.frame.setVisible(true);

					}else if (cb2.isSelected()) {
						
						frame.dispose();	
						s4.frame.setVisible(true);

					}else if (cb3.isSelected()) {
						
						frame.dispose();
						s3.frame.setVisible(true);

					}else if (cb4.isSelected()) {
						
						frame.dispose();
						s2.frame.setVisible(true);

					}


				}else {

					JOptionPane.showMessageDialog(null,"Make sure to complete all the options","Warning", JOptionPane.WARNING_MESSAGE );
				}


			}
		});



	}









}





