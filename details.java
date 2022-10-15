import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class details {

    checkSelection c = new checkSelection();


    JPanel panel = new JPanel();
    JFrame frame = new JFrame();




    public String genreName;
    public String genderName;

    public String ageName;

    public String charOne;


    //Label for Error Message

    JLabel errMessage = new JLabel("Please Choose an option");


    //Button for the finish story button
    JButton finished = new JButton("Finished");

/*    //Progress bar that shows how much you completed
    JProgressBar completion = new JProgressBar();*/


    //Prompts for question 1
    JLabel question1 = new JLabel("Choose between 1 of the 4 genres");
    JCheckBox cb1 = new JCheckBox("Fantasy");
    JCheckBox cb2 = new JCheckBox("Sci-Fi");
    JCheckBox cb3 = new JCheckBox("Mystery");
    JCheckBox cb4 = new JCheckBox("Tragedy");


    //Prompts for question 2
    JLabel question2 = new JLabel("What is your character's name?" + "(Optional)");
    JTextField charName = new JTextField();
    JButton set = new JButton("Set");
    JButton reset = new JButton("Reset");

    //Prompts for question 3
    JLabel question3 = new JLabel("Gender");
    JCheckBox male = new JCheckBox("Male");
    JCheckBox female = new JCheckBox("Female");


    //Prompts for question 4
    JLabel question4 = new JLabel("Add another character?" + "(Optional)");
    JCheckBox yesChar = new JCheckBox("Yes");
    JCheckBox noChar = new JCheckBox("No");

    JTextField charName2 = new JTextField();
    JButton set2 = new JButton("Set");
    JButton reset2 = new JButton("Reset");


//Prompts for question 5

    JLabel question5 = new JLabel("What age group is this story written for");

    JCheckBox adults = new JCheckBox("Adults (18+)");
    JCheckBox teens = new JCheckBox("Teens (12-17)");
    JCheckBox kids = new JCheckBox("Kids (All ages)");


    JButton adultsDetails = new JButton("Details");
    JButton teensDetails = new JButton("Details");
    JButton kidsDetails = new JButton("Details");


    //Displays all the options that you chose

    JLabel yourChoices = new JLabel("Your choices");
    JLabel printGenre = new JLabel("Choose a genre");

    JLabel printcharName = new JLabel("What is your character's name?");
    JLabel printGender = new JLabel("Choose a gender");
    JLabel printAge = new JLabel("Choose an age group");


    public void selectChar() {

        //Sets the frame dimensions and visibility
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        panel.setLayout(null);


//Calling the question methods
        q1();
        q2();
        q3();
        q4();
        q5();
        verify();
        displaySelected();


    }


    public void q1() {

        question1.setBounds(50, 50, 800, 50);
        question1.setVisible(true);
        panel.add(question1);

        cb1.setBounds(30, 85, 100, 50);
        cb1.setVisible(true);
        panel.add(cb1);

        cb2.setBounds(30, 200, 100, 50);
        cb2.setVisible(true);
        panel.add(cb2);

        cb3.setBounds(300, 85, 100, 50);
        cb3.setVisible(true);
        panel.add(cb3);

        cb4.setBounds(300, 200, 100, 50);
        cb4.setVisible(true);
        panel.add(cb4);

//Added buttons to button group so that one one could selected at a time
        ButtonGroup group1 = new ButtonGroup();
        group1.add(cb1);
        group1.add(cb2);
        group1.add(cb3);
        group1.add(cb4);


    }

    public void q2() {


        question2.setBounds(50, 400, 800, 50);
        question1.setVisible(true);
        panel.add(question2);


        charName.setBounds(50, 450, 150, 25);
        charName.setVisible(true);
        panel.add(charName);

        set.setBounds(10, 500, 100, 15);
        set.setVisible(true);
        panel.add(set);

        reset.setBounds(100, 500, 100, 15);
        reset.setVisible(true);
        panel.add(reset);


    }


    public void q3() {

        //Label for the 3rd question

        question3.setBounds(50, 700, 800, 50);
        question3.setVisible(true);
        panel.add(question3);

        male.setBounds(50, 750, 100, 50);
        male.setVisible(true);
        panel.add(male);


        female.setBounds(50, 800, 100, 50);
        female.setVisible(true);
        panel.add(female);


        ButtonGroup group2 = new ButtonGroup();
        group2.add(male);
        group2.add(female);


    }


    public void q4() {

//Label for the 4th question
        question4.setBounds(700, 50, 800, 50);
        question4.setVisible(true);
        panel.add(question4);

//textbox for the 2nd character's name
        charName2.setBounds(700, 90, 150, 25);
        charName2.setVisible(false);
        panel.add(charName2);


//reset and set buttons for the name
        set2.setBounds(690, 150, 100, 15);
        set2.setVisible(false);
        panel.add(set2);

        reset2.setBounds(780, 150, 100, 15);
        reset2.setVisible(false);
        panel.add(reset2);

//checkboxes which see if user wants to add a second character
        yesChar.setBounds(690, 200, 100, 50);
        yesChar.setVisible(true);
        panel.add(yesChar);


        noChar.setBounds(690, 260, 100, 50);
        noChar.setVisible(true);
        panel.add(noChar);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(yesChar);
        group3.add(noChar);


        yesChar.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    charName2.setVisible(true);
                    set2.setVisible(true);
                    reset2.setVisible(true);
                }
            }
        });


        noChar.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    charName2.setVisible(false);
                    set2.setVisible(false);
                    reset2.setVisible(false);
                }
            }
        });

    }


    public void q5() {

//Label for the 5th question
        question5.setBounds(700, 450, 800, 50);
        question5.setVisible(true);
        panel.add(question5);


        //checkboxes that allows user to choose age group
        adults.setBounds(690, 500, 180, 50);
        adults.setVisible(true);
        panel.add(adults);

        teens.setBounds(690, 550, 180, 50);
        teens.setVisible(true);
        panel.add(teens);

        kids.setBounds(690, 600, 180, 50);
        kids.setVisible(true);
        panel.add(kids);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(adults);
        group3.add(teens);
        group3.add(kids);


        //Buttons that display age group settings

        adultsDetails.setBounds(900, 515, 100, 20);
        adultsDetails.setVisible(true);
        panel.add(adultsDetails);

        teensDetails.setBounds(900, 565, 100, 20);
        teensDetails.setVisible(true);
        panel.add(teensDetails);

        kidsDetails.setBounds(900, 615, 100, 20);
        teensDetails.setVisible(true);
        panel.add(kidsDetails);


        adultsDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Violence, Substance use, Adult themes, Profanity", "Details", JOptionPane.WARNING_MESSAGE);
            }
        });


        teensDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Violence, Minimal substance use, Minimal profanity", "Details", JOptionPane.WARNING_MESSAGE);
            }
        });


        kidsDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Family friendly");
            }
        });


    }


    public void verify() {

        finished.setBounds(1500, 960, 100, 30);
        finished.setVisible(true);
        panel.add(finished);


        //If no option of questions is selected, error message will appear / if selection is made then error message disappears

        finished.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (cb1.isSelected() == false && cb2.isSelected() == false && cb3.isSelected() == false && cb4.isSelected() == false) {

                    errMessage.setBounds(85, 290, 800, 25);
                    error();
                } else if (male.isSelected() == false && female.isSelected() == false) {

                    errMessage.setBounds(50, 900, 800, 25);
                    error();

                } else if (adults.isSelected() == false && teens.isSelected() == false && kids.isSelected() == false) {

                    errMessage.setBounds(700, 700, 800, 25);
                    error();
                } else if (cb1.isSelected() == true || cb2.isSelected() == true || cb3.isSelected() == true || cb4.isSelected() == true) {

                    errMessage.setVisible(false);

                } else if (male.isSelected() == true || female.isSelected() == true) {

                    errMessage.setVisible(false);

                } else if (adults.isSelected() == true || teens.isSelected() == true || kids.isSelected() == true) {

                    errMessage.setVisible(false);

                }


                //When the finished button is clicked, the program checks if all the options are selected. If so, programs continues to confirmation page


                while (selectionomplete() == true){
                    finishedActionPerformed();
                }
            }
        });



    }


// This method displays all the options that are selected

    public void displaySelected() {


        //sets the dimensions and properties for the label that displays what you chose (header)

        yourChoices.setFont(new Font("Calibri", Font.BOLD, 20));
        yourChoices.setBounds(1200, 400, 800, 25);
        yourChoices.setForeground(Color.black);
        yourChoices.setVisible(true);
        panel.add(yourChoices);


        //sets the dimensions and properties for the label that prints the genre

        printGenre.setFont(new Font("Calibri", Font.ITALIC, 20));
        printGenre.setBounds(1200, 600, 800, 25);
        printGenre.setForeground(Color.black);
        printGenre.setVisible(true);
        panel.add(printGenre);


        //sets the dimensions and properties for the label that prints the gender

        printGender.setFont(new Font("Calibri", Font.ITALIC, 20));
        printGender.setBounds(1200, 760, 800, 25);
        printGender.setForeground(Color.black);
        printGender.setVisible(true);
        panel.add(printGender);


        //sets the dimensions and properties for the label that prints the age

        printAge.setFont(new Font("Calibri", Font.ITALIC, 20));
        printAge.setBounds(1200, 850, 800, 25);
        printAge.setForeground(Color.black);
        printAge.setVisible(true);
        panel.add(printAge);


//When the checkboxes in question 1 are selected it shows what you selected
        cb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cb1.isSelected() == true) {
                    genreName = "Fantasy";
                    printGenre.setText("Your genre is " + genreName);
                }
            }
        });


//When the checkboxes in question 2 are selected it shows what you selected
        cb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cb2.isSelected() == true) {
                    genreName = "Sci-Fi";
                    printGenre.setText("Your genre is " + genreName);
                }
            }
        });


//When the checkboxes in question 3 are selected it shows what you selected

        cb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cb3.isSelected() == true) {
                    genreName = "Mystery";
                    printGenre.setText("Your genre is " + genreName);
                }
            }
        });


//When the checkboxes in question 4 are selected it shows what you selected

        cb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cb4.isSelected() == true) {
                    genreName = "Tragedy";
                    printGenre.setText("Your genre is " + genreName);
                }
            }
        });


//When the checkboxes in gender checkboxes are selected it shows what you selected

        male.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (male.isSelected() == true) {
                    genderName = "Male";
                    printGender.setText("Your character's gender is " + genderName);
                }
            }
        });

        female.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (female.isSelected() == true) {
                    genderName = "Female";
                    printGender.setText("Your character's gender is " + genderName);
                }
            }
        });


        //checks what value is the first Characters name and prints it

        set.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                charOne = charName.getText();
                printcharName.setText("Your character's name is: " + charOne);

                if (charOne.isBlank()) {
                    printcharName.setText("There is no character name");
                }
            }
        });


        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printcharName.setText("What is your character's name?");

                charOne = "";
                charName.setText("");
            }
        });


//sets the dimensions and properties for the label that prints the first character's name
        printcharName.setFont(new Font("Calibri", Font.ITALIC, 20));
        printcharName.setBounds(1200, 680, 800, 25);
        printcharName.setForeground(Color.black);
        printcharName.setVisible(true);
        panel.add(printcharName);


//When the checkboxes in age group checkboxes are selected it shows what you selected

        adults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (adults.isSelected() == true) {
                    ageName = "adults";
                    printAge.setText("Your story is meant for " + ageName);
                }
            }
        });


        teens.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (teens.isSelected() == true) {
                    ageName = "teenagers";
                    printAge.setText("Your story is meant for " + ageName);
                }
            }
        });


        kids.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (kids.isSelected() == true) {
                    ageName = "kids";
                    printAge.setText("Your story is meant for " + ageName);
                }
            }
        });
    }




    //This boolean returns a true or false value on whether the user has finished choosing his/her choices and the program should continue and generate the story

public boolean selectionomplete(){


        if (cb1.isSelected() == true || cb2.isSelected() == true || cb3.isSelected() == true || cb4.isSelected() == true && male.isSelected() == true || female.isSelected() == true && adults.isSelected() == true || teens.isSelected() == true || kids.isSelected() == true){
            return true;
        }
return false;
}


    //This method sets up the confirmation popup. When the user has finished selecting his/her options, it displays everything the user has selected just to make sure and double chek
    public void finishedActionPerformed() {



        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to save these settings?", "Confirmation", JOptionPane.YES_NO_OPTION);

        /*switch (response){

            case JOptionPane.YES_OPTION:

                frame.dispose();

                c.generateStory();

                break;

                case JOptionPane.NO_OPTION:

                    break;
        }
*/
}


















/*    public void progressBar(){

//sets the bounds for the completion progress bar

        completion.setBounds(650, 950, 420,50);
        completion.setValue(0);
        completion.setStringPainted(true);
        completion.setVisible(true);
        panel.add(completion);
        fill();
    }



// Method increases the progess of the progress bar based on the question checked


    public void fill(){

        completion.setValue(6);

    }*/


    // Message that displays error message if an option isn't selected
    public void error() {
        //sets the dimensions and properties for the error message

        errMessage.setFont(new Font("Calibri", Font.BOLD, 20));
        errMessage.setForeground(Color.red);
        errMessage.setVisible(true);
        panel.add(errMessage);

    }


}









