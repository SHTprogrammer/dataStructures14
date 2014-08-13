import java.awt.event.*;
import javax.swing.*;

public class StartListener implements ActionListener {
    private JTextField textField;

    public StartListener(JTextField aTextField) {
		textField = aTextField;
    }

    public void actionPerformed(ActionEvent ae) {
		ComponentTester.startCity = textField.getText();
    	textField.setText("Start in" + ComponentTester.startCity);
    }
}