import java.awt.event.*;
import javax.swing.*;

public class EndListener implements ActionListener {
    private JTextField textField;

    public EndListener(JTextField aTextField) {
		textField = aTextField;
    }

    public void actionPerformed(ActionEvent ae) {
		ComponentTester.endCity = textField.getText();
    	textField.setText("End in " + ComponentTester.endCity);
    }
}