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