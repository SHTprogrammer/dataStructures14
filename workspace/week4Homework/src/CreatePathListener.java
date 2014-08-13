//import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;


public class CreatePathListener implements ActionListener  {

    public void actionPerformed(ActionEvent ae) {
            ComponentTester.frame.remove(ComponentTester.path);
            ComponentTester.path.cityMap.findPath(ComponentTester.startCity, ComponentTester.endCity);
            ComponentTester.frame.add(ComponentTester.path);
            ComponentTester.frame.getContentPane().revalidate();
            ComponentTester.frame.getContentPane().repaint();
    }

}