// Generic findMax, with a function object.
// Precondition: a.size( ) > 0.

public static Rectangle findMax(Rectangle[ ] arr, Comparator<? super Rectangle> cmp )
{
  int maxIndex = 0;

  for(inti=1;i<arr.size();i++)
    if( cmp.compare( arr[ i ], arr[ maxIndex ] ) > 0 )
      maxIndex = i;

  return arr[ maxIndex ];
}