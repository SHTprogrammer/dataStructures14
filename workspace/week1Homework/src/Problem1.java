import java.util.Comparator;

class Problem1
{
//	findMax accepts array of rectangles and returns biggest 
//	based on given comparator
	public static Rectangle findMax(Rectangle[ ] arr,
			Comparator<? super Rectangle> cmp )
	{
	  int maxIndex = 0;

	  for(int i=1;i< arr.length;i++)
	    if( cmp.compare( arr[ i ], arr[ maxIndex ] ) > 0 )
	      maxIndex = i;

	  return arr[ maxIndex ];
	}
	
	
	public static void main( String[] args)
	{
		Rectangle r1 = new Rectangle(4,3);
		
//		testing rectangle methods:
//		int l1 = r1.getLength();
//		int w1 = r1.getWidth();
//		System.out.println(l1);
//		System.out.println(w1);
		
		Rectangle r2 = new Rectangle(3,8);
		
//		testing comparator:
//		AreaCompare ac1 = new AreaCompare();
//	    int compareResult = ac1.compare(r1,r2);
//	    if(compareResult > 0) {
//	        System.out.println("obj1 is greater than obj2");
//	     }
//	     else if(compareResult < 0) {
//	        System.out.println("obj1 is less than obj2");
//	     }
//	     else {
//	        System.out.println("obj1 is equal to obj2");
//	     }
	    
		Rectangle r3 = new Rectangle(5,5);
		
	    Rectangle [] testArray = {r1,r2,r3};
	    System.out.print("The largest rectangle by area has the length x width: ");
	    System.out.println( findMax(testArray,new AreaCompare() ).toString());
	    
	    System.out.print("The largest rectangle by perimiter has the length x width: ");
	    System.out.println( findMax(testArray,new PerimCompare() ).toString());
	    
	}
}