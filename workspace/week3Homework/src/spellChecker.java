import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class spellChecker {

	myHashTable hashDict = new myHashTable();
	
	/*
	 * Constructor
	 */
	public spellChecker(){
	}
	
	
	
	/*
	 * reads a dictionary text file with one word on each line and adds 
	 * each word to a hash table
	 * @param filename, takes in filepath of dictionary text file
	 */
	public void dictRead(LinkedList<String> lineList){
		
		for (int i=0; i<lineList.size(); i++){
			String nextWord = lineList.get(i).replaceFirst("^[^a-zA-Z']+", "")
    	    	    .replaceAll("[^a-zA-Z']+$", "")
    	    	    .toLowerCase().replace("’","'");
			
		    hashDict.insert(nextWord);
		}
	}
	
	public boolean findWord(String testWord){
		return hashDict.contains(testWord);
	}
	
	/*
	 * Checks words in text file against hash dictionary and returns words not 
	 * found, their line number, and potential fixes in spelling
	 * @param lineList, takes in linked list of lines in a text file
	 */
	public LinkedList<String> checkFile(LinkedList<String> lineList){
		
		LinkedList<String> badWords = new LinkedList<>();
		for (int i=0; i<lineList.size(); i++){
    		
//			iterate through all lines in the file
			String newLine = lineList.get(i);
			StringTokenizer st = new StringTokenizer(newLine);
			
//			iterate through all words in the line
   	        while (st.hasMoreTokens()) {	
   	        	
   	    	     String newWord = st.nextToken();
//   	    	     System.out.println("token"+newWord);
   	    	     newWord = newWord.replaceFirst("^[^a-zA-Z']+", "")
      	    	     .replaceAll("[^a-zA-Z']+$", "").toLowerCase();
   	    	     newWord = newWord.replace("’","'");
//   	    	     System.out.println(newWord);
	    	     
//   	    	 if no match, permute word and print suggestions
   	    	     
   	    	     if (!findWord(newWord)){   
   	    	    	
   	    	    	StringBuilder wordInfo = new StringBuilder(); 
   	    	    	wordInfo.append(newWord);
   	    	    	wordInfo.append(", line "+(i+1));
   	    	    	wordInfo.append(", suggested fix: ");
   	    	    	String fixedWords = wordPermute(newWord);
   	    	    	wordInfo.append(fixedWords);
   	    	    	badWords.add(wordInfo.toString());
   	    	     }
   	        }
   	    }
   	    if (lineList.isEmpty())
   	    	System.out.println("Spell check found no errors");
   	    
   	    return badWords;			
	}
	
	
	/*
	 * Checks permutations of a word not in the dictionary to try and 
	 * find a match
	 * Adds a letter at each position, removes each letter, and swaps each 
	 * letter pair
	 * @param badWord, takes in a string of a word not in the dictionary
	 */
    public String wordPermute(String badWord){
    	TreeSet<String> wordResults = new TreeSet<>();
    	
//    	first do add character permutations
    	for (int i = 0; i< badWord.length() + 1; i++){
	        for (char abet ='a'; abet<= 'z'; abet++){
	        	StringBuilder c = new StringBuilder(badWord);
	        	c.insert(i, abet);
	        	if (findWord(c.toString())){	        		
	        		if (!wordResults.contains(c.toString()))
	        		    wordResults.add(c.toString());
	        	}
	        }
    	}
//    	then do remove character permutations
    	for (int i = 0; i< badWord.length(); i++){
	        StringBuilder c = new StringBuilder(badWord);
	        c.deleteCharAt(i);
	        if (findWord(c.toString())){
	        	if (!wordResults.contains(c.toString()))
	        	    wordResults.add(c.toString());
	        }
    	}   	
//    	then do letter swap permutations
    	for (int i=0; i<badWord.length() -1;i++ ){
    		StringBuilder c = new StringBuilder(badWord);
    		char tmp = c.charAt(i);
    		c.setCharAt(i, c.charAt(i+1));
    		c.setCharAt(i+1,tmp);
    		if (findWord(c.toString())){
	        	if (!wordResults.contains(c.toString()))
	        	    wordResults.add(c.toString());
	        }
    	}   
    	String wOut;
    	if (wordResults.isEmpty())
    		wOut = "N/A";
    	else
    		wOut = wordResults.toString().substring(1,wordResults.toString().length()-1);
    	return wOut;
    }
    
}
	
	