import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class palindromeTest
{
	/*
	 * Test class for palindrome finder. Uses scanner to read a text file and uses 
	 * PalindromeFinder to evaluate each line as palindrome
	 */
	public static void main( String[] args)
	{   	
	    LinkedList<String> fileRead = BuffRead("palindromes.txt");	    
	    PalindromeFinder palCheck = new PalindromeFinder();

        for (int i =0;i < fileRead.size(); i++)
        {
        	String currentLine = fileRead.get(i);
        	if (palCheck.evaluate(currentLine)==true)
        	    System.out.println("IS a palindrome: '"+currentLine+"'");
        }	   
	}
	
	
    /*
     * File reader using Scanner. Takes in text file and adds all lines as individual 
     * Strings to a Linked List
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
}
