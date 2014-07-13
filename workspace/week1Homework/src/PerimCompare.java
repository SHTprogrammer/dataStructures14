// compares two Rectangle based on their areas and returns a negative integer,
// zero, or a positive integer as the first is less than, equal to, or greater
// than the second 

import java.util.Comparator;

class PerimCompare implements Comparator<Rectangle>
{
	public int compare(Rectangle lhs, Rectangle rhs)
	{
		Integer perimL = (lhs.getWidth() + lhs.getLength())*2;
		Integer perimR = (rhs.getWidth() + rhs.getLength())*2;
		return perimL.compareTo(perimR);

	}
}