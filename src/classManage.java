
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
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
    private String username;
    private ArrayList<Class> currentClass;
  //  private Univercity uni;

    public classManage(String user) {
        username =user;


        this.currentClass = loginPanel.univercity.getClassList();

        Color myColor4 = new Color(160, 70, 200);
        Color myColor3 = new Color(190, 0, 250);
        Color myColor2 = new Color(200, 100, 250, 250);
        Color myColor1 = new Color(150, 0, 250, 67);
        Color myColor = new Color(250, 100, 250, 100);


        addButton = new JButton("ADD");

        classFrame = new JFrame("CHANGE PASSWORD");


        JPanel mainPanel = new JPanel(new BorderLayout());

        classFrame.setContentPane(mainPanel);

        int buttonWidth9 = addButton.getPreferredSize().width;
        int buttonHeight9 = addButton.getPreferredSize().height + 10;
        addButton.setPreferredSize(new Dimension(buttonWidth9, buttonHeight9));
        addButton.setBackground(myColor4);
        addButton.setForeground(Color.white);
        addButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));

        mainPanel.add(addButton, BorderLayout.SOUTH);

        JLabel topLable1 = new JLabel(" COURSE ");
        topLable1.setBackground(myColor4);
        topLable1.setForeground(Color.white);
        topLable1.setOpaque(true);
        topLable1.setHorizontalAlignment(SwingConstants.LEFT);
        int toplablewidth = topLable1.getPreferredSize().width;
        int toplableheight = topLable1.getPreferredSize().height + 10;
        topLable1.setPreferredSize(new Dimension(toplablewidth, toplableheight));
        topLable1.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));

        JLabel topLable2 = new JLabel("  UNIT :  " + loginPanel.univercity.findStudent(username).getCurrentUnit()+" ");
        Border border1 = BorderFactory.createLineBorder(myColor4, 1);
        topLable2.setBorder(border1);
        topLable2.setBackground(Color.WHITE);
        topLable2.setForeground(Color.BLACK);
        topLable2.setOpaque(true);
        topLable2.setHorizontalAlignment(SwingConstants.LEFT);
        int toplablewidth2 = topLable2.getPreferredSize().width;
        int toplableheight2 = topLable2.getPreferredSize().height + 10;
        topLable2.setPreferredSize(new Dimension(toplablewidth2, toplableheight2));
        topLable2.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));


        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(topLable1, BorderLayout.CENTER);
        topPanel.add(topLable2, BorderLayout.EAST);

        mainPanel.add(topPanel, BorderLayout.NORTH);

        Object[] column = new Object[5];
                column[0] = "NAME";
                column[1] = "UNIT";
                column[2] = "THEACHER";
                column[3] = "TIME";
                column[4] = "LIMIT";

        JTable coursTable = new JTable(){
            private static final long serialVersionUID = 1L;
            public boolean isCellEditable(int row, int column) {
            return false;
                };};

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        Object[] row = new Object[6];

        //ArrayList<JRadioButton> radioButtons = new ArrayList<>();
        for (int j = 0; j < currentClass.size(); j++) {
            row[0] =currentClass.get(j).getClassName();
            row[1] =currentClass.get(j).getThaecherName();
            row[2] = currentClass.get(j).getUnit();
            row[3] = currentClass.get(j).getTime();
            String limit = currentClass.get(j).getLimit()+" /  "+currentClass.get(j).getLimit();

            row[4] = limit;
            JRadioButton radioButton = new JRadioButton();
            row[5] = new JRadioButton("op");
;            model.addRow(row);
        }
        coursTable.setModel(model);
      //  coursTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       // coursTable.setSize(500,400);

        JScrollPane pane = new JScrollPane(coursTable);
        mainPanel.add(pane,BorderLayout.CENTER);

        JLabel westLable =new JLabel();
        int westlablewidth = westLable.getPreferredSize().width+30;
        int westlableheight = westLable.getPreferredSize().height + 30;
        westLable.setPreferredSize(new Dimension(westlablewidth, westlableheight));

        JLabel eastLable =new JLabel();
        eastLable.setBackground(Color.yellow);
        int eastlablewidth = eastLable.getPreferredSize().width+30;
        int eastlableheight = eastLable.getPreferredSize().height+20;
        eastLable.setPreferredSize(new Dimension(eastlablewidth, eastlableheight));

        mainPanel.add(westLable,BorderLayout.WEST);
        mainPanel.add(eastLable,BorderLayout.EAST);

        classMenu = new  JMenu("Menue");
        classBar = new JMenuBar();
        classBar.add(classMenu);
        classFrame.setJMenuBar(classBar);





    }
    public void showClassManage() {
        classFrame.pack();
        classFrame.setSize(750,550);
        classFrame.setVisible(true);
    }
    public void closeClassManage() {

        classFrame.setVisible(false);
    }




}