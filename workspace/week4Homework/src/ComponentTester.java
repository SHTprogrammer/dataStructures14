import java.awt.*;

import javax.swing.*;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ComponentTester {
	public static drawMap path;
	public static JFrame frame;
	public static String startCity;
	public static String endCity;
	public static LinkedList<String> cityPairs;
	public static LinkedList<String> cityLoc;
	public static void main(String[] args)throws FileNotFoundException{
		
	    if(args.length < 2) {
	        System.out.println("Error, need a pairs and a distances file");
		    System.exit(1);
	    }
	    
//	    convert first file into list
	    Scanner sc2 = new Scanner(new FileInputStream(args[0]));
        while (sc2.hasNextLine()) {
              String aString = sc2.nextLine();
              cityPairs.add(aString);
        }
        sc2.close();
        
//		convert second file into list
	    Scanner sc3 = new Scanner(new FileInputStream(args[1]));
        while (sc3.hasNextLine()) {
              String aString = sc3.nextLine();
              cityLoc.add(aString);
        }
        sc3.close();
		
	
		startCity = "Miami";
		endCity = "Miami";	
		
		final JTextField textField = new JTextField(20);
		      textField.setText("");
		final JTextField textField2 = new JTextField(20);
			  textField2.setText("");
		JButton startButton = new JButton("Set Start");
		JButton endButton = new JButton("Set End");
		JButton drawButton = new JButton("DrawPath");

		startButton.addActionListener(new PathListener(textField));	
		endButton.addActionListener(new PathListener2(textField2));
		drawButton.addActionListener(new CreatePathListener());
		
		frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		path = new drawMap(startCity, endCity, cityPairs, cityLoc);
		
		frame.add(drawButton);
		frame.add(startButton);
		frame.add(textField);
		frame.add(endButton);
		frame.add(textField2);
		frame.add(path);
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}