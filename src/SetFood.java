import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SetFood extends JPanel {

    public SetFood(){
        Color myColor1 = new Color(0 , 150, 250);
        Color myColor2 = new Color(0 , 200, 250);
        Color myColor3 = new Color(0 , 200, 250,90);
        Color myColor4 = new Color(0 , 0, 250,250);
        //Color myColor4 = new Color(0 , 30, 250,200);
        Color myColor = new Color(0 , 200, 250,57);

        setLayout(new BorderLayout());
        setBackground(Color.white);

        JLabel topLable =new JLabel("FOOD SCHUDLE",SwingConstants.CENTER);
        topLable.setBackground(myColor);
        topLable.setForeground(myColor4);
        topLable.setOpaque(true);
        topLable.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        int toplablewidth = topLable.getPreferredSize().width;
        int toplableheight = topLable.getPreferredSize().height + 20;
        topLable.setPreferredSize(new Dimension(toplablewidth, toplableheight));
      //  topLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));

        add(topLable,BorderLayout.NORTH);

        //set food table

        JPanel centerPanel =new JPanel(new GridLayout(7,5,3,3));
        Border border = BorderFactory.createLineBorder(myColor3, 2);
        centerPanel.setBorder(border);
        centerPanel.setBackground(Color.white);

        JLabel mondayLable =new JLabel("MONDAY");
        mondayLable.setBackground(myColor1);
        mondayLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        mondayLable.setOpaque(true);

        centerPanel.add(mondayLable);

        ButtonGroup monGroupBtn = new ButtonGroup();

        JRadioButton monBtn = new JRadioButton("PIZZA");
        monBtn.setBackground(myColor);
        monBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(monBtn);
        monGroupBtn.add(monBtn);
        monBtn = new JRadioButton("PASTA");
        monBtn.setBackground(myColor);
        monBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(monBtn);
        monGroupBtn.add(monBtn);
        monBtn= new JRadioButton("Vplate");
        monBtn.setBackground(myColor);
        monBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(monBtn);
        monGroupBtn.add(monBtn);
        monBtn = new JRadioButton("SALMON");
        monBtn.setBackground(myColor);
        monBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(monBtn);
        monGroupBtn.add(monBtn);

        JLabel tueLable =new JLabel("TUESDAY");
        tueLable.setBackground(myColor1);
        tueLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        tueLable.setOpaque(true);

       centerPanel.add(tueLable);

        ButtonGroup tueGroupBtn = new ButtonGroup();

        JRadioButton tueBtn = new JRadioButton("PIZZA");
        tueBtn.setBackground(myColor);
        tueBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(tueBtn);
        tueGroupBtn.add(tueBtn);
        tueBtn = new JRadioButton("PASTA");
        tueBtn.setBackground(myColor);
        tueBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(tueBtn);
        tueGroupBtn.add(tueBtn);
        tueBtn= new JRadioButton("Vplate");
        tueBtn.setBackground(myColor);
        tueBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(tueBtn);
        tueGroupBtn.add(tueBtn);
        tueBtn = new JRadioButton("SALMON");
        tueBtn.setBackground(myColor);
        tueBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(tueBtn);
        tueGroupBtn.add(tueBtn);

        JLabel wenLable =new JLabel("WENDESDAY");
        wenLable.setBackground(myColor1);
        wenLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        wenLable.setOpaque(true);

        centerPanel.add(wenLable);

        ButtonGroup wenGroupBtn = new ButtonGroup();

        JRadioButton wenBtn = new JRadioButton("PIZZA");
        wenBtn.setBackground(myColor);
        wenBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(wenBtn);
        wenGroupBtn.add(wenBtn);
        wenBtn = new JRadioButton("PASTA");
        wenBtn.setBackground(myColor);
        wenBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(wenBtn);
        wenGroupBtn.add(wenBtn);
        wenBtn= new JRadioButton("Vplate");
        wenBtn.setBackground(myColor);
        wenBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(wenBtn);
        wenGroupBtn.add(wenBtn);
        wenBtn = new JRadioButton("SALMON");
        wenBtn.setBackground(myColor);
        wenBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(wenBtn);
        wenGroupBtn.add(wenBtn);

        JLabel thuLable =new JLabel("THURSDAY");
        thuLable.setBackground(myColor1);
        thuLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        thuLable.setOpaque(true);

        centerPanel.add(thuLable);

        ButtonGroup thuGroupBtn = new ButtonGroup();

        JRadioButton thuBtn = new JRadioButton("PIZZA");
        thuBtn.setBackground(myColor);
        thuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(thuBtn);
        thuGroupBtn.add(thuBtn);
        thuBtn = new JRadioButton("PASTA");
        thuBtn.setBackground(myColor);
        thuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(thuBtn);
        thuGroupBtn.add(thuBtn);
        thuBtn= new JRadioButton("Vplate");
        thuBtn.setBackground(myColor);
        thuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(thuBtn);
        thuGroupBtn.add(thuBtn);
        thuBtn = new JRadioButton("SALMON");
        thuBtn.setBackground(myColor);
        thuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(thuBtn);
        thuGroupBtn.add(thuBtn);


        JLabel friLable =new JLabel("FRIDAY");
        friLable.setBackground(myColor1);
        friLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        friLable.setOpaque(true);

        centerPanel.add(friLable);

        ButtonGroup friGroupBtn = new ButtonGroup();

        JRadioButton friBtn = new JRadioButton("PIZZA");
        friBtn.setBackground(myColor);
        friBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(friBtn);
        friGroupBtn.add(friBtn);
        friBtn = new JRadioButton("PASTA");
        friBtn.setBackground(myColor);
        friBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(friBtn);
        friGroupBtn.add(friBtn);
        friBtn= new JRadioButton("Vplate");
        friBtn.setBackground(myColor);
        friBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(friBtn);
        friGroupBtn.add(friBtn);
        friBtn = new JRadioButton("SALMON");
        friBtn.setBackground(myColor);
        friBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(friBtn);
        friGroupBtn.add(friBtn);

        JLabel stuLable =new JLabel("STURDAY");
        stuLable.setBackground(myColor1);
        stuLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        stuLable.setOpaque(true);

        centerPanel.add(stuLable);

        ButtonGroup stuGroupBtn = new ButtonGroup();

        JRadioButton stuBtn = new JRadioButton("PIZZA");
        stuBtn.setBackground(myColor);
        stuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(stuBtn);
        stuGroupBtn.add(stuBtn);
        stuBtn = new JRadioButton("PASTA");
        stuBtn.setBackground(myColor);
        stuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(stuBtn);
        stuGroupBtn.add(stuBtn);
        stuBtn= new JRadioButton("Vplate");
        stuBtn.setBackground(myColor);
        stuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(stuBtn);
        stuGroupBtn.add(stuBtn);
        stuBtn = new JRadioButton("SALMON");
        stuBtn.setBackground(myColor);
        stuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(stuBtn);
        stuGroupBtn.add(stuBtn);

        JLabel sunLable =new JLabel("SUNDAY");
        sunLable.setBackground(myColor1);
        sunLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        sunLable.setOpaque(true);

        centerPanel.add(sunLable);

        ButtonGroup sunGroupBtn = new ButtonGroup();

        JRadioButton sunBtn = new JRadioButton("PIZZA");
        sunBtn.setBackground(myColor);
        sunBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(sunBtn);
        sunGroupBtn.add(sunBtn);
        sunBtn = new JRadioButton("PASTA");
        sunBtn.setBackground(myColor);
        sunBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(sunBtn);
        sunGroupBtn.add(sunBtn);
        sunBtn= new JRadioButton("Vplate");
        sunBtn.setBackground(myColor);
        sunBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(sunBtn);
        sunGroupBtn.add(sunBtn);
        sunBtn = new JRadioButton("SALMON");
        sunBtn.setBackground(myColor);
        sunBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(sunBtn);
        sunGroupBtn.add(sunBtn);







    add(centerPanel,BorderLayout.CENTER);
    }

}
