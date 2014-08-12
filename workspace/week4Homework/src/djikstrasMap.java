import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class djikstrasMap{
	
	BinaryHeap<Integer> mapQueue;
	
	LinkedList<String> edges;
	LinkedList<String> coords;
	TreeSet<Vertex> theCities;
	
	/*
	 * Empty constructor
	 */
	public djikstrasMap(){
	}
	
	/*
	 * Constructor with edges and coordinate inputs
	 */
	public djikstrasMap(LinkedList<String> e, LinkedList<String> c){
		edges = e;
		coords = c;
	}		
		
    public void makeVertices(){
    	for ( int i =0; i < edges.size(); i++ ){
    		String newLine = edges.get(i);
			StringTokenizer st = new StringTokenizer(newLine);
			String cityA;
			String cityB;
			String dist;
			int itemCount = 0;
			while (st.hasMoreTokens()) {		
  	    	     String nextItem = st.nextToken();
  	    	     if( itemCount == 0 )
  	    	    	 cityA = nextItem;
  	    	     if( itemCount == 1 )
  	    	    	 cityB = nextItem;
  	    	     if( itemCount == 3 )
  	    	    	 dist = nextItem;
  	    	     itemCount++;
			}
			
			if( theCities.containsKey(cityA) ){
				Vertex a = theCities.remove(cityA);
				a.addAdjacent(cityB, dist.asInt());
			}
			else {
				Vertex a = new Vertex(cityA);
				a.addAdjacent(cityB, dist.asInt());
			}
			
			if( theCities.containsKey(cityB) ){
				Vertex b = theCities.remove(cityB);
				b.addAdjacent(cityA, dist.asInt());)
			}
			else {
				Vertex b = new Vertex(cityB);
				b.addAdjacent(cityA, dist.asInt());
			}
				
			theCities.add(a, a.name);
			theCities.add(b, b.name);			
			}  	     
    	}
    	
    public void findPath( String s, String t ){
    	while (!theCities.isEmpty()){
    		Vertex thisCity = theCities.last();
    		thisCity.dist = 1000000;
    		thisCity.isKnown = false;
    		mapQueue.insert()
    	
    		
    		
    	}
    }
    	
}