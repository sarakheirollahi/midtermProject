
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.IconView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;


public class classManage {
    private JFrame classFrame;
    private JMenu classMenu;
    private JMenuBar classBar;
    private JButton addButton;
    private int unit;
    private ArrayList<Class> currentClass;

    public classManage(int unit,ArrayList<Class> currentClass){

        this.currentClass=currentClass;

        Color myColor4 = new Color(160 ,70 , 200);
        Color myColor3 = new Color(190 , 0, 250);
        Color myColor2 = new Color(200 , 100, 250,250);
        Color myColor1  = new Color(150 , 0, 250,67);
        Color myColor = new Color(250 , 100, 250,100);

        this.unit =unit;
        //this.foodweek = foodweek;
        this.unit=unit;
        classFrame = new JFrame();
        addButton  = new JButton("ADD");


        JPanel mainPanel = new JPanel(new BorderLayout());

        classFrame.setContentPane(mainPanel);

        int buttonWidth9 = addButton.getPreferredSize().width;
        int buttonHeight9 = addButton.getPreferredSize().height + 20;
        addButton.setPreferredSize(new Dimension(buttonWidth9, buttonHeight9));
        addButton.setBackground(myColor4);
        mainPanel.add(addButton,BorderLayout.SOUTH);

        JLabel topLable1 = new JLabel(" COURS ");
        topLable1.setBackground(Color.LIGHT_GRAY);
        topLable1.setOpaque(true);
        topLable1.setHorizontalAlignment(SwingConstants.LEFT);

        JLabel topLable2 = new JLabel("UNIT  : "+unit);
        topLable2.setBackground(Color.LIGHT_GRAY);
        topLable2.setOpaque(true);
        topLable2.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(topLable1,BorderLayout.WEST);
        topPanel.add(topLable2,BorderLayout.WEST);

        mainPanel.add(topPanel,BorderLayout.NORTH);

        JPanel foodTable = new JPanel(new GridLayout(8,2,5,5));
        foodTable.setBackground(Color.LIGHT_GRAY);

        for(int j=0 ; j<currentClass.size();j++){
            Object[][] classinfo;
            Object.

            }


        Object[][] data ={ {"MONDAY",day1},
                {"TUESDAY",day2},
                {"WENDESDAY",day3},
                {"THURSDAY",day4},
                {"FRIDAY",day5},
                {"STURDAY",day6},
                {"SUNDAY",day7}};


        for(S)

         String column[]={"NAME","UNIT","TIME","LIMIT","BOOLEAN"};


        JTable coursTable =new JTable(data,column);



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
