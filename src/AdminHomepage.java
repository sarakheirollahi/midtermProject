// Java program to show Example of CardLayout.
// in java. Importing different Package.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

// class extends JFrame
public class AdminHomepage extends JFrame {

    private CardLayout cl;
    private JMenu menu;
    private JMenuBar adminMnueBar;
    private JMenuItem adminMnueItem;


    public AdminHomepage()
    {
        Color myColor1 = new Color(0 , 150, 250);
        Color myColor2 = new Color(0 , 200, 250);
        Color myColor3 = new Color(0 , 200, 250,90);

        // Function to set visibility of JFrame
        setTitle("ADMIN HOMEPAGE");
        setSize(950, 550);
        JPanel cardPanel = new JPanel();

        cl = new CardLayout();
        cardPanel.setLayout(cl);


        proPanel jp1 = new proPanel();
        SetFood jp2 = new SetFood();
        AddMemberPlane jp3 = new AddMemberPlane();
        ShowListPanel jp4 = new ShowListPanel();


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

        adminMnueItem = new JMenuItem("LOG OUT");
        menu = new  JMenu("Menue");
        menu.add(adminMnueItem);
        adminMnueBar = new JMenuBar();
        adminMnueBar.add(menu);
        setJMenuBar(adminMnueBar);

        buttonPanel.add(profiletBtn);
        buttonPanel.add(foodBtn);
        buttonPanel.add(addBtn);
        buttonPanel.add(nextBtn);


        adminMnueItem.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                    {
                       setVisible(false);
                }
            });


        profiletBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {

                cl.first(cardPanel);

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
                ShowListPanel showListPanel =new ShowListPanel();
                cardPanel.add(showListPanel, "4");

                cl.show(cardPanel,"4");

            }
        });

        // add previousbtn in ActionListener
        foodBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                cl.show(cardPanel,"2");

            }
        });

        // used to get content pane
        getContentPane().add(cardPanel, BorderLayout.CENTER);

        // used to get content pane
        getContentPane().add(leftpanel, BorderLayout.WEST);
    }

    // Main Method



}
