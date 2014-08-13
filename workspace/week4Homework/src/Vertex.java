/*Vertex contains methods:
 * Constructors -- empty, or with name
 * addAdjacent -- add adjacent city and its distance to list
 * toString -- prints contents of vertex
 * setDist -- method to set shortest path distance
 */

import java.util.ArrayList;

public class Vertex{
	
	ArrayList<String> adj = new ArrayList<>();
	boolean isKnown;
	Double dist;
    Vertex path;
    String name;
    Point coord;
	
    public Vertex(){
    	
    }
    
	public Vertex(String n){
        name = n;
	}
	
	public void addAdjacent(String n, String d){
		adj.add(n);
		adj.add(d);
	}
	
	public String toString(){
		StringBuilder listOut = new StringBuilder();
		listOut.append("["+name+": ("+dist+") ");
//		for (int i = 0; i < adj.size(); i++){
//			if (i!=0)
//				listOut.append(", ");
//			listOut.append(adj.get(i));
//		}
//		listOut.append("]");
		return listOut.toString();

	}
	
	public void setDist(Double d){
		dist = d;
	}
}