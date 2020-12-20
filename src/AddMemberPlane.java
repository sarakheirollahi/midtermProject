import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
////this class is jpanel for admin to set add new mwmber
public class AddMemberPlane extends JPanel {

        private JButton addButton;
        private JTextField unameField;
        private JPasswordField psswdField;
        private JComboBox job;


        public AddMemberPlane() {


            Color myColor = new Color(0 , 200, 250,90);
            Color myColor1 = new Color(0 , 200, 250);
            Color myColor2 = new Color(0 , 150, 250);



            String comboBoxItems[] = {"Student", "Theacher"};
            job = new JComboBox(comboBoxItems);
            job.setBackground(Color.white);
            job.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
            job.setOpaque(true);
           // JPanel panel = new JPanel(new BorderLayout(5, 5));
           setLayout(new BorderLayout(5,5));
           setBackground(Color.white);
           setBorder(new EmptyBorder(5, 5, 5, 5));

            // Color myColor = new Color(150 , 0, 250);

            JLabel label = new JLabel("  Enter  Information ");
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


            JLabel unameLabel = new JLabel(" Username : ");
            unameField = new JTextField("");
            unameLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));


            unameField.addActionListener(handler);
            unameField.addFocusListener(handler);

            JLabel psswdLabel = new JLabel(" Password : ");
            psswdField = new JPasswordField();
            psswdLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));

            psswdField.addActionListener(handler);
            psswdField.addFocusListener(handler);

            JPanel fieldsPanel = new JPanel(new GridLayout(8, 1, 5, 5));
            fieldsPanel.setBackground(myColor);
            fieldsPanel.add(unameLabel);
            fieldsPanel.add(unameField);
            fieldsPanel.add(psswdLabel);
            fieldsPanel.add(psswdField);
            fieldsPanel.add(job);



            addButton = new JButton("ADD");
            addButton.setForeground(Color.white);
            addButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
            addButton.addActionListener(handler);

            int buttonWidth = addButton.getPreferredSize().width;
            int buttonHeight = addButton.getPreferredSize().height + 10;
            addButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
            addButton.setBackground(myColor2);

            add(label, BorderLayout.NORTH);
            add(fieldsPanel, BorderLayout.CENTER);
            add(addButton, BorderLayout.SOUTH);


        }



        private class ButtonHandler  implements ActionListener, FocusListener {


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
                Object field = job.getSelectedItem();

              if (field =="Student") {
                  if (!loginPanel.univercity.chekStudent(user)) {
                      loginPanel.univercity.addStudent(user,pwd);

                      JOptionPane.showMessageDialog(addButton, "Add Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);

                  }
                 else if (loginPanel.univercity.chekStudent(user)){
                     JOptionPane.showMessageDialog(addButton, "usernam already exit", "FAILED", JOptionPane.ERROR_MESSAGE);}
              }
                else{
                  if (!loginPanel.univercity.chekThecher(user)) {
                      loginPanel.univercity.addTheacher(user,pwd);

                      JOptionPane.showMessageDialog(addButton, "Add Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else {JOptionPane.showMessageDialog(addButton, " usernam already exit", "FAILED", JOptionPane.ERROR_MESSAGE);}
              }}


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

