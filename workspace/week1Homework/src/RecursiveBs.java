public class RecursiveBs
{
	
	public static int search(int[] a, int k)
	{
		  int start = 0;
		  int end = a.length - 1;
		  int result = recursiveInner(a,k,start,end);
		  return result;
	}
	
	public static int recursiveInner(int[] a, int k, int start, int end)
	{
		  // if the indices are crossed, stop searching (way out #1)
		  if (start > end){
		      return -1;
		  }
		// find the midpoint (round down)
		  int mid = (start+end)/2;

		  // success (way out #2)
		  if (a[mid] == k){
		    return mid;
		  }

		  // if target is less than mid, increment end and go deeper

		  else if(k < a[mid]){
		    end = mid -1;
		    int result = recursiveInner(a,k,start,end);
		    return result;
		  }

		  // if target is less than mid, increment end and go deeper
		  else {
		    start = mid +1;
		    int result = recursiveInner(a,k,start,end);
		    return result;
		  }
	}
}