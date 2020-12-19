

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
        loginPanel form3 = new loginPanel();
        form3.showloginPanel();
       // IncrezAccount form2 = new IncrezAccount();
       // form2.showIncrezAccount();
        // Creating Object of CardLayoutDemo class.


        // Function to set default operation of JFrame.
        //cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Function to set vivibility of JFrame.
    //    cl.setVisible(true);
      //  c3.setVisible(true);

        //
//		 LoginFormWithEventHandling login = new LoginFormWithEventHandling("MyLogin");
//		 login.showGUI();
    }

}
