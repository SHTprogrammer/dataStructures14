
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class djikstrasMap{
	
	
	int numNodes;
	LinkedList<String> edges;
	LinkedList<String> coords;
	TreeMap<String,Vertex> theCities = new TreeMap<>();

	
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

			String cityA = new String();
			String cityB = new String();
			String dist = new String();
			int itemCount = 0;
			Vertex a;
			Vertex b;
			while (st.hasMoreTokens()) {		
  	    	     String nextItem = st.nextToken();
//  	    	     System.out.println(itemCount+", "+nextItem);
  	    	     
  	    	     if( itemCount == 0 )
  	    	    	 cityA = nextItem;
  	    	     if( itemCount == 1 )
  	    	    	 cityB = nextItem;
  	    	     if( itemCount == 2 )
  	    	    	 dist = nextItem;
  	    	     itemCount++;
			}
//			System.out.println(cityA);
//			System.out.println(cityB);
//			System.out.println(dist);
//			System.out.println(theCities.isEmpty());
			
			if( !theCities.isEmpty() && theCities.containsKey(cityA) ){
				a = theCities.remove(cityA);
				a.addAdjacent(cityB, dist);
			}
			else {
				a = new Vertex(cityA);
				a.addAdjacent(cityB, dist);
			}
			
			if( !theCities.isEmpty() && theCities.containsKey(cityB) ){
				b = theCities.remove(cityB);
				b.addAdjacent(cityA, dist);
			}
			else {
				b = new Vertex(cityB);
				b.addAdjacent(cityA, dist);
			}
				
			theCities.put(a.name, a);
			theCities.put(b.name, b);	
			
			
			}  	  
    	numNodes = theCities.size();
		System.out.println(theCities.toString());

    	}
    	
//    public void findPath( String s, String t ){
      public void findPath( String s ){    	
//    	make priority queue that takes vertices
		PriorityQueue<Vertex> mapQueue = new PriorityQueue<>(numNodes,
    			new Comparator<Vertex>() {
                    public int compare(Vertex a1, Vertex a2) {
                        return a2.dist.compareTo(a1.dist);
                }
            });
    	  	
//      dump all cities from tree storage into queue with distance infinity
    	while (!theCities.isEmpty()){
    		String lastKey = theCities.lastKey();
    		Vertex thisCity = theCities.remove(lastKey);
    		
//    		System.out.println(lastKey);
    		
    		if( lastKey.equals(s) )
    			thisCity.setDist(0);
    		else
    		    thisCity.setDist(1000000);
    		
    		thisCity.isKnown = false;
    		 
    		mapQueue.add(thisCity);
    	}
    	
//    	pop the smallest distance unknown vertex out of the queue
    	Vertex knownCity = mapQueue.poll();
    	System.out.println(knownCity.name);
    	
//    	if the polled vertex is not already known, check its adjacencies
        Vertex newAdjacent = new Vertex();;
		if (!theCities.containsKey(knownCity.name))
        	for( int i = 0; i < knownCity.adj.size(); i++)
        		if (i%2 == 0)
        			newAdjacent.name = knownCity.adj.get(i);
		            int adjDist = Integer.parseInt((knownCity.adj.get(i+1)));
		            newAdjacent.setDist(knownCity.dist+ adjDist);
        
    	
    		
    		
    }
    	
}