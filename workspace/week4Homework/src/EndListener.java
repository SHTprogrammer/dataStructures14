import java.awt.event.*;

import javax.swing.*;

public class EndListener implements ItemListener {
	
	    public EndListener(JComboBox<String> selection) {
	    }

	    public void itemStateChanged(ItemEvent e) {
	        if (e.getStateChange() == ItemEvent.SELECTED) {
	        	CityPathMapper.endCity = e.getItem().toString();
	        }
	    }
	}