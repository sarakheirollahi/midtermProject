

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Profile {

    private JFrame Profile;
    private JButton saveButton;
    private JButton saveButton2;
    private JPasswordField Password;
    private JPasswordField psswdField1;
    private JPasswordField psswdField2;
    private JTextField userField;
    private JTextField userField1;
    private JTextField userField2;
    private JMenuItem item;
    private JMenu proMenu;
    private JMenuBar proBar;
    private String studentUser;
    private String studentPass;



    public Profile(String user,String pass) {
        studentUser=user;
        studentPass=pass;

        Profile = new JFrame("CHANGE PASSWORD");
        Profile.setLocationRelativeTo(null);
      //  Profile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color myColor2 = new Color(160, 70, 200);
        Color myColor = new Color(150 , 0, 250,67);
        Color myColor1 = new Color(200 , 0, 250,150);



        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBackground(Color.white);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        Profile.setContentPane(panel);

        JLabel label = new JLabel(" Please Enter Your Information ");
        label.setBackground(myColor2);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        Border border = BorderFactory.createLineBorder(myColor2, 1);
        label.setBorder(border);

        int labelWidth = label.getPreferredSize().width;
        int labelHeight = label.getPreferredSize().height + 10;
        label.setPreferredSize(new Dimension(labelWidth, labelHeight));

        ButtonHandler handler = new ButtonHandler();


        JLabel unameLabel = new JLabel(" Current Password : ");
        Password = new JPasswordField("");

        Password.addActionListener(handler);
        Password.addFocusListener(handler);

        JLabel psswdLabel1 = new JLabel(" New Password : ");
        psswdField1 = new JPasswordField();

        psswdField1.addActionListener(handler);
        psswdField1.addFocusListener(handler);


        JLabel psswdLabel2 = new JLabel(" Confirm New Password : ");
        psswdField2 = new JPasswordField();

        psswdField2.addActionListener(handler);
        psswdField2.addFocusListener(handler);

        saveButton = new JButton("Save");

        saveButton.addActionListener(handler);

        int buttonWidth = saveButton.getPreferredSize().width;
        int buttonHeight = saveButton.getPreferredSize().height + 10;
        saveButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        saveButton.setBackground(myColor2);





        JPanel fieldsPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        fieldsPanel.setBackground(myColor);
        fieldsPanel.add(unameLabel);
        fieldsPanel.add(Password);
        fieldsPanel.add(psswdLabel1);
        fieldsPanel.add(psswdField1);
        fieldsPanel.add(psswdLabel2);
        fieldsPanel.add(psswdField2);
        fieldsPanel.add(saveButton);
        fieldsPanel.setBorder(border);




        ////////////////////change user


        label.setBackground(myColor2);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);

        label.setBorder(border);

        label.setPreferredSize(new Dimension(labelWidth, labelHeight));

        JLabel usernameLabel1 = new JLabel(" Current Username : ");
        userField = new JTextField("");

        userField.addActionListener(handler);
        userField.addFocusListener(handler);

        JLabel usernameLabel2 = new JLabel(" New Username : ");
        userField1 = new JTextField();

        userField1.addActionListener(handler);
        userField1.addFocusListener(handler);


        JLabel usernameLable3 = new JLabel(" Confirm New Username : ");
        userField2 = new JPasswordField();

        userField2.addActionListener(handler);
        userField2.addFocusListener(handler);


        saveButton2 = new JButton("Save");

        saveButton2.addActionListener(handler);

        saveButton2.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        saveButton2.setBackground(myColor2);



        JPanel fieldsPanel2 = new JPanel(new GridLayout(4, 2, 10, 10));
        fieldsPanel2.setBackground(myColor);
        fieldsPanel2.add(usernameLabel1);
        fieldsPanel2.add(userField);
        fieldsPanel2.add(usernameLabel2);
        fieldsPanel2.add(userField1);
        fieldsPanel2.add(usernameLable3);
        fieldsPanel2.add(userField2);
        fieldsPanel2.add(saveButton2);
        fieldsPanel2.setBorder(border);



        JPanel centerPanel = new JPanel(new GridLayout(1,2));

        centerPanel.add(fieldsPanel);
        centerPanel.add(fieldsPanel2);


        panel.add(label, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);


        item = new JMenuItem("Back To HomePage");
        proMenu = new  JMenu("Menue");
        proMenu.add(item);
        proBar = new JMenuBar();
        proBar.add(proMenu);
        Profile.setJMenuBar(proBar);


        item.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                Profile.setVisible(false);
            }
        });




    }

    public void showProfile() {
        Profile.pack();
        Profile.setSize(550,450);
        Profile.setLocation(100,80);
        Profile.setVisible(true);
    }

    public void closeProfile() {
        Profile.pack();
        Profile.setVisible(false);
    }
    private class ButtonHandler implements ActionListener, FocusListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(saveButton)) {
                System.out.println("Button");
            } else if (e.getSource().equals(Password)) {
                System.out.println("User Field");
            } else if (e.getSource().equals(psswdField1)) {
                System.out.println("Password Field");
            }
            else if (e.getSource().equals(psswdField2)) {
                System.out.println("Password Field2");
            }

            String pass = new String(Password.getPassword());
            String pwd = new String(psswdField1.getPassword());
            String pwd2 = new String(psswdField2.getPassword());

            String user = new String(userField.getText());
            String newuser = new String(userField1.getText());
            String newuser2 = new String(userField2.getText());

            if (e.getSource().equals(saveButton)) {
                if (pass.equals(loginPanel.univercity.findStudent(studentUser).getPass()) ){
                    if (pwd.equals(pwd2)){
                        studentPass=pwd;
                        loginPanel.univercity.findStudent(studentUser).setPass(pwd);
                        JOptionPane.showMessageDialog(saveButton, "Change Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);}
                    else {
                        JOptionPane.showMessageDialog(saveButton, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);}
                } else {
                    JOptionPane.showMessageDialog(saveButton, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);
                }}


            if (e.getSource().equals(saveButton2)) {
                if (user.equals(loginPanel.univercity.findStudent(studentUser).getName()) ){
                    if (newuser.equals(newuser2)){
                        loginPanel.univercity.findStudent(studentUser).setName(newuser);
                        studentUser=newuser;
                        JOptionPane.showMessageDialog(saveButton2, "Change Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);}
                    else {
                        JOptionPane.showMessageDialog(saveButton2, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);}
                } else {
                    JOptionPane.showMessageDialog(saveButton2, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);
                }}
        }

        @Override
        public void focusGained(FocusEvent e) {
            displayMessage("Focus gained", e);

        }

        @Override
        public void focusLost(FocusEvent e) {
            displayMessage("Focus lost", e);

        }

        void displayMessage(String prefix, FocusEvent e) {
            System.out.println(prefix
                    + (e.isTemporary() ? " (temporary):" : ":")
                    + e.getComponent().getClass().getName()
                    + "; Opposite component: "
                    + (e.getOppositeComponent() != null ? e.getOppositeComponent().getClass().getName()
                    : "null"));
        }
    }

}
