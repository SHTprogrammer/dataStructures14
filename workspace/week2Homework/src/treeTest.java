import java.util.Scanner;

public class treeTest
{
	
	/*
	 * Test class for ExpressionTree. Uses scanner to get posfix expression from 
	 * user and converts to tree
	 */
	public static void main( String[] args)
	{   
		
	    System.out.println("Enter postifx expression, without spaces:");
	    Scanner sc = new Scanner(System.in);
	    String rawPostfixIn = sc.next();
	    sc.close();
	    
	    String[] arrayPostfixIn = rawPostfixIn.split("(?!^)");
	    
	    treeBuilder builderNew = new treeBuilder();
	    ExpressionTree userTree = builderNew.build(arrayPostfixIn);
	    System.out.println("Prefix expression:"+userTree.prefixPrint());
	    System.out.println("Infix expression:"+userTree.infixPrint());
	    
	    System.out.println("Expression evaluates to: "+userTree.evaluate());
	        
	}
	

}