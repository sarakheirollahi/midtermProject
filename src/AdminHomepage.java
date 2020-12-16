// Java program to show Example of CardLayout.
// in java. Importing different Package.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// class extends JFrame
public class AdminHomepage extends JFrame {

    // Initialization the value of
    // current card is 1 .
    private int currentCard = 1;

    // Declaration of objects
    // of CardLayout class.
    private CardLayout cl;

    public AdminHomepage()
    {
        Color myColor1 = new Color(0 , 150, 250);
        Color myColor2 = new Color(0 , 200, 250);
        Color myColor3 = new Color(0 , 200, 250,90);

        // Function to set visibility of JFrame
        setTitle("ADMIN HOMEPAGE");
        setSize(750, 550);
        JPanel cardPanel = new JPanel();

        cl = new CardLayout();
        cardPanel.setLayout(cl);

        proPanel jp1 = new proPanel();
        SetFood jp2 = new SetFood();
        AddMemberPlane jp3 = new AddMemberPlane();
        JPanel jp4 = new JPanel();


        JLabel jl1 = new JLabel("Card1");
        JLabel jl2 = new JLabel("Card2");
        JLabel jl3 = new JLabel("Card3");
        JLabel jl4 = new JLabel("Card4");


      //  jp1.add(jl1);
      //  jp2.add(jl2);
       // jp3.add(jl3);
        jp4.add(jl4);


        cardPanel.add(jp1, "1");
        cardPanel.add(jp2, "2");
        cardPanel.add(jp3, "3");
        cardPanel.add(jp4, "4");

        JPanel leftpanel = new JPanel(new BorderLayout());
        // Creating Object of "JPanel" class
        JPanel buttonPanel = new JPanel(new GridLayout(4,1,5,5));
        leftpanel.add(buttonPanel,BorderLayout.CENTER);
        buttonPanel.setBackground(Color.WHITE);
        JButton profiletBtn = new JButton("PROFILE");
        JButton nextBtn = new JButton("SHOW LIST");
        JButton foodBtn = new JButton("SET FOOD");
        JButton addBtn = new JButton("ADD MEMBER");

        profiletBtn.setBackground(myColor1);
        nextBtn.setBackground(myColor1);
        foodBtn.setBackground(myColor1);
        addBtn.setBackground(myColor1);

        profiletBtn.setForeground(Color.white);
        nextBtn.setForeground(Color.white);
        foodBtn.setForeground(Color.white);
        addBtn.setForeground(Color.white);

        profiletBtn.setFont(new Font("sansserif", Font.BOLD, 15));
        foodBtn.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
        addBtn.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
        nextBtn.setFont(new Font("Helvetica Neue", Font.BOLD, 15));

        ImageIcon accountlogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\admin.png");

        JLabel image = new JLabel();
        image.setIcon(accountlogo);
        leftpanel.add(image,BorderLayout.NORTH);

        buttonPanel.add(profiletBtn);
        buttonPanel.add(nextBtn);
        buttonPanel.add(foodBtn);
        buttonPanel.add(addBtn);


        profiletBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                cl.first(cardPanel);
                currentCard = 1;
            }
        });

        // add lastbtn in ActionListener
        addBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                cl.show(cardPanel,"3");

            }
        });

        // add nextbtn in ActionListener
        nextBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {

                // if condition apply
                if (currentCard < 4)
                {

                    // increment the value of currentcard by 1
                    currentCard += 1;

                    // show the value of currentcard
                    cl.show(cardPanel, "" + 2);
                }
            }
        });

        // add previousbtn in ActionListener
        foodBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                cl.first(cardPanel);
                currentCard = 1;
            }
        });

        // used to get content pane
        getContentPane().add(cardPanel, BorderLayout.CENTER);

        // used to get content pane
        getContentPane().add(leftpanel, BorderLayout.WEST);
    }

    // Main Method



}
