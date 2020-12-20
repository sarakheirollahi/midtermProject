

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IncrezAccount {

    private JFrame Profile;
    private JButton payButton;
    private JButton value1;
    private JButton value2;
    private JButton value3;
    private JPasswordField Password;
    private JPasswordField psswdField1;
    private JPasswordField psswdField2;
    private JPasswordField psswdField3;
    private JMenu proMenu;
    private JMenuBar proBar;
    private String user;


    public IncrezAccount(String user) {
         this.user =user;
        Profile = new JFrame("ACCOUNT");
        Profile.setLocationRelativeTo(null);


        Color myColor2 = new Color(160, 70, 200);
        Color myColor = new Color(150 , 0, 250,67);
        Color myColor1 = new Color(200 , 0, 250,150);



        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBackground(Color.white);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        Profile.setContentPane(panel);

        JLabel label = new JLabel(" Please Enter Your CreditCard Information ");
        label.setBackground(myColor2);
        label.setForeground(Color.white);
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        Border border = BorderFactory.createLineBorder(myColor2, 1);
        label.setBorder(border);

        int labelWidth = label.getPreferredSize().width;
        int labelHeight = label.getPreferredSize().height + 10;
        label.setPreferredSize(new Dimension(labelWidth, labelHeight));

        ButtonHandler handler = new ButtonHandler();


        JLabel unameLabel = new JLabel(" Card Number : ");
        Password = new JPasswordField("");

        Password.addActionListener(handler);
        Password.addFocusListener(handler);

        JLabel psswdLabel1 = new JLabel(" PassWord : ");
        psswdField1 = new JPasswordField();

        psswdField1.addActionListener(handler);
        psswdField1.addFocusListener(handler);


        JLabel psswdLabel2 = new JLabel(" Expiry date: ");
        psswdField2 = new JPasswordField();

        psswdField2.addActionListener(handler);
        psswdField2.addFocusListener(handler);

        JLabel psswdLabel3 = new JLabel(" CVV2: ");
        psswdField3 = new JPasswordField();

        psswdField3.addActionListener(handler);
        psswdField3.addFocusListener(handler);


        JPanel fieldsPanel = new JPanel(new GridLayout(4, 4, 10, 10));
        fieldsPanel.setBackground(myColor);
        fieldsPanel.add(unameLabel);
        fieldsPanel.add(Password);
        fieldsPanel.add(psswdLabel1);
        fieldsPanel.add(psswdField1);
        fieldsPanel.add(psswdLabel2);
        fieldsPanel.add(psswdField2);
        fieldsPanel.setBorder(border);
        fieldsPanel.add(psswdLabel3);
        fieldsPanel.add(psswdField3);
        fieldsPanel.setBorder(border);

       JPanel centerPanel = new JPanel(new BorderLayout(5,5));
       centerPanel.setBackground(Color.white);
       JPanel buttonPanel = new JPanel(new GridLayout(1,3,10,10));
       buttonPanel.setBackground(Color.white);
        value1 = new JButton("5$");
        value1.setBackground(myColor2);
        value1.setForeground(Color.white);
        value2 = new JButton("10$");
        value2.setBackground(myColor2);
        value2.setForeground(Color.white);
        value3 = new JButton("20$");
        value3.setBackground(myColor2);
        value3.setForeground(Color.white);


        payButton = new JButton("PAY");
        payButton.setForeground(Color.white);

        payButton.addActionListener(handler);

        int buttonWidth = payButton.getPreferredSize().width;
        int buttonHeight = payButton.getPreferredSize().height + 10;
        payButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        payButton.setBackground(myColor2);

        buttonPanel.add(value1);
        buttonPanel.add(value2);
        buttonPanel.add(value3);
        centerPanel.add(fieldsPanel,BorderLayout.CENTER);
        centerPanel.add(buttonPanel,BorderLayout.SOUTH);
        panel.add(label, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(payButton, BorderLayout.SOUTH);



        proMenu = new  JMenu("Back To Homepage");
        proBar = new JMenuBar();
        proBar.add(proMenu);
        Profile.setJMenuBar(proBar);
    }

    public void showIncrezAccount() {
        Profile.pack();
        Profile.setVisible(true);
    }

    private class ButtonHandler implements ActionListener, FocusListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(payButton)) {
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
            if (pass.equals(pwd)) {
                if (pwd.equals(pwd2)) {
                    if (value1.isSelected()) {
                    loginPanel.univercity.findStudent(user).increasAccount(5000);
                  //  saveUnivercity(loginPanel.univercity);
                    }
                    if (value2.isSelected()) {
                        loginPanel.univercity.findStudent(user).increasAccount(10000);
                       // saveUnivercity(loginPanel.univercity);
                    }
                    if (value2.isSelected()) {
                        loginPanel.univercity.findStudent(user).increasAccount(20000);
                       // saveUnivercity(loginPanel.univercity);
                    }
                        JOptionPane.showMessageDialog(payButton, "Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);
                    }
                else {
                    JOptionPane.showMessageDialog(payButton, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);}
            } else {
                JOptionPane.showMessageDialog(payButton, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);
            }
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
