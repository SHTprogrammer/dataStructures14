import java.util.LinkedList;


public class ExpressionTree {

	public boolean isOperator;
	public Object element;
	public ExpressionTree left;
	public ExpressionTree right;
	
    /*
    * Expression tree constructor, takes in node element and references to left
    * and right expression trees (if leaf node, takes null)
    */
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
	
	/*	
	* returns node element
	*/	
	public Object returnElement()
	{
		return element;
	}

	/*	
	* returns left pointer
	*/
	public ExpressionTree returnLeft()
	{
		return left;
	}
	
	/*	
	* returns right pointer
	*/
	public ExpressionTree returnRight()
	{
		return right;
	}
	
	
    /*	
    * Traverses tree and returns prefix expression equivalent to the ExpressionTree.
    * Returns string.
    */	
	public String prefixPrint()
	{	
		LinkedList<Object> prefix = new LinkedList<Object>();
		prePrintRecurse(prefix);
		StringBuilder prefixOut = new StringBuilder(prefix.size());
		
		for (int i = 0; i < prefix.size(); i++)
			prefixOut.append(prefix.get(i));	
		
		return prefixOut.toString();
	}

	/*	
	* Traverses tree and returns prefix expression equivalent to the ExpressionTree	
	* Inner method, takes in an empty linked list and passes the results back through
	* that list via recursion
	*/	
	private LinkedList<Object> prePrintRecurse(LinkedList<Object> elements)
	{
		elements.add(element);
		if (left != null)
			left.prePrintRecurse(elements);	
		if (right != null)
		    right.prePrintRecurse(elements);		
		return elements;
	}
	
	public String infixPrint()
	{
		LinkedList<Object> infix = new LinkedList<Object>();
		inPrintRecurse(infix);
		StringBuilder infixOut = new StringBuilder(infix.size());
		
		for (int i = 0; i < infix.size(); i++)
			infixOut.append(infix.get(i));
		
		return infixOut.toString();
	}
	
	
	/*
	 * Traverses tree and returns infix expression equivalent to the ExpressionTree.	
	 * Inner method, takes in an empty linked list and passes the results back through
	 * that list via recursion
	 */
	private LinkedList<Object> inPrintRecurse(LinkedList<Object> elements)
	{
		if (element != null)
		{
			if (left == null || right == null)
			    elements.add(element);
			else if (element.equals("+") || element.equals("-"))
			{
				elements.add("(");
			    left.inPrintRecurse(elements);
			    elements.add(element);
			    right.inPrintRecurse(elements);
			    elements.add(")");
			}
			else if(left != null && right != null)
			{
				left.inPrintRecurse(elements);
				elements.add(element);
			    right.inPrintRecurse(elements);
			}
		}
		return elements;
	}
	
	
}