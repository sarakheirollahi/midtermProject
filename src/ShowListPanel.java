
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


public class ShowListPanel extends JPanel {


    private JButton addButton;
    private int unit;

    public ShowListPanel  ( ) {


        Color myColor4 = new Color(0 , 150, 250);

        addButton = new JButton("ADD");


        setLayout(new BorderLayout());

        int buttonWidth9 = addButton.getPreferredSize().width;
        int buttonHeight9 = addButton.getPreferredSize().height + 10;
        addButton.setPreferredSize(new Dimension(buttonWidth9, buttonHeight9));
        addButton.setBackground(myColor4);
        addButton.setForeground(Color.white);
        addButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));

        add(addButton, BorderLayout.SOUTH);

        JLabel topLable1 = new JLabel(" COURSES ");
        topLable1.setBackground(myColor4);
        topLable1.setForeground(Color.white);
        topLable1.setOpaque(true);
        topLable1.setHorizontalAlignment(SwingConstants.CENTER);
        int toplablewidth = topLable1.getPreferredSize().width;
        int toplableheight = topLable1.getPreferredSize().height + 10;
        topLable1.setPreferredSize(new Dimension(toplablewidth, toplableheight));
        topLable1.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));

        JLabel topLable2 = new JLabel("THEACHERS");
        topLable2.setBackground(myColor4);
        topLable2.setForeground(Color.white);
        topLable2.setOpaque(true);
        topLable2.setHorizontalAlignment(SwingConstants.CENTER);
        int toplablewidth2 = topLable2.getPreferredSize().width;
        int toplableheight2 = topLable2.getPreferredSize().height + 10;
        topLable2.setPreferredSize(new Dimension(toplablewidth2, toplableheight2));
        topLable2.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));

        JLabel topLable3 = new JLabel(" STUDENTS ");
        topLable3.setBackground(myColor4);
        topLable3.setForeground(Color.white);
        topLable3.setOpaque(true);
        topLable3.setHorizontalAlignment(SwingConstants.CENTER);
        int toplablewidth3 = topLable1.getPreferredSize().width;
        int toplableheight3 = topLable1.getPreferredSize().height + 10;
        topLable3.setPreferredSize(new Dimension(toplablewidth3, toplableheight3));
        topLable3.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));



        JPanel topPanel = new JPanel(new GridLayout(1,3));
        topPanel.add(topLable1);
        topPanel.add(topLable2);
        topPanel.add(topLable3);

        add(topPanel, BorderLayout.NORTH);
///////////////////claaaassss
        Object[] column = new Object[1];
        column[0] = "NAME";

        JTable coursTable = new JTable(){
            private static final long serialVersionUID = 1L;
            public boolean isCellEditable(int row, int column) {
                return false;
            };};
        coursTable.setBackground(Color.white);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        Object[] row = new Object[1];

        //ArrayList<JRadioButton> radioButtons = new ArrayList<>();
        for (int j = 0; j < loginPanel.univercity.getClassList().size(); j++) {
            row[0] =loginPanel.univercity.getClassList().get(j).getClassName();
            model.addRow(row);
        }
        coursTable.setModel(model);
        //  coursTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        // coursTable.setSize(500,400);


/////////theacher
        Object[] column2 = new Object[1];
        column2[0] = "NAME";

        JTable coursTable2 = new JTable(){
            private static final long serialVersionUID = 1L;
            public boolean isCellEditable(int row, int column) {
                return false;
            };};
        coursTable2.setBackground(Color.white);

        DefaultTableModel model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(column2);
        Object[] row2 = new Object[1];

        //ArrayList<JRadioButton> radioButtons = new ArrayList<>();
        for (int j = 0; j < loginPanel.univercity.getTheacheList().size(); j++) {
            row2[0] =loginPanel.univercity.getTheacheList().get(j).getUserName();
            model2.addRow(row2);
        }
        coursTable2.setModel(model2);

///////////student
        Object[] column3 = new Object[1];
        column3[0] = "NAME";

        JTable coursTable3 = new JTable(){
            private static final long serialVersionUID = 1L;
            public boolean isCellEditable(int row, int column) {
                return false;
            };};
        coursTable3.setBackground(Color.white);
        DefaultTableModel model3 = new DefaultTableModel();
        model3.setColumnIdentifiers(column3);
        Object[] row3 = new Object[1];


 //ArrayList<JRadioButton> radioButtons = new ArrayList<>();
        for (int j = 0; j < loginPanel.univercity.getStudentList().size(); j++) {
            row3[0] =loginPanel.univercity.getStudentList().get(j).getName();
            model3.addRow(row3);
        }
        coursTable3.setModel(model3);


        JPanel centerPanel = new JPanel(new GridLayout(1,3));
        centerPanel.setBackground(Color.white);

        JScrollPane pane = new JScrollPane(coursTable);
        pane.setBackground(Color.white);
        JScrollPane pane2 = new JScrollPane(coursTable2);
        pane2.setBackground(Color.white);
        JScrollPane pane3 = new JScrollPane(coursTable3);
        pane3.setBackground(Color.white);

        centerPanel.add(pane);
        centerPanel.add(pane2);
        centerPanel.add(pane3);

        add(centerPanel,BorderLayout.CENTER);




    }


}