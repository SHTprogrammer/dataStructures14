import javax.swing.*;

import java.awt.*;
import java.io.FileNotFoundException;
import java.util.LinkedList;

public class drawMap extends JComponent{
dijkstrasMap cityMap;
public LinkedList<String> cityPairs;
public LinkedList<String> cityLoc;

	public drawMap(String startCity, String endCity, 
			LinkedList<String> cityPairs, LinkedList<String> cityLoc){
		setPreferredSize(new Dimension(900,400));
		this.cityMap = new dijkstrasMap(cityPairs,cityLoc);
		cityMap.findPath(startCity, endCity);
	}

	public void paintComponent(Graphics g){
			Graphics g2 = (Graphics2D) g;
			String pathInfo = (cityMap.pathNames + ": "+String.format("%.1g%n", cityMap.pathLength)+" miles");
			g2.drawString(pathInfo, 250,10);
			
			for(int n = 0; n < cityMap.numNodes; ++n){
				
				String state = cityMap.StringPath;
				
				Integer x = ( 50+ ( 1+graph.cityMap.get(state).x)/4);
				Integer y = (350-(1+graph.cityMap.get(state).y)/4);
				g2.drawString(state,x,y);
				
			}

			for(int n = 1; n < graph.shortestXY.size(); ++n){
				Integer x2 = (50+(1+graph.shortestXY.get(n).x)/4);
				Integer y2 = (350-(1+graph.shortestXY.get(n).y)/4);
				Integer x1 = (50+(1+graph.shortestXY.get(n-1).x)/4);
				Integer y1 = (350 - (1+graph.shortestXY.get(n-1).y)/4);
				g2.drawLine(x1,y1,x2,y2);
			
			}


			}

	}