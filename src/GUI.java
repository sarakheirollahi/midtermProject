

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class GUI {

    private JFrame loginForm;
    private JButton loginButton;
    private JTextField unameField;
    private JPasswordField psswdField;
    private JComboBox job;


    public GUI() {

        loginForm = new JFrame("LOGIN");
        loginForm.setLocationRelativeTo(null);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String comboBoxItems[] = {"Student", "Theacher", "admin"};
        job = new JComboBox(comboBoxItems);
        Color myColor = new Color(150 , 0, 250,67);
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBackground(myColor);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        loginForm.setContentPane(panel);
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


        JLabel unameLabel = new JLabel(" Username : ");
        unameField = new JTextField("");

        unameField.addActionListener(handler);
        unameField.addFocusListener(handler);

        JLabel psswdLabel = new JLabel(" Password : ");
        psswdField = new JPasswordField();

        psswdField.addActionListener(handler);
        psswdField.addFocusListener(handler);

        JPanel fieldsPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        fieldsPanel.setBackground(myColor);
        fieldsPanel.add(unameLabel);
        fieldsPanel.add(unameField);
        fieldsPanel.add(psswdLabel);
        fieldsPanel.add(psswdField);
        fieldsPanel.add(job);



        loginButton = new JButton("Login");

        loginButton.addActionListener(handler);

        int buttonWidth = loginButton.getPreferredSize().width;
        int buttonHeight = loginButton.getPreferredSize().height + 10;
        loginButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        loginButton.setBackground(myColor2);

        panel.add(label, BorderLayout.NORTH);
        panel.add(fieldsPanel, BorderLayout.CENTER);
        panel.add(loginButton, BorderLayout.SOUTH);
    }

    public void showGUI() {
        loginForm.pack();
        loginForm.setVisible(true);
    }

    private class ButtonHandler implements ActionListener, FocusListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(loginButton)) {
                System.out.println("Button");
            } else if (e.getSource().equals(unameField)) {
                System.out.println("User Field");
            } else if (e.getSource().equals(psswdField)) {
                System.out.println("Password Field");
            }

            String user = unameField.getText();
            String pwd = new String(psswdField.getPassword());
            if (user.equals(pwd)) {
                JOptionPane.showMessageDialog(loginForm, "Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(loginForm, "invalid username our password!", "Result", JOptionPane.ERROR_MESSAGE);
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
