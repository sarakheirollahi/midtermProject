

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException,
            InstantiationException, IllegalAccessException {

//		for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//			System.out.println(info.getClassName());
//		}
//		System.out.println(UIManager.getSystemLookAndFeelClassName());
//		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        // obtain user input from JOptionPane input dialogs
//		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
//		String secondNumber = JOptionPane.showInputDialog("Enter second integer");
//		int number1 = Integer.parseInt(firstNumber);
//		int number2 = Integer.parseInt(secondNumber);
//		int sum = number1 + number2;
//		// display result in a JOptionPane message dialog
//		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.WARNING_MESSAGE);


//		 LoginForm form = new LoginForm("Login");
//		 form.showGUI();

//		 LoginFormLM form2 = new LoginFormLM("Login (2)");
//		 form2.showGUI();
        //
        Class class1 =new Class(2,3,"hi","First","succes");
        Class class8 =new Class(2,3,"hi","First","succes");
        Class class5 =new Class(2,3,"hi","First","succes");
        Class class7 =new Class(2,3,"hi","First","succes");
        Class class6 =new Class(2,3,"hi","First","succes");
        Class class2 =new Class(2,3,"hi","First","succes");
        Class class3 =new Class(2,3,"hi","First","succes");
        Class class4 =new Class(2,3,"hi","First","succes");
        Class class9 =new Class(2,3,"hi","First","succes");
        ArrayList<Class> m =new ArrayList<>();
        m.add(class1);
        m.add(class2);
        m.add(class3);
        m.add(class4);
        m.add(class5);
        m.add(class6);
        m.add(class7);
        m.add(class8);
        m.add(class9);





    /*    String [][] food ={{"yy","345"},{"uu","234"},{"tt","234"},{"rr","123"},
                {"ee","888"},{"qq","342"},{"qq","344"}};
        classManage form3 = new classManage(7,m);
        form3.showStudentpanel();
        IncrezAccount form2 = new IncrezAccount();
        form2.showIncrezAccount();*/
        // Creating Object of CardLayoutDemo class.
        AdminHomepage cl = new AdminHomepage();
        TheacherHomePage c3 = new TheacherHomePage();

        // Function to set default operation of JFrame.
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Function to set vivibility of JFrame.
        cl.setVisible(true);
        c3.setVisible(true);

        //
//		 LoginFormWithEventHandling login = new LoginFormWithEventHandling("MyLogin");
//		 login.showGUI();
    }

}
