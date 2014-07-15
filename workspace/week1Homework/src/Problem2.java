/* Monica Quaintance mjq2102@columbia.edu
 * Data Structures in Java
 * 
 * Tests recursive binary search on arrays of different sizes 
 * and different targets
 */


class Problem2
{
	public static void main( String[] args)
	{
		int[] array1 = {1,2,3,4,5};
		int k0 = 0;
		int k1 = 2;
		int k2 = 5;
		int k3 = 6;
		int[] array2 = {2,4,6,8};
		int[] array3 = {0};
		
		System.out.println(RecursiveBs.search(array1, k0));
		System.out.println(RecursiveBs.search(array1, k1));
		System.out.println(RecursiveBs.search(array1,k3));
		System.out.println(RecursiveBs.search(array2,k2));
		System.out.println(RecursiveBs.search(array2,k3));
		System.out.println(RecursiveBs.search(array3,k1));
		
	}
}