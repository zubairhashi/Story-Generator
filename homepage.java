import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homepage {
    details d = new details();
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JLabel welcomeMessage = new JLabel("Welcome to Story Generator. Click below to generate story");
    JButton start = new JButton("Start your Story");


public void frontpage(){



    //Sets the frame dimensions and visibility
    frame.setSize(1920,1080);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    panel.setLayout(null);


}

public void frontDesign() {

    start.setLayout(null);
    start.setLocation(630,500);
    start.setSize(280,80);
    start.setFont(new Font("Consolas",Font.PLAIN,20));
    start.setVisible(true);
    panel.add(start);


    welcomeMessage.setBounds(600, 300, 800, 50);
    welcomeMessage.setVisible(true);
    panel.add(welcomeMessage);


    start.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            d.selectChar();

        }
    });

}

}
