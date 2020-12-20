import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;

public class StudentHomepage {
    private JFrame studenthomeframe;
    private JMenuItem item;
    private JMenu menu;
    private JMenuBar studentmenuBar;
    private String studentUser;
    private String studentPass;
   // private JPanel mainjpalen;

    public StudentHomepage(String user,String pass) {

        studentUser=user;
        studentPass=pass;

        Color myColor2 = new Color(200 , 0, 250);
        Color myColor1 = new Color(200 , 0, 250,150);
        Color myColor = new Color(150 , 0, 250,67);
        Color myColor3 = new Color(150 ,80 , 200,250);


        studenthomeframe = new JFrame("STUDENT HOMEPAGE");
        studenthomeframe.setLocationRelativeTo(null);
        studenthomeframe.setLocation(10,10);


        JPanel bakgroundPanel = new JPanel(new BorderLayout(40,40));
        bakgroundPanel.setBackground(Color.white);



         JPanel mainjpalen =new JPanel(new GridLayout(2,2,10,10));
       // mainjpalen.setBorder(new EmptyBorder(5, 5, 5, 5))
         mainjpalen.setBackground(Color.white);

         JLabel topLable = new JLabel("STUDENT  HOMEPAGE");
        topLable.setBackground(myColor3);
        topLable.setForeground(Color.white);
        topLable.setOpaque(true);
        topLable.setHorizontalAlignment(SwingConstants.CENTER);

        int toplablewidth = topLable.getPreferredSize().width;
        int toplableheight = topLable.getPreferredSize().height + 30;
        topLable.setPreferredSize(new Dimension(toplablewidth, toplableheight));
        topLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));

        JLabel bottomLable = new JLabel("AMIR KABIR");
        bottomLable.setBackground(myColor3);
        bottomLable.setFont(new Font("Monaco", Font.PLAIN, 20));
        bottomLable.setForeground(Color.white);
        bottomLable.setOpaque(true);
        bottomLable.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel westLable =new JLabel();
        int westlablewidth = topLable.getPreferredSize().width+40;
        int westlableheight = topLable.getPreferredSize().height + 30;
        westLable.setPreferredSize(new Dimension(westlablewidth, westlableheight));

        JLabel eastLable =new JLabel();
        int eastlablewidth = topLable.getPreferredSize().width+40;
        int eastlableheight = topLable.getPreferredSize().height + 30;
        eastLable.setPreferredSize(new Dimension(eastlablewidth, eastlableheight));


        bakgroundPanel.add(topLable,BorderLayout.NORTH);
        bakgroundPanel.add(bottomLable,BorderLayout.SOUTH);
        bakgroundPanel.add(westLable,BorderLayout.WEST);
        bakgroundPanel.add(eastLable,BorderLayout.EAST);



        bakgroundPanel.add(mainjpalen,BorderLayout.CENTER);

         studenthomeframe.setContentPane(bakgroundPanel);

         JPanel profile = new JPanel(new BorderLayout());
         JPanel classes = new JPanel(new BorderLayout());
         JPanel foods = new JPanel(new BorderLayout());
         JPanel account = new JPanel(new BorderLayout());

         JLabel foodphoto =new JLabel();
         JLabel classphoto =new JLabel();
         JLabel proflephoto =new JLabel();
         JLabel accountphoto =new JLabel();

        Border border = BorderFactory.createLineBorder(myColor3, 2);
      //  foodphoto.setBorder(border);
       // classphoto.setBorder(border);
       // proflephoto.setBorder(border);
       // accountphoto.setBorder(border);


         ImageIcon foodlogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\food.jpg");
         ImageIcon profilelogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\Profile.jpg");
         ImageIcon classlogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\Class.jpg");
         ImageIcon accountlogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\Account.jpg");

         foodphoto.setIcon(foodlogo);
         proflephoto.setIcon(profilelogo);
         classphoto.setIcon(classlogo);
         accountphoto.setIcon(accountlogo);

         JButton profileButton =new JButton("PROFILE");
         JButton classButton =new JButton("MANAGE CLASS");
         JButton foodButton =new JButton("FOOD RESERVATION");
         JButton accountButton =new JButton("My Account");

        profileButton.setForeground(Color.white);
        foodButton.setForeground(Color.white);
        classButton.setForeground(Color.white);
        accountButton.setForeground(Color.white);

        Profile proFrame = new Profile(studentUser,studentPass);
        classManage claasFrame = new classManage(studentUser);
        Food foodFrame = new Food(studentUser);
        IncrezAccount accountFrame = new IncrezAccount(studentUser);



        profileButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
             //  Profile proFrame = new Profile(studentUser,studentPass);
               proFrame.showProfile();

            }
        });

        classButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {

                claasFrame.showClassManage();


            }
        });

        foodButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                foodFrame.showFoodframe();

            }
        });
        accountButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                accountFrame.showIncrezAccount();
            }
        });

        int buttonWidth = profileButton.getPreferredSize().width;
        int buttonHeight = profileButton.getPreferredSize().height + 10;
        profileButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));


        int buttonWidth1 = foodButton.getPreferredSize().width;
        int buttonHeight1 = foodButton.getPreferredSize().height + 10;
        classButton.setPreferredSize(new Dimension(buttonWidth1, buttonHeight1));


        int buttonWidth2 = classButton.getPreferredSize().width;
        int buttonHeight2 = classButton.getPreferredSize().height + 10;
        foodButton.setPreferredSize(new Dimension(buttonWidth2, buttonHeight2));

        int buttonWidth3 = classButton.getPreferredSize().width;
        int buttonHeight3 = classButton.getPreferredSize().height + 10;
        accountButton.setPreferredSize(new Dimension(buttonWidth3, buttonHeight3));



        Border border1 = BorderFactory.createLineBorder(myColor3, 1);

        // profileButton.setBorder(border1);
        // foodButton.setBorder(border1);
       //  classButton.setBorder(border1);

         profileButton.setBackground(myColor3);
         classButton.setBackground(myColor3);
         foodButton.setBackground(myColor3);
         accountButton.setBackground(myColor3);

         profile.add(proflephoto,BorderLayout.CENTER);
         profile.add(profileButton,BorderLayout.SOUTH);

         classes.add(classphoto,BorderLayout.CENTER);
         classes.add(classButton,BorderLayout.SOUTH);

         foods.add(foodphoto,BorderLayout.CENTER);
         foods.add(foodButton,BorderLayout.SOUTH);

        account.add(accountphoto,BorderLayout.CENTER);
        account.add(accountButton,BorderLayout.SOUTH);


         item = new JMenuItem("LOG OUT");
         menu = new  JMenu("Menue");
         menu.add(item);
         studentmenuBar = new JMenuBar();
         studentmenuBar.add(menu);
         studenthomeframe.setJMenuBar(studentmenuBar);

         item.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                proFrame.closeProfile();
                claasFrame.closeClassManage();
                studenthomeframe.setVisible(false);
            }
        });



         mainjpalen.add(profile);
         mainjpalen.add(classes);
         mainjpalen.add(foods);
         mainjpalen.add(account);

    }
    public void showStudentpanel() {
        studenthomeframe.pack();
        studenthomeframe.setSize(750,550);
        studenthomeframe.setVisible(true);
    }

}

