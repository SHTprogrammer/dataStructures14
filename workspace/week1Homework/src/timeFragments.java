/* Monica Quaintance mjq2102@columbia.edu
 * Data Structures in Java
 * 
 * Six given code fragments from Weiss text--for testing runtime
 */


public class timeFragments
{
	
	public long fragmentOne(int n)
	{
		long sum = 0;
		for(int i=0; i<n; i++)
			sum++;
		return sum;
	}
	
	public long fragmentTwo(int n)
	{
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j<n; j++)
			    sum++;
		}
		return sum;
	}
	
	public long fragmentThree(int n)
	{
		int sum = 0;
		for(int i = 0; i < n; i++ )
		{
			for(int j = 0; j < n * n; j++ )
				sum++;
		}
		return sum;
	}
	
	public long fragmentFour(int n)
	{
		int sum = 0;
		for(int i = 0; i < n; i++ )
		{
			for(int j = 0; j < i; j++ )
				sum++;
		}
		return sum;
	}
	
	public long fragmentFive(int n)
	{
		long sum = 0;
		for(int i = 0; i < n; i++ )
		{
            for(int j = 0; j < i * i; j++ )
            {
                for(int k = 0; k < j; k++ )
                	sum++;
            }
		}
		return sum;
	}
	
	public long fragmentSix(int n)
	{
		long sum = 0;
		for(int i = 1; i < n; i++ )
		{
            for(int j = 1; j < i * i; j++ )
            {
                if( j % i == 0 )
                {
                    for(int k = 0; k < j; k++ )
                       sum++;
                }
            }
		}
		return sum;
	}
	
}