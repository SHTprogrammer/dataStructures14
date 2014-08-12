import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class spellCheckTest {
	
	public static void main(String[] args) throws FileNotFoundException{
			
//		check for two command line args
	    if(args.length < 2) {
	        System.out.println("Error, need a dictionary and a text file to check");
		    System.exit(1);
	    }
	   
//	    convert first file into list
	    LinkedList<String>dictList = new LinkedList<>();  
	    Scanner sc2 = new Scanner(new FileInputStream(args[0]));
        while (sc2.hasNextLine()) 
        {
              String aString = sc2.nextLine();
              dictList.add(aString);
        }
        sc2.close();
	    
//		convert second file into list
	    LinkedList<String>textList = new LinkedList<>(); 
	    Scanner sc3 = new Scanner(new FileInputStream(args[1]));
        while (sc3.hasNextLine()) 
        {
              String aString = sc3.nextLine();
              textList.add(aString);
        }
        sc3.close();
	    
//      pass two lists to spell checker
		spellChecker check1 = new spellChecker();
		check1.dictRead(dictList);
		
		LinkedList<String> fileResults = 
			check1.checkFile(textList);
		
//		print results
		for (int i=0; i<fileResults.size(); i++){
			System.out.println(fileResults.get(i));
		}	
	}
}
