public class PalindromeFinder
{
	public PalindromeFinder()
	{		
	}
	
	public boolean evaluate(String rawPalindrome)	    
	{	
	    String palIn = rawPalindrome.replaceAll("\\W","").toLowerCase();
	    MyStack<String> palindromeStack = new MyStack<>();
	    int stackDepth = 0;
	    
	    for (int i = 0; i< palIn.length()/2; i++)
	    {
	    	String newItem = String.valueOf(palIn.charAt(i));
	    	palindromeStack.push(newItem);
	    	stackDepth++;
	    }
	    		    	    	    
	    int startIndex = stackDepth;
	    if (palIn.length() %2 != 0)
	    	startIndex++;
	    
	    for (int i = startIndex; i < palIn.length(); i++)
        {
        	String rightItem = String.valueOf(palIn.charAt(i));
        	String leftItem = palindromeStack.pop();
        	if (leftItem.compareTo(rightItem) != 0)
        		return false;
        }	
        return true;
	}
	
	
	
	
}