import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class cityPairTest{
	
	public static void main( String[] args) throws FileNotFoundException {

//		check for two command line args
	    if(args.length < 2) {
	        System.out.println("Error, need a pairs and a distances file");
		    System.exit(1);
	    }
	    
//	    convert first file into list
	    LinkedList<String>cityPairs = new LinkedList<>();  
	    Scanner sc2 = new Scanner(new FileInputStream(args[0]));
        while (sc2.hasNextLine()) 
        {
              String aString = sc2.nextLine();
              cityPairs.add(aString);
        }
        sc2.close();
        
//		convert second file into list
	    LinkedList<String>cityLoc = new LinkedList<>(); 
	    Scanner sc3 = new Scanner(new FileInputStream(args[1]));
        while (sc3.hasNextLine()) 
        {
              String aString = sc3.nextLine();
              cityLoc.add(aString);
        }
        sc3.close();
		
//		System.out.println(cityPairs.toString());
//		System.out.println(cityLoc.toString());
		
        djikstrasMap djMap1 = new djikstrasMap(cityPairs,cityLoc);
        djMap1.makeVertices();
        
        djMap1.findPath();
		
		
		
		
		
		
		
	}
	
	
}