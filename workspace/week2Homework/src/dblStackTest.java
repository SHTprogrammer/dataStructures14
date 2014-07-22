public class dblStackTest
{
	
	public static void main (String[] args)
	{
		doubleStack stack1 = new doubleStack(4);
		stack1.leftPush("cat");
		System.out.println(stack1.leftPop());
//		too few
//		System.out.println(stack1.leftPop());

		stack1.leftPush("cat");
		stack1.leftPush("another cat");
	    stack1.rightPush("parakeet");
	    
	    System.out.println(stack1.rightPop());

	    stack1.rightPush("Cthulu");
	    System.out.println(stack1.printLeft());
	    System.out.println(stack1.printRight());

	    stack1.rightPush("babelfish");
//	    stack1.rightPush("too many");

	    System.out.println(stack1.printRight());

	}
	
}