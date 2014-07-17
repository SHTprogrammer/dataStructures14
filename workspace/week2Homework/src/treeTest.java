//import java.util.Arrays;
//import java.util.Stack;
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
		
		System.out.println(tree0.element+", "+tree0.left+", "+tree0.right);
		System.out.println(tree2.element+", "+tree2.left+", "+tree2.right);
	
		String pInput = "ab+cde+**";
//	    LinkedList<Object> postfix = new LinkedList<Object>();
//	    Object listAdd;
//	    for (int i=0; i < pInput.length(); i++)
//	    {
//	    	listAdd = pInput.charAt(i); 
//	        postfix.add(listAdd);
//	    }
	    
	    treeBuilder builderNew = new treeBuilder();
	    ExpressionTree treeNew = builderNew.build(pInput);
	    System.out.println(treeNew);
	    
//		String[] operations = {"+","-","*","/"};
//		if ( Arrays.asList(operations).contains("+") )
//		{
//			System.out.println("+"+" is in array");
//		}
	
//        Stack<ExpressionTree> postfix = new Stack<ExpressionTree>();
//		Object nextItem;
//		nextItem = pInput.charAt(0);
//		if 	( Arrays.asList(operations).contains(nextItem) )
//		{
//			System.out.println("operator");
//		}
//		else
//		    postfix.push(new ExpressionTree(nextItem,null,null));
//		
//	
//	    System.out.println(postfix.pop());
	}
}