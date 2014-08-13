//import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;


public class CreatePathListener implements ActionListener  {

    public void actionPerformed(ActionEvent ae) {
            CityPathMapper.frame.remove(CityPathMapper.path);
            CityPathMapper.path.cityMap.findPath(CityPathMapper.startCity, CityPathMapper.endCity);
            CityPathMapper.frame.add(CityPathMapper.path);
            CityPathMapper.frame.getContentPane().revalidate();
            CityPathMapper.frame.getContentPane().repaint();
    }

}