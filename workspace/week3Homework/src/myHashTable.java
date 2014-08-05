
public class myHashTable {

	public myHashTable(){
		this (MYTABLESIZE);
	}
	
	public myHashTable(int size){
		makeArray(size);
		myClear();
	}
	
	public boolean insert (String x){
		
		int thisPos = findPos(x);
		if(isActive( thisPos))
		    return false;
		
	    array[thisPos] = new HashEntry<>(x,true);
	    theSize++;
	    
	    if(++occupied > array.length/2)
	    	rehash(); 
	    return true;  
	}
	
	private void rehash(){
		HashEntry<String> [] oldArray = array;
		
		makeArray(2 * oldArray.length);
		occupied = 0;
		theSize = 0;
		
        for( HashEntry<String> entry : oldArray )
            if( entry != null && entry.isActive )
                insert( entry.element );
	}
	
	private int findPos( String x)
	{
		int offset = 1;
		int thisPos = myhash(x);
		
		while(array[thisPos]!=null &&
				!array[thisPos].element.equals(x)){
			thisPos += offset;
			offset += 2;
			if( thisPos >= array.length)
				thisPos -= array.length;
		}
		return thisPos;
	}
	
    public boolean remove( String x )
    {
        int thisPos = findPos( x );
        if( isActive( thisPos ) )
        {
            array[ thisPos ].isActive = false;
            theSize--;
            return true;
        }
        else
            return false;
    }
	
    public int size( )
    {
        return theSize;
    }
    
    public int capacity( )
    {
        return array.length;
    }
    
    public boolean contains( String x )
    {
        int thisPos = findPos( x );
        return isActive( thisPos );
    }
	
    private boolean isActive( int thisPos )
    {
        return array[ thisPos ] != null && array[ thisPos ].isActive;
    }
    
    public void makeEmpty( )
    {
        myClear( );
    }
	
    private void myClear( )
    {
        occupied = 0;
        for( int i = 0; i < array.length; i++ )
            array[ i ] = null;
    }
	
    private int myhash( String x )
    {
        int hashVal = x.hashCode( );

        hashVal %= array.length;
        if( hashVal < 0 )
            hashVal += array.length;

        return hashVal;
    }
    
    @SuppressWarnings("hiding")
	private static class HashEntry<String>
    {
        public String  element;   // the element
        public boolean isActive;  // false if marked deleted

        @SuppressWarnings("unused")
		public HashEntry( String e )
        {
            this( e, true );
        }

        public HashEntry( String e, boolean i )
        {
            element  = e;
            isActive = i;
        }
    }
    
    private static final int MYTABLESIZE = 113;
    private HashEntry<String> [ ] array;
    private int occupied;
    private int theSize; 
    
    @SuppressWarnings("unchecked")
	private void makeArray( int arraySize ) {
        array = new HashEntry[ nextPrime( arraySize ) ];
    }
    
    private static int nextPrime( int n ){
        if( n % 2 == 0 )
            n++;

        for( ; !isPrime( n ); n += 2 )
            ;
        return n;
    }


    private static boolean isPrime( int n ){
        if( n == 2 || n == 3 )
            return true;
        if( n == 1 || n % 2 == 0 )
            return false;
        for( int i = 3; i * i <= n; i += 2 )
            if( n % i == 0 )
                return false;
        return true;
    }
    
    
    
    
}
