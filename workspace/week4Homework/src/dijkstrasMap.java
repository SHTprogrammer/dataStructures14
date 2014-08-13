
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class djikstrasMap{
	
	Double pathLength;
	String pathNames;
	String StringPath;
	
	int numNodes;
	LinkedList<String> edges;
	LinkedList<String> coords;
	TreeMap<String,Vertex> theCities = new TreeMap<>();
	HashMap<String,Vertex> cityHash = new HashMap<>();

	/*
	 * Constructor with edges and coordinate inputs
	 */
	public djikstrasMap(LinkedList<String> e, LinkedList<String> c){
		edges = e;
		coords = c;

    	for ( int i =0; i < edges.size(); i++ ){
    		String newLine = edges.get(i);
			StringTokenizer st = new StringTokenizer(newLine);

			String cityA = new String();
			String cityB = new String();
			String dist = new String();
			int itemCount = 0;
			Vertex a;
			Vertex b;
			
//			turn line from edge list into two cities and a distance
			while (st.hasMoreTokens()) {		
  	    	     String nextItem = st.nextToken();
  	    	     
  	    	     if( itemCount == 0 )
  	    	    	 cityA = nextItem;
  	    	     if( itemCount == 1 )
  	    	    	 cityB = nextItem;
  	    	     if( itemCount == 2 )
  	    	    	 dist = nextItem;
  	    	     itemCount++;
			}

//			if city already in list, add edge to adjacency, otherwise make vertex
			if( !this.theCities.isEmpty() && this.theCities.containsKey(cityA) ){
				a = this.theCities.remove(cityA);
				a.addAdjacent(cityB, dist);
			}
			else {
				a = new Vertex(cityA);
				a.addAdjacent(cityB, dist);
			}
			
//			if city already in list, add edge to adjacency, otherwise make vertex (pairwise)
			if( !this.theCities.isEmpty() && this.theCities.containsKey(cityB) ){
				b = this.theCities.remove(cityB);
				b.addAdjacent(cityA, dist);
			}
			else {
				b = new Vertex(cityB);
				b.addAdjacent(cityA, dist);
			}
				
			this.theCities.put(a.name, a);
			this.theCities.put(b.name, b);	
			}  	  
    	numNodes = this.theCities.size();
    	}
    	
	
      public void findPath( String s , String t ){    
//    	catch no vertex case
    	if (numNodes == 0){
    		System.err.println("Must run makeVertices method");
    		System.exit(1);
    	}
    	
//    	make priority queue that takes vertices

		PriorityQueue<Vertex> mapQueue = new PriorityQueue<>(numNodes,
    			new CompareDist());
    	  	
//      dump all cities from tree storage into queue with distance infinity
//		except start vertex, who is zero
    	while (!theCities.isEmpty()){
    		String lastKey = theCities.lastKey();
    		Vertex thisCity = theCities.remove(lastKey);
    		
//    		keep a map of cities for later search and retrieval
    		cityHash.put(thisCity.name, thisCity);
    		
    		if( lastKey.equals(s) )
    			thisCity.setDist(0.0);
    		else
    		    thisCity.setDist(10000000.0);
    		
    		thisCity.isKnown = false;
    		thisCity.path = null;
    		 
    		mapQueue.add(thisCity);
    	}
    	
    	
    	
//    	theCities becomes tree of known nodes
    	while ( theCities.size() < numNodes ){
//    	    System.out.println(mapQueue.toString());
    		
	//    	pop the smallest distance unknown vertex out of the queue  	
	    	Vertex knownCity = mapQueue.poll();
	        int j = 0;
	    	
	//    	if the polled vertex is not already known, check its adjacencies

			if (!theCities.containsKey(knownCity.name)){
				
//		    	System.out.println(knownCity.name);
	        	for( int i = 0; i < knownCity.adj.size(); i++){
	        		if (i%2 == 0 && !theCities.containsKey(knownCity.adj.get(i)) ){
			            j = i+1;
	//		            retrieve original vertex from hash map		
		                Vertex newAdjacent = new Vertex();
			            Vertex existing = cityHash.get(knownCity.adj.get(i));
			            newAdjacent.adj = existing.adj;
			            newAdjacent.name = knownCity.adj.get(i);
	
			            newAdjacent.setDist(knownCity.dist+ Double.parseDouble(knownCity.adj.get(j)));
			            newAdjacent.path = knownCity;

			            mapQueue.add(newAdjacent);      
	        		}

	            }

//	        add known vertex to final list	
	    	theCities.put(knownCity.name, knownCity);

//	    	System.out.println(theCities.toString());
			}
    	}	  	
    	pathLength = theCities.get(t).dist;
    	pathNames = printPath(t);
    	
    	DecimalFormat df = new DecimalFormat("0.0");
    	StringPath = pathNames + ": "+df.format(pathLength)+" miles";
    	System.out.println(StringPath);
    }
      

      /*
       * public method to print path string
       */
      public String printPath( String t ){
    	  StringBuilder stringPath = new StringBuilder();
    	  StringBuilder stringPathFull = printPath( t, stringPath );
    	  return stringPathFull.toString();
      }
      
      /*
       * private method to print path string
       */
      private StringBuilder printPath( String t, StringBuilder p ){
    	  Vertex city = theCities.get(t); 
          if( city.path == null ){
             p.append( city.name );
          }
          else{
          printPath( city.path.name, p );
          p.append( " to " );
          p.append( city.name );
          }
          return p;
      }
    	
}