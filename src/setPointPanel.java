import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class setPointPanel extends JPanel {

    private JButton saveButton;
    private JTextField ClassName;
    private JTextField StudentName;
    private JTextField PointField;


    public setPointPanel() {
        //  setSize(300,500);



        Color myColor2 = new Color(69, 13, 7, 255);
        Color myColor = new Color(255,255,153);
        Color myColor3 = new Color(227, 140, 19, 129);



        setLayout(new BorderLayout(5,5));
        // JPanel panel = new JPanel(new BorderLayout(5, 5));
        setBackground(Color.white);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        // add(panel, BorderLayout.CENTER);


        JLabel label = new JLabel(" PLEAS ENTER INFORMATIN ");
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


        JLabel ClassNameLable = new JLabel(" Class Name : ");
        ClassNameLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        ClassName = new JTextField("");

        ClassName.addActionListener(handler);
        ClassName.addFocusListener(handler);

        JLabel StudentLabel1 = new JLabel(" StudentName : ");
        StudentName = new JTextField();
        StudentLabel1.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));


        StudentName.addActionListener(handler);
        StudentName.addFocusListener(handler);


        JLabel pointLabel2 = new JLabel(" POINT : ");
        pointLabel2.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        PointField = new JTextField();


        PointField.addActionListener(handler);
        PointField.addFocusListener(handler);

        JPanel fieldsPanel = new JPanel(new GridLayout(6, 1, 10, 10));
        fieldsPanel.setBackground(myColor);
        fieldsPanel.add(ClassNameLable);
        fieldsPanel.add(ClassName);
        fieldsPanel.add(StudentLabel1);
        fieldsPanel.add(StudentName);
        fieldsPanel.add(pointLabel2);
        fieldsPanel.add(PointField);
        fieldsPanel.setBorder(border);


        saveButton = new JButton("SET");
        saveButton.setForeground(Color.white);
        saveButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));


        saveButton.addActionListener(handler);

        int buttonWidth = saveButton.getPreferredSize().width;
        int buttonHeight = saveButton.getPreferredSize().height + 10;
        saveButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        saveButton.setBackground(myColor2);

        add(label, BorderLayout.NORTH);
        add(fieldsPanel, BorderLayout.CENTER);
        add(saveButton, BorderLayout.SOUTH);



    }


    private class ButtonHandler implements ActionListener, FocusListener {

        @Override
        public void actionPerformed(ActionEvent e) {

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


