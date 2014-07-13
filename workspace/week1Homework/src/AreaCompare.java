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