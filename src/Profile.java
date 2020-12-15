

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
    private JPasswordField Password;
    private JPasswordField psswdField1;
    private JPasswordField psswdField2;
    private JMenu proMenu;
    private JMenuBar proBar;



    public Profile() {

        Profile = new JFrame("CHANGE PASSWORD");
        Profile.setLocationRelativeTo(null);
        Profile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color myColor = new Color(150 , 0, 250,67);

        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBackground(myColor);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        Profile.setContentPane(panel);
        // Color myColor = new Color(150 , 0, 250);
        Color myColor1 = new Color(200 , 0, 250,150);
        JLabel label = new JLabel(" Please Enter Your Information ");
        label.setBackground(myColor1);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        Color myColor2 = new Color(200 , 0, 250);
        Border border = BorderFactory.createLineBorder(myColor2, 2);
        label.setBorder(border);

        int labelWidth = label.getPreferredSize().width;
        int labelHeight = label.getPreferredSize().height + 10;
        label.setPreferredSize(new Dimension(labelWidth, labelHeight));

        ButtonHandler handler = new ButtonHandler();


        JLabel unameLabel = new JLabel(" Current Password : ");
        Password = new JPasswordField("");

        Password.addActionListener(handler);
        Password.addFocusListener(handler);

        JLabel psswdLabel1 = new JLabel("New Password : ");
        psswdField1 = new JPasswordField();

        psswdField1.addActionListener(handler);
        psswdField1.addFocusListener(handler);


        JLabel psswdLabel2 = new JLabel("Confirm New Password : ");
        psswdField2 = new JPasswordField();

        psswdField2.addActionListener(handler);
        psswdField2.addFocusListener(handler);

        JPanel fieldsPanel = new JPanel(new GridLayout(3, 3, 10, 10));
        fieldsPanel.setBackground(myColor);
        fieldsPanel.add(unameLabel);
        fieldsPanel.add(Password);
        fieldsPanel.add(psswdLabel1);
        fieldsPanel.add(psswdField1);
        fieldsPanel.add(psswdLabel2);
        fieldsPanel.add(psswdField2);



        saveButton = new JButton("Save");

        saveButton.addActionListener(handler);

        int buttonWidth = saveButton.getPreferredSize().width;
        int buttonHeight = saveButton.getPreferredSize().height + 10;
        saveButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        saveButton.setBackground(myColor2);

        panel.add(label, BorderLayout.NORTH);
        panel.add(fieldsPanel, BorderLayout.CENTER);
        panel.add(saveButton, BorderLayout.SOUTH);


        proMenu = new  JMenu("Back To Homepage");
        proBar = new JMenuBar();
        proBar.add(proMenu);
        Profile.setJMenuBar(proBar);
    }

    public void showProfile() {
        Profile.pack();
        Profile.setVisible(true);
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
            if (pass.equals(pwd)) {
                if (pwd.equals(pwd2)){
                JOptionPane.showMessageDialog(saveButton, "Change Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);}
                else {
                    JOptionPane.showMessageDialog(saveButton, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);}
            } else {
                JOptionPane.showMessageDialog(saveButton, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);
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
