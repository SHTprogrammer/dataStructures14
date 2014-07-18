//import java.util.LinkedList;
//
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

	
		String pInput = "ab+cde+**";
		String[] arrayInput = pInput.split("(?!^)");
		String numInput = "12+345+**";
		String[] numArrayInput = numInput.split("(?!^)");
	    System.out.println(numArrayInput.toString()); 

	    
	    treeBuilder builderNew = new treeBuilder();
	    ExpressionTree treeNew = builderNew.build(arrayInput);
	    
	    ExpressionTree treeNum = builderNew.build(numArrayInput);

	    System.out.println(tree2.prefixPrint());
	    System.out.println(treeNew.prefixPrint()); 
	    System.out.println(treeNum.prefixPrint()); 

	    System.out.println(tree2.infixPrint());
	    System.out.println(treeNew.infixPrint()); 
	    
	}
	

}