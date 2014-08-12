import java.util.ArrayList;

public class Vertex{
	
	ArrayList<String> adj = new ArrayList<>();
	boolean isKnown;
	Integer dist;
    Vertex path;
    String name;
	
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
		for (int i = 0; i < adj.size(); i++){
			if (i!=0)
				listOut.append(", ");
			listOut.append(adj.get(i));
		}
		listOut.append("]");
		return listOut.toString();
	}
}