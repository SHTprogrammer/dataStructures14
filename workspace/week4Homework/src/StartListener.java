import java.awt.event.*;
import javax.swing.*;

public class StartListener implements ItemListener {

    public StartListener(JComboBox<String> selection) {
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
        	CityPathMapper.startCity = e.getItem().toString();
        }
    
    }
}