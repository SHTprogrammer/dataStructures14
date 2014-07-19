//import java.util.Scanner;

public class palindromeTest
{
	public static void main( String[] args)
	{   	
//	    Scanner sc = new Scanner(System.in);
//	    String rawPalindrome = sc.next();
	    
	    String pal1 = "Don't nod";
	    String pal2 = "Don't noid";
	    String pal3 = "a man, a plan, a canal, Panama";
	    String pal4 = "heeh";
	    PalindromeFinder palCheck = new PalindromeFinder();
	    System.out.println(palCheck.evaluate(pal1));
	    System.out.println(palCheck.evaluate(pal2));
	    System.out.println(palCheck.evaluate(pal3));
	    System.out.println(palCheck.evaluate(pal4));

	    
	}
	
}