import java.util.LinkedList;


public class ExpressionTree {

	public boolean isOperator;
	public Object element;
	public ExpressionTree left;
	public ExpressionTree right;
	
	public ExpressionTree(Object e, ExpressionTree lET, ExpressionTree rET)
	{
		element = e;
		if (element instanceof Integer)
			isOperator = false;
		else 
			isOperator = true;
		left = lET;
		right = rET;
		
	}
	
	
	public Object returnElement()
	{
		return element;
	}
	
	public ExpressionTree returnLeft()
	{
		return left;
	}
	
	public ExpressionTree returnRight()
	{
		return right;
	}
	
	
/*	
*	Traverses tree and returns prefix expression equivalent to the ExpressionTree
*/	
	public LinkedList<Object> prefixPrint()
	{	
		LinkedList<Object> prefix = new LinkedList<Object>();
		prePrintRecurse(prefix);
		return prefix;
	}

	private LinkedList<Object> prePrintRecurse(LinkedList<Object> elements)
	{
		elements.add(element);
		if (left != null)
			left.prePrintRecurse(elements);
		
		if (right != null)
		    right.prePrintRecurse(elements);
		
		return elements;
	}
	
}