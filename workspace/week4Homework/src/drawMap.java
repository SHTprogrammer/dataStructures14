/*
 * drawMap contains methods:
 * Constructor -- requires start and end city names as strings and LinkedLists
 *   of edges and coordinates
 *   
 * paintComponent -- draws the solution path as a string, maps the cities at their 
 *   coordinates, and draws the solution path 
 */


import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Map;

@SuppressWarnings("serial")
public class drawMap extends JComponent{
	
	dijkstrasMap cityMap;
	public LinkedList<String> cityPairs;
	public LinkedList<String> cityLoc;
	

    /*
     * Constructor which takes in two city names as strings and two 
     * LinkedLists of edges and coordinates
     */
	public drawMap(String startCity, String endCity, 
			LinkedList<String> cityPairs, LinkedList<String> cityLoc){
		setPreferredSize(new Dimension(900,400));
		this.cityMap = new dijkstrasMap(cityPairs,cityLoc);
		cityMap.findPath(startCity, endCity);
	}

	/*
	 * Draws the solution path as a string, maps the cities at their 
	 * coordinates, and draws the solution path
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g){
			Graphics g2 = (Graphics2D) g;
			
//			draw solution text
			String pathInfo = cityMap.StringPath;
			g2.drawString(pathInfo, 250,10);
			
//			map all cities
			for(Map.Entry<String,Vertex> entry : cityMap.theCities.entrySet()) {
				String cityName = entry.getKey();
				Point coord = entry.getValue().coord;
								
				Integer x = ( 50+ ( 1+coord.x)/4);
				Integer y = (350-(1+coord.y)/4);
				g2.drawString(cityName,x,y);	
			}

//			draw solution path
			for(int n = 1; n < cityMap.pathPoints.size(); ++n){
				Integer x2 = (50+(1+cityMap.pathPoints.get(n).x)/4);
				Integer y2 = (350-(1+cityMap.pathPoints.get(n).y)/4);
				Integer x1 = (50+(1+cityMap.pathPoints.get(n-1).x)/4);
				Integer y1 = (350 - (1+cityMap.pathPoints.get(n-1).y)/4);
				g2.drawLine(x1,y1,x2,y2);
			}

	}
}