/*
 * Master class to run djikstras algorithm on lists of cities
 * takes in two command line args, edges and city locations
 * 
 */

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
	public static LinkedList<String> cityPairs = new LinkedList<>();
	public static LinkedList<String> cityLoc = new LinkedList<>();
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
	
		startCity = "Albuquerque";
		endCity = "Albuquerque";	
		
//		generate dijkstras path
		path = new drawMap(startCity, endCity, cityPairs, cityLoc);
		
//		retrieve list of all possible cities
		String[] availCities = new String[path.cityMap.numNodes];
		TreeSet<String> cityTree = path.cityMap.availableCities;
		int i = 0;
		for( String entry : cityTree ) {
			availCities[i] = entry;
			i++;
		}

			  
	    JComboBox<String> startBox = new JComboBox<>(availCities);
	    JComboBox<String> endBox = new JComboBox<>(availCities);
		JButton drawButton = new JButton("DrawPath");

		startBox.addItemListener((new StartListener(startBox)));	
		endBox.addItemListener(new EndListener(endBox));
		drawButton.addActionListener(new CreatePathListener());
		
		frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		frame.add(drawButton);
		frame.add(startBox);
		frame.add(endBox);
		frame.add(path);
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}