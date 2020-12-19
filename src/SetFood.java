import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SetFood extends JPanel {
    private JButton setBtn;
    ButtonGroup stuGroupBtn;
    ButtonGroup monGroupBtn;
    ButtonGroup tueGroupBtn;
    ButtonGroup thuGroupBtn;
    ButtonGroup friGroupBtn;
    ButtonGroup sunGroupBtn;
    ButtonGroup wenGroupBtn;

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
        topLable.setFont(new Font("Helvetica Neue", Font.BOLD, 25));
        int toplablewidth = topLable.getPreferredSize().width;
        int toplableheight = topLable.getPreferredSize().height + 20;
        topLable.setPreferredSize(new Dimension(toplablewidth, toplableheight));
      //  topLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));

        JLabel bottonLable =new JLabel("AUT",SwingConstants.CENTER);
        bottonLable.setBackground(myColor);
        bottonLable.setForeground(myColor3);
        bottonLable.setOpaque(true);
        bottonLable.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        int bottonLablew = topLable.getPreferredSize().width;
        int bottonLableh = topLable.getPreferredSize().height + 20;
        topLable.setPreferredSize(new Dimension(bottonLablew, bottonLableh));
        add(bottonLable,BorderLayout.SOUTH);

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

         monGroupBtn = new ButtonGroup();

        JRadioButton monBtn = new JRadioButton("PIZZA");
        monBtn.setBackground(myColor);
        monBtn.setActionCommand("PIZZA");
        monBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(monBtn);
        monGroupBtn.add(monBtn);
        monBtn = new JRadioButton("PASTA");
        monBtn.setBackground(myColor);
        monBtn.setActionCommand("PASTA");
        monBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(monBtn);
        monGroupBtn.add(monBtn);
        monBtn= new JRadioButton("Vplate");
        monBtn.setBackground(myColor);
        monBtn.setActionCommand("Vplate");
        monBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(monBtn);
        monGroupBtn.add(monBtn);
        monBtn = new JRadioButton("SALMON");
        monBtn.setBackground(myColor);
        monBtn.setActionCommand("SALMON");
        monBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(monBtn);
        monGroupBtn.add(monBtn);

        JLabel tueLable =new JLabel("TUESDAY");
        tueLable.setBackground(myColor1);
        tueLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        tueLable.setOpaque(true);

        centerPanel.add(tueLable);

        tueGroupBtn = new ButtonGroup();

        JRadioButton tueBtn = new JRadioButton("PIZZA");
        tueBtn.setBackground(myColor);
        tueBtn.setActionCommand("PIZZA");
        tueBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(tueBtn);
        tueGroupBtn.add(tueBtn);
        tueBtn = new JRadioButton("PASTA");
        tueBtn.setBackground(myColor);
        tueBtn.setActionCommand("PASTA");
        tueBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(tueBtn);
        tueGroupBtn.add(tueBtn);
        tueBtn= new JRadioButton("Vplate");
        tueBtn.setBackground(myColor);
        tueBtn.setActionCommand("VPLATE");
        tueBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(tueBtn);
        tueGroupBtn.add(tueBtn);
        tueBtn = new JRadioButton("SALMON");
        tueBtn.setBackground(myColor);
        tueBtn.setActionCommand("SALMON");
        tueBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(tueBtn);
        tueGroupBtn.add(tueBtn);

        JLabel wenLable =new JLabel("WENDESDAY");
        wenLable.setBackground(myColor1);
        wenLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        wenLable.setOpaque(true);

        centerPanel.add(wenLable);

        wenGroupBtn = new ButtonGroup();

        JRadioButton wenBtn = new JRadioButton("PIZZA");
        wenBtn.setBackground(myColor);
        wenBtn.setActionCommand("PIZZA");
        wenBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(wenBtn);
        wenGroupBtn.add(wenBtn);
        wenBtn = new JRadioButton("PASTA");
        wenBtn.setBackground(myColor);
        wenBtn.setActionCommand("PASTA");
        wenBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(wenBtn);
        wenGroupBtn.add(wenBtn);
        wenBtn= new JRadioButton("Vplate");
        wenBtn.setBackground(myColor);
        wenBtn.setActionCommand("Vplate");
        wenBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(wenBtn);
        wenGroupBtn.add(wenBtn);
        wenBtn = new JRadioButton("SALMON");
        wenBtn.setBackground(myColor);
        wenBtn.setActionCommand("SALMON");
        wenBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(wenBtn);
        wenGroupBtn.add(wenBtn);

        JLabel thuLable =new JLabel("THURSDAY");
        thuLable.setBackground(myColor1);
        thuLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        thuLable.setOpaque(true);

        centerPanel.add(thuLable);

        thuGroupBtn = new ButtonGroup();

        JRadioButton thuBtn = new JRadioButton("PIZZA");
        thuBtn.setBackground(myColor);
        thuBtn.setActionCommand("PIZZA");
        thuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(thuBtn);
        thuGroupBtn.add(thuBtn);
        thuBtn = new JRadioButton("PASTA");
        thuBtn.setBackground(myColor);
        thuBtn.setActionCommand("PASTA");
        thuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(thuBtn);
        thuGroupBtn.add(thuBtn);
        thuBtn= new JRadioButton("Vplate");
        thuBtn.setBackground(myColor);
        thuBtn.setActionCommand("Vplate");
        thuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(thuBtn);
        thuGroupBtn.add(thuBtn);
        thuBtn = new JRadioButton("SALMON");
        thuBtn.setBackground(myColor);
        thuBtn.setActionCommand("SALMON");
        thuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(thuBtn);
        thuGroupBtn.add(thuBtn);


        JLabel friLable =new JLabel("FRIDAY");
        friLable.setBackground(myColor1);
        friLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        friLable.setOpaque(true);

        centerPanel.add(friLable);

        friGroupBtn = new ButtonGroup();

        JRadioButton friBtn = new JRadioButton("PIZZA");
        friBtn.setBackground(myColor);
        friBtn.setActionCommand("PIZZA");
        friBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(friBtn);
        friGroupBtn.add(friBtn);
        friBtn = new JRadioButton("PASTA");
        friBtn.setBackground(myColor);
        friBtn.setActionCommand("PASTA");
        friBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(friBtn);
        friGroupBtn.add(friBtn);
        friBtn= new JRadioButton("Vplate");
        friBtn.setBackground(myColor);
        friBtn.setActionCommand("Vplate");
        friBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(friBtn);
        friGroupBtn.add(friBtn);
        friBtn = new JRadioButton("SALMON");
        friBtn.setBackground(myColor);
        friBtn.setActionCommand("SALMON");
        friBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(friBtn);
        friGroupBtn.add(friBtn);

        JLabel stuLable =new JLabel("STURDAY");
        stuLable.setBackground(myColor1);
        stuLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        stuLable.setOpaque(true);

        centerPanel.add(stuLable);

        stuGroupBtn = new ButtonGroup();

        JRadioButton stuBtn = new JRadioButton("PIZZA");
        stuBtn.setBackground(myColor);
        stuBtn.setActionCommand("PIZZA");
        stuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(stuBtn);
        stuGroupBtn.add(stuBtn);
        stuBtn = new JRadioButton("PASTA");
        stuBtn.setBackground(myColor);
        stuBtn.setActionCommand("PASTA");
        stuBtn.setActionCommand("c");
        stuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(stuBtn);
        stuGroupBtn.add(stuBtn);
        stuBtn= new JRadioButton("Vplate");
        stuBtn.setBackground(myColor);
        stuBtn.setActionCommand("Vplate");
        stuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(stuBtn);
        stuGroupBtn.add(stuBtn);
        stuBtn = new JRadioButton("SALMON");
        stuBtn.setBackground(myColor);
        stuBtn.setActionCommand("SALMON");
        stuBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(stuBtn);
        stuGroupBtn.add(stuBtn);

        JLabel sunLable =new JLabel("SUNDAY");
        sunLable.setBackground(myColor1);
        sunLable.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        sunLable.setOpaque(true);

        centerPanel.add(sunLable);

        sunGroupBtn = new ButtonGroup();

        JRadioButton sunBtn = new JRadioButton("PIZZA");
        sunBtn.setBackground(myColor);
        sunBtn.setActionCommand("PIZZA");
        sunBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(sunBtn);
        sunGroupBtn.add(sunBtn);
        sunBtn = new JRadioButton("PASTA");
        sunBtn.setBackground(myColor);
        sunBtn.setActionCommand("PASTA");
        sunBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(sunBtn);
        sunGroupBtn.add(sunBtn);
        sunBtn= new JRadioButton("Vplate");
        sunBtn.setBackground(myColor);
        sunBtn.setActionCommand("Vplate");
        sunBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(sunBtn);
        sunGroupBtn.add(sunBtn);
        sunBtn = new JRadioButton("SALMON");
        sunBtn.setBackground(myColor);
        sunBtn.setActionCommand("SALMON");
        sunBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        centerPanel.add(sunBtn);
        sunGroupBtn.add(sunBtn);

        ButtonHandler handler = new ButtonHandler();

        setBtn = new JButton("SET");
        setBtn.setForeground(Color.white);
        setBtn.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        setBtn.addActionListener(handler);
        setBtn.setBackground(myColor2);


        add(centerPanel,BorderLayout.CENTER);
        add(setBtn,BorderLayout.SOUTH);
    }
    private class ButtonHandler implements ActionListener, FocusListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(setBtn)) {

                loginPanel.univercity.setFood(0,monGroupBtn.getSelection().getActionCommand());
                loginPanel.univercity.setFood(1,tueGroupBtn.getSelection().getActionCommand());
                loginPanel.univercity.setFood(2,wenGroupBtn.getSelection().getActionCommand());
                loginPanel.univercity.setFood(3,thuGroupBtn.getSelection().getActionCommand());
                loginPanel.univercity.setFood(4,friGroupBtn.getSelection().getActionCommand());
                loginPanel.univercity.setFood(5,stuGroupBtn.getSelection().getActionCommand());
                loginPanel.univercity.setFood(6,sunGroupBtn.getSelection().getActionCommand());

            }




        }

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
