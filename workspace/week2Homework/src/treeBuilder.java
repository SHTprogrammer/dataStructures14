import java.util.Arrays;
import java.util.Stack;


public class treeBuilder
{
	Stack<ExpressionTree> postfix = new Stack<ExpressionTree>();
	String[] operations = {"+","-","*","/"};

	public treeBuilder(){
	}
	
	public ExpressionTree build(String p)
	{
		Object nextItem;
		ExpressionTree operand0;
		ExpressionTree operand1;
		
//		for all elements in the postfix expressions
	    for (int i=0; i < p.length(); i++)
	    {
	    	nextItem = p.charAt(i); 
	    	
//	    	if the element is in the operations list, pop two trees and make a new tree
	    	if ( Arrays.asList(operations).contains(nextItem) )
	    	{
	    		operand1 = postfix.pop();
	    	    operand0 = postfix.pop();
	    	    postfix.push(new ExpressionTree(nextItem,operand0,operand1));
	    	}
	    	
//	    	else, must be either a variable or a number, so put in an expression tree 
//	    	and push onto stack
	    	else
	    	    postfix.push(new ExpressionTree(nextItem,null,null));
	    }	
		
		return postfix.pop();
	}
}