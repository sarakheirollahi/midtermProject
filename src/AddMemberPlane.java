import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class AddMemberPlane extends JPanel {

        private JButton addButton;
        private JTextField unameField;
        private JPasswordField psswdField;
        private JComboBox job;


        public AddMemberPlane() {
            Color myColor = new Color(0 , 200, 250,90);
            Color myColor1 = new Color(0 , 200, 250);
            Color myColor2 = new Color(0 , 150, 250);



            String comboBoxItems[] = {"Student", "Theacher", "admin"};
            job = new JComboBox(comboBoxItems);
           // JPanel panel = new JPanel(new BorderLayout(5, 5));
           setLayout(new BorderLayout(5,5));
           setBackground(Color.white);
           setBorder(new EmptyBorder(5, 5, 5, 5));

            // Color myColor = new Color(150 , 0, 250);
            JLabel label = new JLabel(" Enter  Information ");
            label.setBackground(myColor1);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setOpaque(true);
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



            addButton = new JButton("ADD");

            addButton.addActionListener(handler);

            int buttonWidth = addButton.getPreferredSize().width;
            int buttonHeight = addButton.getPreferredSize().height + 10;
            addButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
            addButton.setBackground(myColor2);

            add(label, BorderLayout.NORTH);
            add(fieldsPanel, BorderLayout.CENTER);
            add(addButton, BorderLayout.SOUTH);
        }



        private class ButtonHandler implements ActionListener, FocusListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(addButton)) {
                    System.out.println("Button");
                } else if (e.getSource().equals(unameField)) {
                    System.out.println("User Field");
                } else if (e.getSource().equals(psswdField)) {
                    System.out.println("Password Field");
                }

                String user = unameField.getText();
                String pwd = new String(psswdField.getPassword());
                if (user.equals(pwd)) {
                   // JOptionPane.showMessageDialog(loginForm, "Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                  //  JOptionPane.showMessageDialog(loginForm, "invalid username our password!", "Result", JOptionPane.ERROR_MESSAGE);
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

