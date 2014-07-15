/* Monica Quaintance mjq2102@columbia.edu
 * Data Structures in Java
 * 
 * Tests six given code fragments and gets runtimes for varying values of n
 */




public class timeTest
{
    public static TimeInterval timer = new TimeInterval();
    
    public static void main( String[] args)
    {
    	
    	int [] nVals = {500,1000,5000,10000};
    	
    	timeFragments testFrag = new timeFragments();
    	
//    	fragment one
    	for (int i = 0; i < nVals.length; i++)
    	{
    	    timer.startTiming();
    	    long sum1 = testFrag.fragmentOne(nVals[i]);
    	    timer.endTiming();
    	    double time1 = timer.getElapsedTime(); 	
    	    System.out.println("N = "+nVals[i]+", sum is "+sum1+", time is "+time1);		
        }
    	
//    	fragment two
    	for (int i = 0; i < nVals.length; i++)
    	{
    	    timer.startTiming();
    	    long sum1 = testFrag.fragmentTwo(nVals[i]);
    	    timer.endTiming();
    	    double time1 = timer.getElapsedTime(); 	
    	    System.out.println("N = "+nVals[i]+", sum is "+sum1+", time is "+time1);		
        }
    	
//    	fragment three
    	for (int i = 0; i < nVals.length; i++)
    	{
    	    timer.startTiming();
    	    long sum1 = testFrag.fragmentThree(nVals[i]);
    	    timer.endTiming();
    	    double time1 = timer.getElapsedTime(); 	
    	    System.out.println("N = "+nVals[i]+", sum is "+sum1+", time is "+time1);		
        }
    
//    	fragment four
    	for (int i = 0; i < nVals.length; i++)
    	{
    	    timer.startTiming();
    	    long sum1 = testFrag.fragmentFour(nVals[i]);
    	    timer.endTiming();
    	    double time1 = timer.getElapsedTime(); 	
    	    System.out.println("N = "+nVals[i]+", sum is "+sum1+", time is "+time1);		
        }
    	
//    	fragment five
    	for (int i = 0; i < nVals.length; i++)
    	{
    	    timer.startTiming();
    	    long sum1 = testFrag.fragmentFive(nVals[i]);
    	    timer.endTiming();
    	    double time1 = timer.getElapsedTime(); 	
    	    System.out.println("N = "+nVals[i]+", sum is "+sum1+", time is "+time1);		
        }
    	
//    	fragment six
    	for (int i = 0; i < nVals.length; i++)
    	{
    	    timer.startTiming();
    	    long sum1 = testFrag.fragmentSix(nVals[i]);
    	    timer.endTiming();
    	    double time1 = timer.getElapsedTime(); 	
    	    System.out.println("N = "+nVals[i]+", sum is "+sum1+", time is "+time1);		
        }
    	
  } 
}