// compares two Rectangle based on their areas and returns a negative integer,
// zero, or a positive integer as the first is less than, equal to, or greater
// than the second 

import java.util.Comparator;

class AreaCompare implements Comparator<Rectangle>
{
	public int compare(Rectangle lhs, Rectangle rhs)
	{
		Integer areaL = lhs.getWidth() * lhs.getLength();
		Integer areaR = rhs.getWidth() * rhs.getLength();
		return areaL.compareTo(areaR);

	}
}