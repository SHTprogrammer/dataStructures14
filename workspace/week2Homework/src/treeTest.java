import java.util.LinkedList;

import java.util.Arrays;
import java.util.Stack;
//import java.util.LinkedList;

public class treeTest
{
	public static void main( String[] args)
	{
		Object operand0 = 5;
		Object operand1 = 3;
		Object operator = "+";
		
		ExpressionTree tree0 = new ExpressionTree(operand0,null,null);		
		ExpressionTree tree1 = new ExpressionTree(operand1,null,null);
		ExpressionTree tree2 = new ExpressionTree(operator,tree0,tree1);

	
		String pInput = "ab+cde+**";
		String[] arrayInput = pInput.split("(?!^)");
		String numInput = "12+345**";

	    
	    treeBuilder builderNew = new treeBuilder();
	    ExpressionTree treeNew = builderNew.build("21/");
	    System.out.println(treeNew);
	    
	    System.out.println(treeNew.prefixPrint());    
	    System.out.println(tree2.prefixPrint());
	    
	   
	  String[] operations = {"+","-","*","/"};
	  
//	  Stack<ExpressionTree> postfix = new Stack<ExpressionTree>();
	  Object nextItem;
	  for (int i=0; i < arrayInput.length; i++)
	  {
		  nextItem = arrayInput[i];
		  
		  if ( Arrays.asList(operations).contains(nextItem) )
			  System.out.println(nextItem+"operator");
		  else
			  System.out.println(nextItem);
	  }
	  
	  
//	  postfix.push(new ExpressionTree(nextItem,null,null)); 
//	  System.out.println(postfix.pop());

	}
}