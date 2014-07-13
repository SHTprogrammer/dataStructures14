class Problem1
{
	public static void main( String[] args)
	{
		Rectangle r1 = new Rectangle(1,5);
		int l1 = r1.getLength();
		int w1 = r1.getWidth();
		System.out.println(l1);
		System.out.println(w1);
		
		Rectangle r2 = new Rectangle(2,6);
		AreaCompare ac1 = new AreaCompare();
	    int compareResult = ac1.compare(r1,r2);
	    if(compareResult > 0) {
	        System.out.println("obj1 is greater than obj2");
	     }
	     else if(compareResult < 0) {
	        System.out.println("obj1 is less than obj2");
	     }
	     else {
	        System.out.println("obj1 is equal to obj2");
	     }
	    
	}
}