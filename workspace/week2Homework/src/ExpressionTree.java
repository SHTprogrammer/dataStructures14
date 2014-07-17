
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
	
}
