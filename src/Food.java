
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.IconView;
import java.awt.*;
import java.awt.event.*;
//this class creat jframe  for student untill hi/she can rezerv  food

public class Food {
    private JFrame foodframe;
    private JMenu foodMenu;
    private JMenuBar foodbar;
    private JButton setButton;
    private String userName;
    private String[] foodweek;
    private JCheckBox day1;
    private JCheckBox day2;
    private JCheckBox day3;
    private JCheckBox day4;
    private JCheckBox day5;
    private JCheckBox day6;
    private JCheckBox day7;
    private int countChecked;
    private   boolean[] selected;





    public Food(String userName){
    this.userName=userName;

    foodweek=new String[loginPanel.univercity.getFood().length];
        loginPanel.univercity.findStudent(userName).increasAccount(4000);
        foodweek =loginPanel.univercity.getFood();
        countChecked=0;
        selected= new boolean[]{false,false,false,false,false,false,false};
        Color myColor4 = new Color(160 ,70 , 180);
        Color myColor3 = new Color(200 , 0, 220);
        Color myColor2 = new Color(200 , 100, 250,250);
        Color myColor1  = new Color(150 , 0, 250,30);
        Color myColor = new Color(250 , 100, 250,100);

        ButtonHandler handler = new ButtonHandler();


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
        setButton.addActionListener(handler);
        mainPanel.add(setButton,BorderLayout.SOUTH);

        JLabel topLable = new JLabel(" FOOD SCHUDLE                                                 "+"      " +
                "ACCOUNT :  "
                + loginPanel.univercity.findStudent(userName).getAccount());
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

        day1 =new JCheckBox(foodweek[0]);
        day1.addItemListener(handler);
        day1.setHorizontalTextPosition(SwingConstants.LEFT);
        day1.setBackground(myColor1);
        day2 =new JCheckBox(foodweek[1]);
        day2.setBackground(myColor1);
        day2.addItemListener(handler);
        day2.setHorizontalTextPosition(SwingConstants.LEFT);
        day3 =new JCheckBox(foodweek[2]);
        day3.setBackground(myColor1);
        day3.addItemListener(handler);
        day3.setHorizontalTextPosition(SwingConstants.LEFT);
        day4 =new JCheckBox(foodweek[3]);
        day4.setBackground(myColor1);
        day4.addItemListener(handler);
        day4.setHorizontalTextPosition(SwingConstants.LEFT);
        day5 =new JCheckBox(foodweek[4]);
        day5.setBackground(myColor1);
        day5.addItemListener(handler);
        day5.setHorizontalTextPosition(SwingConstants.LEFT);
        day6 =new JCheckBox(foodweek[5]);
        day6.setBackground(myColor1);
        day6.addItemListener(handler);
        day6.setHorizontalTextPosition(SwingConstants.LEFT);
        day7 =new JCheckBox(foodweek[6]);
        day7.setBackground(myColor1);
        day7.addItemListener(handler);
        day7.setHorizontalTextPosition(SwingConstants.LEFT);


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

    private class ButtonHandler implements ActionListener, FocusListener, ItemListener{

        @Override
        public void actionPerformed(ActionEvent e) {


            if (e.getSource().equals(setButton)) {
                System.out.println("Button");
                System.out.println(countChecked);
                System.out.println(loginPanel.univercity.findStudent(userName).getAccount());

                if (countChecked * 2000 <= loginPanel.univercity.findStudent(userName).getAccount()) {

                    if (day1.isSelected()) {
                        loginPanel.univercity.findStudent(userName).reserveFood(1);
                    }
                    if (day2.isSelected()) {
                        loginPanel.univercity.findStudent(userName).reserveFood(2);
                    }
                    if (day3.isSelected()) {
                        loginPanel.univercity.findStudent(userName).reserveFood(3);
                    }
                    if (day4.isSelected()) {
                        loginPanel.univercity.findStudent(userName).reserveFood(4);
                    }
                    if (day5.isSelected()) {
                        loginPanel.univercity.findStudent(userName).reserveFood(5);
                    }
                    if (day6.isSelected()) {
                        loginPanel.univercity.findStudent(userName).reserveFood(6);
                    }
                    if (day7.isSelected()) {
                        loginPanel.univercity.findStudent(userName).reserveFood(7);
                    }
                    JOptionPane.showMessageDialog(setButton, "Rezerve Successfully!", "Result", JOptionPane.INFORMATION_MESSAGE);

                } else
                    JOptionPane.showMessageDialog(setButton, "pleas Increas your Account!", "Result", JOptionPane.ERROR_MESSAGE);
            }
        }
        @Override
        public void itemStateChanged(ItemEvent ie) {

            if (day1.isSelected()) {
                day1.setEnabled(false);
                if (!selected[0]){
                selected[0]=true;
                countChecked++;
               }
            }
            if (day2.isSelected()) {
                day2.setEnabled(false);
                if (!selected[1]){
                    selected[1]=true;
                    countChecked++;
                }
            }
            if (day3.isSelected()) {
                day3.setEnabled(false);
                if (!selected[2]){
                    selected[2]=true;
                    countChecked++;
                }
            }
            if (day4.isSelected()) {
                day4.setEnabled(false);
                if (!selected[3]){
                    selected[3]=true;
                    countChecked++;
                }
            }
            if (day5.isSelected()) {
                day5.setEnabled(false);
                if (!selected[4]){
                    selected[4]=true;
                    countChecked++;
                }
            }
            if (day6.isSelected()) {
                day6.setEnabled(false);
                if (!selected[5]){
                    selected[5]=true;
                    countChecked++;
                }
            }
            if (day7.isSelected()) {
                day7.setEnabled(false);
                if (!selected[6]){
                    selected[6]=true;
                    countChecked++;
                }
            }

        System.out.println(countChecked);}

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
