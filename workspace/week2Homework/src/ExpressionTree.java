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
    * User-exposed prefix print method. Traverses tree and returns prefix expression 
    * equivalent to the ExpressionTree, returns result expression as string.
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
	* Inner method, traverses tree and returns prefix expression equivalent to the 
	* ExpressionTree. Takes in an empty linked list and passes the results back through
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
	
	/*
	 * User-exposed method to print infix expression. Creates empty LinkedList
	 * to pass to the private recursive infix print method and returns expression as string
	 */
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
	 * Inner method, traverses tree and returns infix expression equivalent 
	 * to the ExpressionTree, takes in an empty linked list and passes the results 
	 * back through that list via recursion
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
	
	/*
	 * Method to evaluate the expression tree, assumes initial postfix expression 
	 * used in tree construction contained elements that can be parsed as doubles.
	 */
	public Double evaluate()
	{    
		Double left_val;
		Double right_val;
		Double nValue;
		
		if (left != null && right != null)
		{
			left_val = left.evaluate();
			right_val = right.evaluate();
			
			if (element.equals("+"))
			{
				nValue = Double.valueOf(left_val.doubleValue()+
					right_val.doubleValue());	
			}
			else if (element.equals("-"))
			{
				nValue = Double.valueOf(left_val.doubleValue()-
					right_val.doubleValue());
			}
			else if (element.equals("*"))
			{
				nValue = Double.valueOf(left_val.doubleValue()*
					right_val.doubleValue());
			}
			else
			{
				nValue = Double.valueOf(left_val.doubleValue()/
					right_val.doubleValue());
			}
			return nValue;
		}
		else
		{
			Double nodeValue = Double.parseDouble(element.toString());
			return nodeValue;
		}
	}
	
}