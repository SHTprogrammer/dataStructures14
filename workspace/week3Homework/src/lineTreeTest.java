import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class lineTreeTest {

	public static void main(String[] args) throws FileNotFoundException {

//		check for two command line args
	    if(args.length < 1) {
	        System.out.println("Error, need a text file to check");
		    System.exit(1);
	    }
	   
//	    convert first file into list
	    LinkedList<String>fileLines = new LinkedList<>();  
	    Scanner sc2 = new Scanner(new FileInputStream(args[0]));
        while (sc2.hasNextLine()) 
        {
              String aString = sc2.nextLine();
              fileLines.add(aString);
        }
        sc2.close();
		
		AvlTree<String> textTree = makeTextTree(fileLines);
		textTree.printTree();	
		
		}
		
		 

	/*Method to build an AvlTree of words using a LinkedList of text lines
	 * Stores each unique word and the line numbers on which the word appears 
	 */
	public static AvlTree<String> makeTextTree(LinkedList<String> lineList){
		AvlTree<String> wordTree = new AvlTree<>();
		
		for (int i=0; i< lineList.size(); i++){
    		String newLine = lineList.get(i);
    		
//    		turn string into an iterator of words
    		StringTokenizer st = new StringTokenizer(newLine);

    	    while (st.hasMoreTokens()) {	 
    	    	String newWord = st.nextToken();
    	    	 
//    	    	remove punctuation before and after each word (but not inside, or single quotes)
    	    	newWord = newWord.replaceFirst("^[^a-zA-Z']+", "")
    	    	    .replaceAll("[^a-zA-Z']+$", "").toLowerCase();	
    	    	 
//    	    	System.out.println("added "+newWord+", on line "+(i+1));
    	    	wordTree.insert(newWord, i+1);    	 
    	    }
        }
		return wordTree;	
	}
	
}
