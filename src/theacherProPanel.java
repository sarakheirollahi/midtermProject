import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class theacherProPanel extends JPanel {

    private JButton saveButton;
    private JButton saveButton2;
    private JPasswordField Password;
    private JPasswordField psswdField1;
    private JPasswordField psswdField2;
    private String userName;
    private String passWord;
    private JTextField user;
    private JTextField user1;
    private JTextField user2;


    public theacherProPanel(String userName,String passWord) {
        //  setSize(300,500);

         this.passWord =passWord;
         this.userName =userName;


        Color myColor2 = new Color(69, 13, 7, 255);
        Color myColor = new Color(255,255,153);
        Color myColor3 = new Color(227, 140, 19, 129);



        setLayout(new BorderLayout(5,5));
        // JPanel panel = new JPanel(new BorderLayout(5, 5));
        setBackground(myColor);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        // add(panel, BorderLayout.CENTER);


        JLabel label = new JLabel(" Please Enter Your Information ");
        label.setBackground(myColor2);
        label.setForeground(Color.white);
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        Border border = BorderFactory.createLineBorder(myColor2, 1);
        label.setBorder(border);

        int labelWidth = label.getPreferredSize().width;
        int labelHeight = label.getPreferredSize().height + 10;
        label.setPreferredSize(new Dimension(labelWidth, labelHeight));

        ButtonHandler handler = new ButtonHandler();


        JLabel unameLabel = new JLabel(" Current Password : ");
        unameLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        Password = new JPasswordField("");

        Password.addActionListener(handler);
        Password.addFocusListener(handler);

        JLabel psswdLabel1 = new JLabel(" New Password : ");
        psswdField1 = new JPasswordField();
        psswdLabel1.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));


        psswdField1.addActionListener(handler);
        psswdField1.addFocusListener(handler);


        JLabel psswdLabel2 = new JLabel(" Confirm New Password : ");
        psswdLabel2.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        psswdField2 = new JPasswordField();


        psswdField2.addActionListener(handler);
        psswdField2.addFocusListener(handler);

        saveButton = new JButton("Chang");
        saveButton.setForeground(Color.white);
        saveButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        saveButton.addActionListener(handler);


        JPanel fieldsPanel = new JPanel(new GridLayout(7, 1, 10, 10));
        fieldsPanel.setBackground(myColor);
        fieldsPanel.add(unameLabel);
        fieldsPanel.add(Password);
        fieldsPanel.add(psswdLabel1);
        fieldsPanel.add(psswdField1);
        fieldsPanel.add(psswdLabel2);
        fieldsPanel.add(psswdField2);
        fieldsPanel.add(saveButton);
        fieldsPanel.setBorder(border);




        int buttonWidth = saveButton.getPreferredSize().width;
        int buttonHeight = saveButton.getPreferredSize().height + 10;
        saveButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        saveButton.setBackground(myColor2);

        /////////////////////


        JLabel unameLabel2 = new JLabel(" Current Username : ");
        unameLabel2.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        user = new JTextField();

        user.addActionListener(handler);
        user.addFocusListener(handler);

        JLabel userLabel1 = new JLabel(" New Username : ");
        user1 = new JTextField();
        userLabel1.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));


        user1.addActionListener(handler);
        user1.addFocusListener(handler);


        JLabel userLabel2 = new JLabel(" Confirm New Username : ");
        userLabel2.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        user2 = new JTextField();


        user2.addActionListener(handler);
        user2.addFocusListener(handler);

        JPanel fieldsPanel2 = new JPanel(new GridLayout(7, 1, 10, 10));
        fieldsPanel2.setBackground(myColor);
        fieldsPanel2.add(unameLabel2);
        fieldsPanel2.add(user);
        fieldsPanel2.add(userLabel1);
        fieldsPanel2.add(user1);
        fieldsPanel2.add(userLabel2);
        fieldsPanel2.add(user2);
        fieldsPanel2.setBorder(border);


        saveButton2 = new JButton("Chang");
        saveButton2.setForeground(Color.white);
        saveButton2.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        saveButton2.addActionListener(handler);
        saveButton2.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        saveButton2.setBackground(myColor2);
        fieldsPanel2.add(saveButton2);

        JPanel centerpanel = new JPanel(new GridLayout(1,2,5,5));
        centerpanel.add(fieldsPanel);
        centerpanel.add(fieldsPanel2);



        add(label, BorderLayout.NORTH);
        add(centerpanel, BorderLayout.CENTER);



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

            /////////////change  passs
            if (e.getSource().equals(saveButton)) {
                if (pass.equals(loginPanel.univercity.findThecher(userName).getPassWord()) ){
                    if (pwd.equals(pwd2)){
                        passWord=pwd;
                        loginPanel.univercity.findThecher(userName).setPassWord(pwd);
                        JOptionPane.showMessageDialog(saveButton, "Change Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);}
                    else {
                        JOptionPane.showMessageDialog(saveButton, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);}
                } else {
                    JOptionPane.showMessageDialog(saveButton, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);
                }}
            ////////////////change username
            String name = user.getText();
            String name1 = user1.getText();
            String name2 = user2.getText();
            if (e.getSource().equals(saveButton2)) {
                if (name.equals(userName)) {
                    if (name1.equals(name2)){
                        loginPanel.univercity.findThecher(userName).setUserName(name1);
                        userName=name2;
                        JOptionPane.showMessageDialog(saveButton2, "Change Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);}
                    else {
                        JOptionPane.showMessageDialog(saveButton2, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);}
                } else {
                    JOptionPane.showMessageDialog(saveButton2, "Failed!", "Result", JOptionPane.ERROR_MESSAGE);
                }
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


