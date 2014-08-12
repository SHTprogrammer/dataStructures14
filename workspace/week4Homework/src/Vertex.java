import java.util.List;

public class Vertex{
	
	List<Object> adj;
	boolean isKnown;
	int dist;
    Vertex path;
    String name;
	
	public Vertex(String n){
        name = n;
	}
	
	public void addAdjacent(String n, int d){
		adj.add(n.toObject());
		adj.add(n.toObject());
	}
}