// Java program to show Example of CardLayout.
// in java. Importing different Package.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

// class extends JFrame
public class TheacherHomePage extends JFrame {

    // Initialization the value of
    // current card is 1 .
    private int currentCard = 1;

    // Declaration of objects
    // of CardLayout class.
    private CardLayout cl;

    public TheacherHomePage()
    {
        Color myColor1 = new Color(69, 13, 7, 255);
        Color myColor2 = new Color(255,255,153);
        Color myColor3 = new Color(227, 140, 19, 129);

        // Function to set visibility of JFrame
        setTitle("ADMIN HOMEPAGE");
        setSize(950, 550);
        JPanel cardPanel = new JPanel();

        cl = new CardLayout();
        cardPanel.setLayout(cl);


        Class class1 =new Class(2,3,"hi","First","succes");
        Class class8 =new Class(2,3,"hi","First","succes");
        Class class5 =new Class(2,3,"hi","First","succes");
        Class class7 =new Class(2,3,"hi","First","succes");
        Class class6 =new Class(2,3,"hi","First","succes");
        Class class2 =new Class(2,3,"hi","First","succes");
        Class class3 =new Class(2,3,"hi","First","succes");
        Class class4 =new Class(2,3,"hi","First","succes");
        Class class9 =new Class(2,3,"hi","First","succes");
        ArrayList<Class> m =new ArrayList<>();
        m.add(class1);
        m.add(class2);
        m.add(class3);
        m.add(class4);
        m.add(class5);
        m.add(class6);
        m.add(class7);
        m.add(class8);
        m.add(class9);


        theacherProPanel jp1 = new theacherProPanel();
        addClassPanel jp2 = new addClassPanel();
        removeClassPanel jp3 = new removeClassPanel();
        setPointPanel jp4 = new setPointPanel();



        cardPanel.add(jp1, "1");
        cardPanel.add(jp2, "2");
        cardPanel.add(jp3, "3");
        cardPanel.add(jp4, "4");

        JPanel leftpanel = new JPanel(new BorderLayout());
        // Creating Object of "JPanel" class
        JPanel buttonPanel = new JPanel(new GridLayout(4,1,5,5));
        leftpanel.add(buttonPanel,BorderLayout.CENTER);
        buttonPanel.setBackground(myColor2);

        JButton profiletBtn = new JButton("PROFILE");
        JButton add_classBtn = new JButton("ADD CLASS");
        JButton remove_classBtn = new JButton("REMOVE CLASS");
        JButton students_pointBtn = new JButton("STUDENTS POINT");

        profiletBtn.setBackground(myColor1);
        add_classBtn.setBackground(myColor1);
        remove_classBtn.setBackground(myColor1);
        students_pointBtn.setBackground(myColor1);

        profiletBtn.setForeground(myColor3);
        add_classBtn.setForeground(myColor3);
        remove_classBtn.setForeground(myColor3);
        students_pointBtn.setForeground(myColor3);

        profiletBtn.setFont(new Font("sansserif", Font.BOLD, 15));
        add_classBtn.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
        remove_classBtn.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
        students_pointBtn.setFont(new Font("Helvetica Neue", Font.BOLD, 15));

        ImageIcon accountlogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\theach.jpg");

        JLabel image = new JLabel();
        image.setIcon(accountlogo);
        leftpanel.add(image,BorderLayout.NORTH);

        buttonPanel.add(profiletBtn);
        buttonPanel.add(add_classBtn);
        buttonPanel.add(remove_classBtn);
        buttonPanel.add(students_pointBtn);


        profiletBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                cl.first(cardPanel);
                currentCard = 1;
            }
        });

        add_classBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                cl.show(cardPanel,"2");

            }
        });

        // add lastbtn in ActionListener
        remove_classBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                cl.show(cardPanel,"3");

            }
        });

        // add nextbtn in ActionListener
        students_pointBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                cl.show(cardPanel,"4");

            }
        });

        // add previousbtn in ActionListener


        // used to get content pane
        getContentPane().add(cardPanel, BorderLayout.CENTER);

        // used to get content pane
        getContentPane().add(leftpanel, BorderLayout.WEST);
    }

    // Main Method



}
