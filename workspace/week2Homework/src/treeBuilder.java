import java.util.Arrays;

public class treeBuilder
{
	MyStack<ExpressionTree> expStack = new MyStack<ExpressionTree>();
	String[] operations = {"+","-","*","/"};

	public treeBuilder(){
	}
	
	public ExpressionTree build(String[] p)
	{
		Object nextItem;
		ExpressionTree operand0;
		ExpressionTree operand1;
		
//		for all elements in the postfix expression
	    for (int i=0; i < p.length; i++)
	    {
	    	nextItem = p[i]; 
	    	
//	    	if the element is in the operations list, pop two trees and make a new tree
	    	if ( Arrays.asList(operations).contains(nextItem) )
	    	{
	    		operand1 = expStack.pop();
	    	    operand0 = expStack.pop();
	    	    expStack.push(new ExpressionTree(nextItem,operand0,operand1));
	    	}
	    	
//	    	else, must be either a variable or a number, so put in an expression tree 
//	    	and push onto stack
	    	else
	    	    expStack.push(new ExpressionTree(nextItem,null,null));
	    }	
		
		return expStack.pop();
	}
}