import java.util.Scanner;

//import java.util.LinkedList;
//
//import java.util.Arrays;
//import java.util.Stack;
//import java.util.LinkedList;

public class treeTest
{
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