import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class lineFindTest {

	public static void main(String[] args) {

		System.out.println("Enter the filepath for a text file you would like to scan:");
		Scanner sc = new Scanner(System.in);
		String filenameIn = sc.next();
		sc.close();
		
		LinkedList<String> fileLines = BuffRead(filenameIn);
		
		AvlTree<String> textTree = makeTextTree(fileLines);
		textTree.printTree();
				
		}
		
		
	/*
	 * Method to buffer read in a text file and turn each line into a LinkedList
	 * Uses Scanner utility
	 */
	public static LinkedList<String> BuffRead(String filename)
	{	 
		    LinkedList<String>palFileArray = new LinkedList<>();
		    
		    try {
		    	Scanner sc2 = new Scanner(new File(filename));
		        while (sc2.hasNextLine()) 
		        {
		              String aString = sc2.nextLine();
		              palFileArray.add(aString);
		        }
		        sc2.close();
		    } 
		    catch (IOException e)
		    {
		    	System.out.println("fileNotFound");
		    }
		    return (palFileArray);
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
