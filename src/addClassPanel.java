import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class addClassPanel extends JPanel {

    private JButton addButton;
    private JTextField unameField;
    private JTextField unitField;
    private JTextField limitField;
    private JComboBox job;


    public addClassPanel() {
      //  Color myColor = new Color(0 , 200, 250,90);
        //Color myColor1 = new Color(0 , 200, 250);
       // Color myColor2 = new Color(0 , 150, 250);
        Color myColor2 = new Color(69, 13, 7, 255);
        Color myColor = new Color(255,255,153);
      //  Color myColor3 = new Color(227, 140, 19, 129);





        String comboBoxItems[] = {"FIRST TIME", "SECOND TIME","THIRD TIME"};
        job = new JComboBox(comboBoxItems);
        job.setBackground(Color.white);
        job.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        job.setOpaque(true);
        // JPanel panel = new JPanel(new BorderLayout(5, 5));
        setLayout(new BorderLayout(5,5));
        setBackground(Color.white);
        setBorder(new EmptyBorder(5, 5, 5, 5));

        // Color myColor = new Color(150 , 0, 250);

        JLabel label = new JLabel("  ADD CLASS  ");
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


        JLabel unameLabel = new JLabel("CLASS NAME");
        unameField = new JTextField("");
        unameLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));


        unameField.addActionListener(handler);
        unameField.addFocusListener(handler);

        JLabel unitLabel = new JLabel("UNIT :");
        unitField = new JTextField();
        unitLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));

        unitField.addActionListener(handler);
        unitLabel.addFocusListener(handler);

        JLabel limitLabel = new JLabel("LIMIT :");
        limitField = new JTextField();
        limitLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));

        limitField.addActionListener(handler);
        limitLabel.addFocusListener(handler);

        JPanel fieldsPanel = new JPanel(new GridLayout(8, 1, 5, 5));
        fieldsPanel.setBackground(myColor);
        fieldsPanel.add(unameLabel);
        fieldsPanel.add(unameField);
        fieldsPanel.add(unitLabel);
        fieldsPanel.add(unitField);
        fieldsPanel.add(limitLabel);
        fieldsPanel.add(limitField);
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



    private class ButtonHandler implements ActionListener, FocusListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(addButton)) {
                System.out.println("Button");
            } else if (e.getSource().equals(unameField)) {
                System.out.println("User Field");
            } else if (e.getSource().equals(unitField)) {
                System.out.println("Password Field");
            }

            String user = unameField.getText();
          //  String pwd = new String(unitField.getPassword());
           // if (user.equals(pwd)) {
                // JOptionPane.showMessageDialog(loginForm, "Successful!", "Result", JOptionPane.INFORMATION_MESSAGE);
          //  } else {
        //        //  JOptionPane.showMessageDialog(loginForm, "invalid username our password!", "Result", JOptionPane.ERROR_MESSAGE);
            //}
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

