
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
    private int account;
    private String[][] foodweek;

    public Food(int account,String[][] foodweek){


        Color myColor4 = new Color(160 ,70 , 180);
        Color myColor3 = new Color(200 , 0, 220);
        Color myColor2 = new Color(200 , 100, 250,250);
        Color myColor1  = new Color(150 , 0, 250,67);
        Color myColor = new Color(250 , 100, 250,100);



        this.foodweek =new String[7][2];
        this.foodweek = foodweek;
        this.account=account;
        foodframe = new JFrame();
        setButton = new JButton("SET");

        JLabel foodphoto =new JLabel();
        Border border = BorderFactory.createLineBorder(myColor4, 2);
        foodphoto.setBorder(border);
        ImageIcon foodlogo = new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\PortalSistem\\out\\Images\\food.jpg");
        foodphoto.setIcon(foodlogo);

        JPanel mainPanel = new JPanel(new BorderLayout());

        mainPanel.add(foodphoto,BorderLayout.EAST);

        foodframe.setContentPane(mainPanel);

        int buttonWidth9 = setButton.getPreferredSize().width;
        int buttonHeight9 = setButton.getPreferredSize().height + 10;
        setButton.setPreferredSize(new Dimension(buttonWidth9, buttonHeight9));
        setButton.setBackground(myColor4);
        mainPanel.add(setButton,BorderLayout.SOUTH);

        JLabel topLable = new JLabel(" FOOD SCHUDLE                 "+"      ACCOUNT :  "+account);
        topLable.setBackground(Color.LIGHT_GRAY);
        topLable.setOpaque(true);
        topLable.setHorizontalAlignment(SwingConstants.LEFT);

        mainPanel.add(topLable,BorderLayout.NORTH);

        JPanel foodTable = new JPanel(new GridLayout(8,2,5,5));
        foodTable.setBackground(Color.LIGHT_GRAY);

        JCheckBox day1 =new JCheckBox(foodweek[0][0]+"       "+foodweek[0][1]);
        day1.setHorizontalTextPosition(SwingConstants.LEFT);
        day1.setBackground(myColor);
        JCheckBox day2 =new JCheckBox(foodweek[1][0]+"       "+foodweek[1][1]);
        day2.setBackground(myColor);
        day2.setHorizontalTextPosition(SwingConstants.LEFT);
        JCheckBox day3 =new JCheckBox(foodweek[2][0]+"       "+foodweek[2][1]);
        day3.setBackground(myColor1);
        day3.setHorizontalTextPosition(SwingConstants.LEFT);
        JCheckBox day4 =new JCheckBox(foodweek[3][0]+"       "+foodweek[3][1]);
        day4.setBackground(myColor1);
        day4.setHorizontalTextPosition(SwingConstants.LEFT);
        JCheckBox day5 =new JCheckBox(foodweek[4][0]+"       "+foodweek[4][1]);
        day5.setBackground(myColor2);
        day5.setHorizontalTextPosition(SwingConstants.LEFT);
        JCheckBox day6 =new JCheckBox(foodweek[5][0]+"       "+foodweek[5][1]);
        day6.setBackground(myColor2);
        day6.setHorizontalTextPosition(SwingConstants.LEFT);
        JCheckBox day7 =new JCheckBox(foodweek[6][0]+"       "+foodweek[6][1]);
        day7.setBackground(myColor3);
        day7.setHorizontalTextPosition(SwingConstants.LEFT);


       /* Object[][] data ={ {"MONDAY",day1},
                {"TUESDAY",day2},
                {"WENDESDAY",day3},
                {"THURSDAY",day4},
                {"FRIDAY",day5},
                {"STURDAY",day6},
                {"SUNDAY",day7}};*/

        JLabel food = new JLabel(" FOOD ");
        food.setBackground(myColor4);
        food.setOpaque(true);
        food.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel day = new JLabel(" DAY ");
        day.setBackground(myColor4);
        day.setOpaque(true);
        day.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel mon = new JLabel(" MONDAY  : ");
        mon.setBackground(myColor);
        mon.setHorizontalAlignment(SwingConstants.LEFT);
        mon.setOpaque(true);

        JLabel tue = new JLabel(" TUESDAY  : ");
        tue.setBackground(myColor);
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
        fri.setBackground(myColor2);
        fri.setHorizontalAlignment(SwingConstants.LEFT);
        fri.setOpaque(true);

        JLabel stu = new JLabel(" STURDAY   : ");
        stu.setBackground(myColor2);
        stu.setHorizontalAlignment(SwingConstants.LEFT);
        stu.setOpaque(true);

        JLabel sun = new JLabel(" SUNDAY    : ");
        sun.setBackground(myColor3);
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



        mainPanel.add(foodTable,BorderLayout.CENTER);


        foodMenu = new  JMenu("Back To Homepage");
        foodbar = new JMenuBar();
        foodbar.add(foodMenu);
        foodframe.setJMenuBar(foodbar);


    }
    public void showFoodframe() {
        foodframe.pack();
        foodframe.setVisible(true);
    }


}
