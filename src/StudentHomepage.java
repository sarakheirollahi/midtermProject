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
    private JMenu menu;
    private JMenuBar studentmenuBar;
   // private JPanel mainjpalen;

    public StudentHomepage() {
        Color myColor2 = new Color(200 , 0, 250);
        Color myColor1 = new Color(200 , 0, 250,150);
        Color myColor = new Color(150 , 0, 250,67);
        Color myColor3 = new Color(100 ,0 , 200);


        studenthomeframe = new JFrame("STUDENT HOMEPAGE");
        studenthomeframe.setLocationRelativeTo(null);
        studenthomeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


         JPanel mainjpalen =new JPanel(new GridLayout(2,2,10,10));
       // mainjpalen.setBorder(new EmptyBorder(5, 5, 5, 5))
        mainjpalen.setBackground(myColor);

         studenthomeframe.setContentPane(mainjpalen);

         JPanel profile = new JPanel(new BorderLayout());
         JPanel classes = new JPanel(new BorderLayout());
         JPanel foods = new JPanel(new BorderLayout());
         JPanel account = new JPanel(new BorderLayout());

         JLabel foodphoto =new JLabel();
         JLabel classphoto =new JLabel();
         JLabel proflephoto =new JLabel();
         JLabel accountphoto =new JLabel();

        Border border = BorderFactory.createLineBorder(myColor3, 2);
        foodphoto.setBorder(border);
        classphoto.setBorder(border);
        proflephoto.setBorder(border);
        accountphoto.setBorder(border);


         ImageIcon foodlogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\food.jpg");
         ImageIcon profilelogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\Class.jpg");
         ImageIcon classlogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\Profile.jpg");
         ImageIcon accountlogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\Account.jpg");

         foodphoto.setIcon(foodlogo);
         proflephoto.setIcon(profilelogo);
         classphoto.setIcon(classlogo);
         accountphoto.setIcon(accountlogo);

         JButton profileButton =new JButton("PROFILE");
         JButton classButton =new JButton("MANAGE CLASS");
         JButton foodButton =new JButton("FOOD RESERVATION");
         JButton accountButton =new JButton("My Account");


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

         profileButton.setBackground(myColor2);
         classButton.setBackground(myColor2);
         foodButton.setBackground(myColor2);
         accountButton.setBackground(myColor2);

         profile.add(proflephoto,BorderLayout.CENTER);
         profile.add(profileButton,BorderLayout.SOUTH);

         classes.add(classphoto,BorderLayout.CENTER);
         classes.add(classButton,BorderLayout.SOUTH);

         foods.add(foodphoto,BorderLayout.CENTER);
         foods.add(foodButton,BorderLayout.SOUTH);

        account.add(accountphoto,BorderLayout.CENTER);
        account.add(accountButton,BorderLayout.SOUTH);

         menu = new  JMenu("Exite");
         studentmenuBar = new JMenuBar();
         studentmenuBar.add(menu);
         studenthomeframe.setJMenuBar(studentmenuBar);



         mainjpalen.add(profile);
         mainjpalen.add(classes);
         mainjpalen.add(foods);
         mainjpalen.add(account);

    }
    public void showStudentpanel() {
        studenthomeframe.pack();
        studenthomeframe.setVisible(true);
    }

}

