
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.IconView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class Food {
    private JFrame foodframe;
    private JMenu foodMenu;
    private JMenuBar foodbar;
    private JButton setButton;
    private String userName;
    private String[] foodweek;



    public Food(String userName){
    this.userName=userName;

    foodweek=new String[loginPanel.univercity.getFood().length];

        foodweek =loginPanel.univercity.getFood();


        Color myColor4 = new Color(160 ,70 , 180);
        Color myColor3 = new Color(200 , 0, 220);
        Color myColor2 = new Color(200 , 100, 250,250);
        Color myColor1  = new Color(150 , 0, 250,30);
        Color myColor = new Color(250 , 100, 250,100);




     //   this.account=account;
        foodframe = new JFrame();
       // foodframe.setSize(700,700);
        setButton = new JButton("SET");
        setButton.setForeground(Color.WHITE);
        setButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));

        JLabel foodphoto =new JLabel();
        Border border = BorderFactory.createLineBorder(myColor4, 2);
      //  foodphoto.setBorder(border);
        ImageIcon foodlogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\food2.jpg");
        foodphoto.setIcon(foodlogo);

        JPanel mainPanel = new JPanel(new BorderLayout(20,20));

       // mainPanel.add(foodphoto,BorderLayout.EAST);

        foodframe.setContentPane(mainPanel);

        int buttonWidth9 = setButton.getPreferredSize().width;
        int buttonHeight9 = setButton.getPreferredSize().height + 10;
        setButton.setPreferredSize(new Dimension(buttonWidth9, buttonHeight9));
        setButton.setBackground(myColor4);
        mainPanel.add(setButton,BorderLayout.SOUTH);

        JLabel topLable = new JLabel(" FOOD SCHUDLE                                                 "+"      ACCOUNT :  "+
                loginPanel.univercity.findStudent(userName).getAccount());
        int toplablewidth = topLable.getPreferredSize().width;
        int toplableheight = topLable.getPreferredSize().height + 30;
        topLable.setPreferredSize(new Dimension(toplablewidth, toplableheight));
        topLable.setBackground(myColor4);
        topLable.setForeground(Color.WHITE);
        topLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        topLable.setOpaque(true);
        topLable.setHorizontalAlignment(SwingConstants.LEFT);

        mainPanel.add(topLable,BorderLayout.NORTH);

        JPanel foodTable = new JPanel(new GridLayout(8,2,5,5));
       // foodTable.setBackground(Color.LIGHT_GRAY);

        JCheckBox day1 =new JCheckBox(foodweek[0]);
        day1.setHorizontalTextPosition(SwingConstants.LEFT);
        day1.setBackground(myColor1);
        JCheckBox day2 =new JCheckBox(foodweek[1]);
        day2.setBackground(myColor1);
        day2.setHorizontalTextPosition(SwingConstants.LEFT);
        JCheckBox day3 =new JCheckBox(foodweek[2]);
        day3.setBackground(myColor1);
        day3.setHorizontalTextPosition(SwingConstants.LEFT);
        JCheckBox day4 =new JCheckBox(foodweek[3]);
        day4.setBackground(myColor1);
        day4.setHorizontalTextPosition(SwingConstants.LEFT);
        JCheckBox day5 =new JCheckBox(foodweek[4]);
        day5.setBackground(myColor1);
        day5.setHorizontalTextPosition(SwingConstants.LEFT);
        JCheckBox day6 =new JCheckBox(foodweek[5]);
        day6.setBackground(myColor1);
        day6.setHorizontalTextPosition(SwingConstants.LEFT);
        JCheckBox day7 =new JCheckBox(foodweek[6]);
        day7.setBackground(myColor1);
        day7.setHorizontalTextPosition(SwingConstants.LEFT);


       /* Object[][] data ={ {"MONDAY",day1},
                {"TUESDAY",day2},
                {"WENDESDAY",day3},
                {"THURSDAY",day4},
                {"FRIDAY",day5},
                {"STURDAY",day6},
                {"SUNDAY",day7}};*/

        JLabel food = new JLabel(" FOOD ");
        food.setBackground(myColor1);
        food.setOpaque(true);
        food.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        food.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel day = new JLabel(" DAY ");
        day.setBackground(myColor1);
        day.setOpaque(true);
        day.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        day.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel mon = new JLabel(" MONDAY  : ");
        mon.setBackground(myColor1);
        mon.setHorizontalAlignment(SwingConstants.LEFT);
        mon.setOpaque(true);

        JLabel tue = new JLabel(" TUESDAY  : ");
        tue.setBackground(myColor1);
        tue.setHorizontalAlignment(SwingConstants.LEFT);
        tue.setOpaque(true);

        JLabel wen = new JLabel(" WENDESDAY : ");
        wen.setBackground(myColor1);
        wen.setHorizontalAlignment(SwingConstants.LEFT);
        wen.setOpaque(true);

        JLabel thu = new JLabel(" THURSDAY  : ");
        thu.setBackground(myColor1);
        thu.setHorizontalAlignment(SwingConstants.LEFT);
        thu.setOpaque(true);

        JLabel fri = new JLabel(" FRIDAY    : ");
        fri.setBackground(myColor1);
        fri.setHorizontalAlignment(SwingConstants.LEFT);
        fri.setOpaque(true);

        JLabel stu = new JLabel(" STURDAY   : ");
        stu.setBackground(myColor1);
        stu.setHorizontalAlignment(SwingConstants.LEFT);
        stu.setOpaque(true);

        JLabel sun = new JLabel(" SUNDAY    : ");
        sun.setBackground(myColor1);
        sun.setHorizontalAlignment(SwingConstants.LEFT);
        sun.setOpaque(true);


      //  String column[]={"DAY","FOOD"};
        foodTable.add(day);
        foodTable.add(food);
        foodTable.add(mon);
        foodTable.add(day1);
        foodTable.add(tue);
        foodTable.add(day2);
        foodTable.add(wen);
        foodTable.add(day3);
        foodTable.add(thu);
        foodTable.add(day4);
        foodTable.add(fri);
        foodTable.add(day5);
        foodTable.add(stu);
        foodTable.add(day6);
        foodTable.add(sun);
        foodTable.add(day7);



       // JTable foodTable =new JTable(data,column);

        JLabel westLable =new JLabel();
        //int westlablewidth = topLable.getPreferredSize().width;
        //int westlableheight = topLable.getPreferredSize().height;
        //westLable.setPreferredSize(new Dimension(westlablewidth, westlableheight));

        JLabel eastLable =new JLabel();
       // int eastlablewidth = topLable.getPreferredSize().width;
        //int eastlableheight = topLable.getPreferredSize().height;
      //  eastLable.setPreferredSize(new Dimension(eastlablewidth, eastlableheight));
        mainPanel.setSize(300,400);
        mainPanel.add(westLable,BorderLayout.WEST);
        mainPanel.add(eastLable,BorderLayout.EAST);
        mainPanel.add(foodTable,BorderLayout.CENTER);
        foodTable.setBackground(Color.WHITE);
        foodTable.setBorder(border);
        mainPanel.setBackground(Color.WHITE);

        foodMenu = new  JMenu("Back To Homepage");
        foodbar = new JMenuBar();
        foodbar.add(foodMenu);
        foodframe.setJMenuBar(foodbar);


    }
    public void showFoodframe() {
        foodframe.pack();
         foodframe.setSize(750,550);
        foodframe.setVisible(true);
    }




}
